package Cursor.LS2;

import java.util.Arrays;

public class ReverseOrder {
    public static void main(String[] args) {
        int i;
        int[] arr = {2,3,1,7,11,-1,-3,-11,-7,-2};
        System.out.println("Array before sorting:" + Arrays.toString(arr));

        for (i = 0; i < arr.length; i++) {
            sortingArray(arr, arr.length);
        }
        System.out.println("Array after sorting:" + Arrays.toString(arr));
    }

    public static void sortingArray(int[] arr, int x) {
        for (int i = x - 1; i >= 0; i--) {
            int j = i;
            int y = arr[i];
            while ((j > 0) && (arr[j - 1] < y)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr [j] = y;
        }
    }
}
