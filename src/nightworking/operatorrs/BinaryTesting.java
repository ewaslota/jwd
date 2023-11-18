package nightworking.operatorrs;

import java.text.DecimalFormat;

public class BinaryTesting {
    public static void main(String[] args) {
        short a = 0b1001_1101;
        short b = 0b0100_1011;
        //0000 1001

        System.out.println(String.format("%8s", Integer.toBinaryString(a & b)).replace(' ', '0'));

        //0 0 | 0
        //0 1 | 0
        //1 0 | 0
        //1 1 | 1
    }
}
