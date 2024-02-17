package packages.laboratorium13.package2;

public class PackageTester {
    public void introduce() {
        System.out.print("To jest obiekt klasy " + this.getClass().getSimpleName());
        System.out.println(", w pakiecie  " + this.getClass().getPackageName());
    }
}
