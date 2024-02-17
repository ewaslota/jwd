package overleading;

public class Operations {
    int minus(int a, int b) {
        return a - b;
    }

    int minus(int a, int b, int c) {
        return a - b - c;
    }
    double minus(double a, double b, double c) {
        return a - b - c;
    }

    char minus(char a, char b) {
        return (char) (a - b);
    }

    public static void main(String[] args) {
        Operations oper = new Operations();
        int result1 = oper.minus(5, 6);
        int result2 = oper.minus(8, 3, 4);
        double result3 = oper.minus(5.9, 8.3, 3.1);
        char result4 = oper.minus('5', '3');

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
