package Cursor.LS2;

public class Return_the_average {

    public static void main(String[] args) {

        int[] arr = {5,-9,7,1,-5,4,25,8};

        int sumNum = 0, average = 0;
        for (int i = 0; i < arr.length; i++) {
                sumNum += arr[i];
                average = sumNum / arr.length;
            }
        System.out.println("The average of numbers in array " + average);
    }
}
