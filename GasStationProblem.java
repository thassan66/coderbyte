package coderbyte;

public class GasStationProblem {
    //#define arrSize(arr) (sizeof((arr))/sizeof((arr)[0])) // Creating an easy way to get the size of an array for passing to functions

    public static String GasStation(String[] strArr) {
        int[] fuel = new int[strArr.length - 1];
        int[] cost = new int[strArr.length - 1];
        int totalCost = 0;
        int totalFuel = 0;
        for (int pos = 1; pos < strArr.length; pos++) {
            String[] tmpStr = strArr[pos].split(":");
            fuel[pos - 1] = Integer.parseInt(tmpStr[0]);
            totalFuel = totalFuel + fuel[pos - 1];
            if (tmpStr.length > 1) {
                cost[pos - 1] = Integer.parseInt(tmpStr[1]);
                totalCost = totalCost + cost[pos - 1];
            }
        }

        int start = 0;
        int end = 1;
        int curr_petrol = fuel[start] - cost[start];

        int n = fuel.length;
        // If current amount of petrol in truck becomes less than 0, then
        // remove the starting petrol pump from tour
        while (end != start || curr_petrol < 0) {

            // If current amount of petrol in truck becomes less than 0, then
            // remove the starting petrol pump from tour
            while (curr_petrol < 0 && start != end) {
                // Remove starting petrol pump. Change start
                curr_petrol -= fuel[start] - cost[start];
                start = (start + 1) % n;

                if (start == 0)
                    return String.valueOf("Impossible");
            }
            curr_petrol += fuel[end] - cost[end];

            end = (end + 1) % n;
        }
        // Return starting point
        start = start + 1;
        return String.valueOf(start);
    }


  /* private static String visitAllSations(petrolPump arr[], int n) {
        int start = 0;
        int end = 1;
        int curr_petrol = arr[start].petrol - arr[start].distance;

        // If current amount of petrol in truck becomes less than 0, then
        // remove the starting petrol pump from tour
        while (end != start || curr_petrol < 0) {

            // If current amount of petrol in truck becomes less than 0, then
            // remove the starting petrol pump from tour
            while (curr_petrol < 0 && start != end) {
                // Remove starting petrol pump. Change start
                curr_petrol -= arr[start].petrol - arr[start].distance;
                start = (start + 1) % n;

                if (start == 0)
                    return  String.valueOf("Impossible");
            }
            curr_petrol += arr[end].petrol - arr[end].distance;

            end = (end + 1) % n;
        }

        // Return starting point
        return String.valueOf(start);
    }*/


    public static void main(String[] args) {
        String a[] = {"2", "1:2", "1:2"}; // Input array, could be modified to take from cin or a file
        String b[] = {"4", "1:1", "2:2", "1:2", "0:1"};
        String c[] = new String[]{"4", "0:1", "2:2", "1:2", "1:1"};
        String d[] = new String[]{"3", "2:3", "2:1", "4:4"};
        String e[] = new String[]{"5", "3:3", "1:2", "2:2", "3:2", "4:3"};
        String f[] = new String[]{"5", "0:1", "2:1", "3:2", "4:6", "4:3"};
        String g[] = new String[]{"6", "3:2", "2:2", "10:6", "0:4", "1:1", "30:10"};
        String h[] = new String[]{"5", "2:3", "2:3", "2:3", "500:1", "0:495"};


        System.out.println(GasStation(a));
        System.out.println(GasStation(b));
        System.out.println(GasStation(c));
        System.out.println(GasStation(d));
        System.out.println(GasStation(e));
        System.out.println(GasStation(f));
        System.out.println(GasStation(g));
        System.out.println(GasStation(h));



   /* static class petrolPump {
        int petrol;
        int distance;

        // constructor
        public petrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }*/
    }
}