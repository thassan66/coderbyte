package coderbyte;

import java.util.Scanner;

public class Palindrome {
    public static String Palindrome(String str) {


        String strReverse = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            strReverse = strReverse + str.charAt(i);
        }
        if (str.replaceAll("\\s", "").equals(strReverse.replaceAll("\\s", ""))) {
            str = "true";
        } else {
            str = "false";
        }
        return str;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Palindrome(s.nextLine()));
    }
}
