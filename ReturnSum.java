package Cursor.LS2;

public class ReturnSum {

    public static void main(String[] args) {

        int[] arr = {10, -4, -2, -1, 0, 8, -7, 20, -103};

        int sumPositivNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumPositivNum += arr[i];
            }
        }
        System.out.println("The sum of positive numbers " + sumPositivNum);
    }

}