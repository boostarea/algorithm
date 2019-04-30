package main.java.com.ooooor;

/**
 * @Description 查找第一个大于等于给定值的元素
 * @Author ooooor
 * @Date 2019-04-30 09:38
 **/
public class FirstGeBinariySearch {
    private static int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid =  low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if ((mid == 0) || (a[mid - 1] < value)) return mid;
                else high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 4, 6};
        System.out.println(bsearch(a, a.length, 4));
    }

}
