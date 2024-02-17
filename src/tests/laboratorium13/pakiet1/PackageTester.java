package tests.laboratorium13.pakiet1;
/*
Napisz aplikację z wykorzystaniem mechanizmu pakietów wg następujących wskazówek:

stwórz trzy klasy o takiej samej nazwie PackageTester
w każdej klasie umieść metodę wyświetlającą nazwę pakietu klasy o nazwie introduce()
w klasie PackageTesterApp utwórz obiekty wszystkich klas i wywołaj na nich wspomnianą wyżej metodę
 */
public class PackageTester {
    public void introduce() {
        System.out.println("Nazwa pakietu to: " + this.getClass().getPackageName());
    }
}
