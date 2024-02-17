package packages.laboratorium13;

import packages.laboratorium13.package1.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {
        PackageTester pt1 = new PackageTester();
        pt1.introduce();

        packages.laboratorium13.package2.PackageTester pt2 = new packages.laboratorium13.package2.PackageTester();
        pt2.introduce();

        packages.laboratorium13.package3.PackageTester pt3 = new packages.laboratorium13.package3.PackageTester();
        pt3.introduce();
    }
}
