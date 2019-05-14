package com.ooooor;

import java.util.Arrays;

/**
 * @Description 插入排序
 * @Author ooooor
 * @Date 2019-04-28 16:29
 **/
public class InsertionSort {

    // 插入排序，a 表示数组，n 表示数组大小
    private static void insertionSort(int[] a, int n) {
        if (n <= 1) return;

        //首数据默认为有序区间
        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j+1] = a[j];  // 数据向后挪动，精妙
                } else {
                    break;
                }
            }
            a[j+1] = value; // 插入数据
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 5, 6, 3, 2};
        insertionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
