package com.nuaa.main.sort;

public class QuickSort {

    public static void quick_sort(int[] arr, int l, int r) {
        if (l < r) {
            int i = l, j = r, x = arr[l];
            while (i < j) {
                while (i < j && arr[j] >= x) j--;
                if (i < j) arr[i++] = arr[j];
                while (i < j && arr[i] < x) i++;
                if (i < j) arr[j--] = arr[i];
            }
            arr[i] = x;
            quick_sort(arr, l, i - 1);
            quick_sort(arr, i + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{2, 3, 4, 11, 2, 111, 342, 534, 21, 23, 32, 42, 6};
        quick_sort(arrays, 0, arrays.length - 1);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }

}
