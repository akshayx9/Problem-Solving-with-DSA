package Step1_5_BasicRecursion;

import java.util.Scanner;

/* 
Problem Statement

You are given an integer 'n'. Your task is to 
return an array containing integers from 'n' to 1 
(in increasing order) without using loops. */

public class PrintNumsReverse {
    public static int[] printNos(int x) {
        int[] result = new int[x];
        addNos(x, result, 0);
        return result;
    }

    private static void addNos(int current, int[] result, int index) {
        if (current >= 1) {
            result[index] = current;
            addNos(current - 1, result, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        int[] arr = printNos(x);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        s.close();
    }
}
