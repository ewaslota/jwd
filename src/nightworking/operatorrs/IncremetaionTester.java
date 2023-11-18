package nightworking.operatorrs;

public class IncremetaionTester {
    public static void main(String[] args) {
        int a = 88;
        int b = 90;
        int c = 100;

        int result = --a + b++ - --c;// 87 + 90-99
        //a=87
        //b= 91
        //c=99

        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int x = 80;
        int y = 90;
        int z = 100;

        int res = (--x + x-- + y++ + z++) + --x;// (79+79+90+100) + 77= 348+77=425
        //x=79=78=77
        //y=91
        //z=101

        System.out.println(res);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
