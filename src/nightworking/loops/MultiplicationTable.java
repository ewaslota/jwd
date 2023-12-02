package nightworking.loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                if (i * j > 9) {
                    System.out.print("  ");
                } else if(i * j > 99) {
                        System.out.print(" ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
}
