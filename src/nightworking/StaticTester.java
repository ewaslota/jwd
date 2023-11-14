package nightworking;

public class StaticTester {
    public static String thing = "drzewo";
    public static int hight = 8;

    public static void view() {
        System.out.print("Koło domu znajduje się " + StaticTester.thing);
        System.out.println(" jego wysokość to: " + StaticTester.hight + "m");
    }

    public static void main(String[] args) {
        StaticTester.view();
    }
}
