package laboratorium13;

import laboratorium13.package1.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {
        PackageTester pt1 = new PackageTester();
        pt1.introduce();

        laboratorium13.package2.PackageTester pt2 = new laboratorium13.package2.PackageTester();
        pt2.introduce();

        laboratorium13.package3.PackageTester pt3 = new laboratorium13.package3.PackageTester();
        pt3.introduce();
    }
}
