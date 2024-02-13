package com.proftelran.org.lessontwentyfour;

public class ArrayOperation {
    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        int max = arr[0];
        for (int elm : arr) {
            max = Math.max(max, elm);
        }
        return max;
    }

    public int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        int min = arr[0];
        for (int elm : arr) {
            min = Math.min(min, elm);
        }
        return min;
    }
}
