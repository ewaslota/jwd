package nightworking;

public class StaticTester {
    public static String thing = "drzewo";
    public static int hight = 8;
    public static void main(String[] args) {
        System.out.print("Koło domu znajduje się " + StaticTester.thing);
        System.out.println(" jego wysokość to: " + StaticTester.hight + "m");
    }
}
