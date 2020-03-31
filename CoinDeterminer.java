package coderbyte;

public class CoinDeterminer {
    public int CoinDeterminer(int num) {
            int minValue = Integer.MAX_VALUE;
            for (int i = coins.length - 1; i >= 0; i--) {
                for (int j = i; j >= 0; j--) {
                    int count = calculateCount(num, i, j);
                    if (count < minValue) {
                        minValue = count;
                    }
                }
            }

            return minValue;
        }
        final int[] coins = new int[]{1, 5, 7, 9, 11};


        private int calculateCount ( int num, int max, int start){
            int count = 0;

            if (num >= coins[max]) {
                num -= coins[max];
                count++;
            }

            for (int i = start; i >= 0; i--) {
                while (num >= coins[i]) {
                    num -= coins[i];
                    count++;
                }
            }
            return count;
        }

        public static void main (String[]args){
            CoinDeterminer c = new CoinDeterminer();
            System.out.print(c.CoinDeterminer(6));
        }
    }
