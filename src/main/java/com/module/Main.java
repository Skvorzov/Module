package com.module;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 5, 1, 1, 3};
        Arrays.sort(arr);
        int counter = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}