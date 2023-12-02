package nightworking.loops;
// instrukcja warunkowa if i switch
// tym różnią się od wyrażenia warunkowego, że nie zwraca nic
public class Temperature {
    public static void main(String[] args) {
 // zad. nr 1 - temperatura
        //1a) instrukcja warunkowa if
        int a = 0;

        if (a > 0) {// warunek, w tym przypadku a > 0
            System.out.println("Temperatura jest dodatnia.");// instrukcje gdy warunek jest prawdziwy
        } else if (a < 0) {
            System.out.println("Temperatura jest ujemna.");
        } else {
            System.out.println("Temperatura jest zerowa.");//instrukcje gdy warunek jest fałszywy
        }
        // 1b) instrukcja warunkowa switch
        // 1c) inline tj. operator trójargumentowy
        String minus;
        String nieMinus;

        minus = "1Temperatura jest ujemna";
        nieMinus = "1Temperatura nie jest ujemna";
       int aa = -6;
        System.out.println(aa < 0 ? minus : nieMinus);


// zad nr 2 długość snu
        // 2a) instrukcja warunkowa if
        int s = 7;

        if(s < 6) {
            System.out.println("Zbyt mała ilość snu. Musisz kłaść się wcześniej");
        }
        else if(s > 9) {
            System.out.println("Spałeś za długo. Ustaw budzik na wcześniejszą porę.");
        }
        else {
            System.out.println("Brawo, idealna długość snu");
        }

        //2b) instrukcja warunkowa switch
        int ss = 10;

        switch (ss) { //wyrażenie, w tym przypadku ss
            case 1:// jakaś wartość w tym przypadku 1
                System.out.println("Zbyt mała ilość snu. Musisz kłaść się wcześniej");// jakieś instrukcje dla 1
                break;
            case 2:
                System.out.println("Zbyt mała ilość snu. Musisz kłaść się wcześniej");
                break;
            case 3:
                System.out.println("Zbyt mała ilość snu. Musisz kłaść się wcześniej");
                break;
            case 4:
                System.out.println("Zbyt mała ilość snu. Musisz kłaść się wcześniej");
                break;
            case 5:
                System.out.println("Zbyt mała ilość snu. Musisz kłaść się wcześniej");
                break;
            case 6:
                System.out.println("Jest dobrze ale nie idealnie, spałeś minimalną wymaganą liczbę godzin");
                break;
            case 7:
                System.out.println("Brawo, idealna długość snu");
                break;
            case 8:
                System.out.println("Brawo, idealna długość snu");
                break;
            case 9:
                System.out.println("Brawo, idealna długość snu");
                break;
            default:
                System.out.println("Spałeś za długo. Ustaw budzik na wcześniejszą porę.");//instrukcje gdy nie znaleziono żadnego pasującego przypadku
        }

        // 2c) operator trójargumentowy
        String norma = "Spałeś odpowiedni okres czasu";
        String nieWNormie = "Czas twojego snu nie jest optymalny";

        int sen = 7;

        System.out.println(sen >= 6 && sen <= 9 ? norma : nieWNormie);

// zad nr 3 zawodnicy na podium
        // 3a) instrukcja warunkowa if
        // 3b) instrukcja warunkowa switch
        int z = 3;

        switch(z) {
            case 1:
                System.out.println("Brawo wygrałeś, zająłeś pierwsze miejsce.");
                break;
            case 2:
                System.out.println("Brawo jesteś prawie najlepszy, zająłeś drugie miejsce.");
                break;
            case 3:
                System.out.println("Niezły jesteś, zająłeś trzecie miejsce.");
                break;
            default:
                System.out.println("Przykro mi, nie dostałeś się na podium. Spróbuj następnym razem.");
        }
    }
}