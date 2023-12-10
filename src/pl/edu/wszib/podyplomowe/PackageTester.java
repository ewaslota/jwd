package pl.edu.wszib.podyplomowe;

import pl.edu.wszib.java.PackagePressenter;

public class PackageTester {
    public static void main(String[] args) {
        PackagePressenter pp1 = new PackagePressenter();
        pp1.showPackage();

        pl.edu.wszib.podyplomowe.PackagePresenter pp2 = new pl.edu.wszib.podyplomowe.PackagePresenter();
        pp2.showPackage();
    }
}
