package aurorasolutions;

import java.util.Scanner;
import java.util.Stack;

public class ArrayChallenge {


    // Find the previous smaller element for every array element
    public static void findPrevSmaller(int[] arr) {
        // base case
        if (arr == null || arr.length == 0) {
            return;
        }

        // create an empty stack
        Stack<Integer> s = new Stack<>();

        // do for each element
        for (int j : arr) {
            // loop till stack is empty
            while (!s.empty()) {
                // If the stack's top element is less than the current element,
                // it is the previous smaller element
                if (s.peek() < j) {
                    System.out.print(s.peek() + " ");
                    break;
                }
                // remove the stack's top element is less if it is greater or equal
                // to the current element
                else {
                    s.pop();
                }
            }

            // If the stack becomes empty, all elements to the left
            // of the current element are greater
            if (s.empty()) {
                System.out.print(-1 + " ");
            }

            // push current element into the stack
            s.push(j);
        }
    }

    public static String ArrayChallenge(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i < result.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // keep this function call here
//        int[] arr = new int[]{5, 3, 1, 9, 7, 3, 4, 1};
        int[] arr = new int[]{5, 3, 1, 9, 7, 3, 4, 1};
        System.out.println(ArrayChallenge(arr));

        findPrevSmaller(arr);
    }

}
