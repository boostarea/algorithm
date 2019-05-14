package com.ooooor;

import java.util.Arrays;

/**
 * @Description 快速排序
 * @Author ooooor
 * @Date 2019-04-29 09:49
 **/
public class QuickSort {

    // 快速排序，a是数组，n表示数组的大小
    private static void quickSort(int[] a, int n) {
        quickSortInternally(a, 0, n-1);
    }

    // 快速排序递归函数，p,r为下标
    private static void quickSortInternally(int[] a, int p, int r) {
        if (p >= r) return;

        int q = partition(a, p, r); // 获取分区点
        quickSortInternally(a, p, q-1);
        quickSortInternally(a, q+1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;

        // 保证空间复杂度在O(1)
        // 极其巧妙，i为要最终与pivot交换的点，j为右边未处理区
        for(int j = p; j < r; ++j) {
            if (a[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    int tmp = a[i];
                    a[i++] = a[j];  //骚气的++
                    a[j] = tmp;
                }
            }
            // 遇到大于的值，j++，i停滞
        }
        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;

        return i;
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 5, 6, 3, 2};
        quickSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
