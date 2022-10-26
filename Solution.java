package Simple_Example;

public class Solution {
    public static void main(String[] arg)   {
        System.out.println(2 * 5);
        short x = -32768;
        short y = 6;
        System.out.println(x + y);
        float z = 10.86f;
        float h = 16.32f;
        System.out.println(z / h);
        byte myNum1 = -128;
        byte myNum2 = 127;
        byte myNum3 = (byte) (myNum1 + myNum2);
        System.out.println(myNum3);
        long myNum4 = 9223372036854775807l;
        long myNum5 = 3l;
        System.out.println(myNum4 / myNum5);
        double myNum6 = 3.14159265359;
        double myNum7 = 6.62607015;
        System.out.println(myNum7 % myNum6);
    }
}
