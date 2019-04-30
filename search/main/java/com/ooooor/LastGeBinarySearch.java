package main.java.com.ooooor;

/**
 * @Description 查找最后一个小于等于给定值的元素
 * @Author ooooor
 * @Date 2019-04-30 09:41
 **/
public class LastGeBinarySearch {

    private static int bsearch(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid =  low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                if ((mid == n - 1) || (a[mid + 1] > value)) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 4, 6};
        System.out.println(bsearch(a, a.length, 4));
    }

}
