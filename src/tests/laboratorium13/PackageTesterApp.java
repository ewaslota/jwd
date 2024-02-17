package tests.laboratorium13;

import tests.laboratorium13.pakiet1.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {
        PackageTester pt1 = new PackageTester();
        pt1.introduce();

        tests.laboratorium13.pakiet2.PackageTester pt2 = new tests.laboratorium13.pakiet2.PackageTester();
        pt2.introduce();

        tests.laboratorium13.pakiet3.PackageTester pt3 = new tests.laboratorium13.pakiet3.PackageTester();
        pt3.introduce();
    }
}
