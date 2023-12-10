package laboratorium13.package3;

public class PackageTester {
    public void introduce() {
        System.out.print("To jest obiekt klasy " + this.getClass().getSimpleName());
        System.out.println(", w pakiecie  " + this.getClass().getPackageName());
    }
}
