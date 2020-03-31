package coderbyte;

import java.util.Arrays;


public class StringScramble {

    public static String StringScramble(String str1, String str2) {
        str1 = str1.replaceAll("^\\d+\\.", "");
        str2 = str2.replaceAll("^\\d+\\.", "");
    /*    if (str1.length() != str2.length()) {
            return "false";
        }*/ // comment this portion to check string with different greater length

        if (str1.length() == 0 || str1.equals(str2)) {
            return "true";

        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
//        if (!new String(arr1).equals(new String(arr2))) {
//            return "false";
//        }
        int str1Length = str1.length();
        int str2Length = str2.length();
        for (int i = 1; i < str1.length(); i++) {
            String str11 = str1.substring(0, i);
            String str12 = str1.substring(i, str1Length);
            String str21 = str2.substring(0, i);
            String str22 = str2.substring(i, str2Length);
            String str23 = str2.substring(0, str2.length() - i);
            String str24 = str2.substring(str2.length() - i, str2Length);

            if (StringScramble(str11, str21) == "true") {
                if (StringScramble(str12, str22) == "true") {
                    return "true";
                }
            }
            if (StringScramble(str11, str24) == "true") {
                if (StringScramble(str11, str24) == "true") {
                    return "true";

                }
            }
        }

        return str1;
    }

    public static String isScramble(String str1, String str2) {
        str1 = str1.replaceAll("^\\d+\\.", "");
        str2 = str2.replaceAll("^\\d+\\.", "");

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        char[] tmp1= new char[arr2.length];
         String flag = "false";
        int count = 0;
        for (int pos = 0; pos < arr2.length; ++pos) {
            for (int i = 0; i < arr1.length; ++i) {
                if(arr1[i] == arr2[pos]){
                    tmp1[pos] = arr1[i];
                    arr1[i] = 0;
                    break;
                }
            }
            if (Arrays.equals(tmp1,arr2)) {
                  flag = "true";
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        // keep this function call here
        System.out.print(isScramble("win33er", "winner"));
    }

}