package aurorasolutions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAddition {
    String ArrayAddition(int[] arr) {
        Arrays.sort(arr);

        int highestNum = arr[arr.length - 1];
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (i != j) {
                    sum += arr[j];
                    if (sum == highestNum) {
                        return "true";
                    }
                }
            }
            for (int k = 0; k < arr.length - 1; k++) {
                if (i != k) {
                    sum -= arr[k];
                    if (sum == highestNum) {
                        return "true";
                    }
                }
            }
            sum = 0;
        }

        return "false";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        ArrayAddition c = new ArrayAddition();
        System.out.println(c.ArrayAddition(new int[]{5,7,16,1,2}));
        System.out.println(c.ArrayAddition(new int[]{4, 6, 23, 10, 1, 3}));
        System.out.println(c.ArrayAddition(new int[]{3,5,-1,8,12}));
    }
}
