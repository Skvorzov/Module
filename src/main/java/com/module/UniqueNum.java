package com.module;
import java.util.Arrays;

public class UniqueNum {
    public int getUnique(int[] array) {
        int[] arr = new int[array.length];
        Arrays.sort(arr);
        int counter = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                counter++;
            }
        }
        return counter;
    }
}