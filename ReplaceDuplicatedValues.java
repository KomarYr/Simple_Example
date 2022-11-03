package Cursor.LS2;

import java.util.Arrays;

public class ReplaceDuplicatedValues {

    public static void main(String[] args) {

        int[] array = {3,2,3,1,4,2,8,3};
        for (int i : array) {
            for (int n = i + 1; n < array.length; n++) {
                if (array[i] == array[n]) {
                    array[n] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
