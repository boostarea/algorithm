package org.example;

import java.util.Arrays;

/**
 * @Description 选择排序，不稳定
 * @Author ooooor
 * @Date 2019-04-28 16:50
 **/
public class SelectionSort {

    // 数据交换位置
    private static void selectionSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n ; i++) {
            int index = i;
            for (int j = i; j < n; j++) {
                if (a[j] < a[index]) //找到最小的数
                    index = j; //将最小数的索引保存
            }

            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 5, 6, 3, 2};
        selectionSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

}
