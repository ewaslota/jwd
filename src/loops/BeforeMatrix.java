package loops;
//Napisz program, który dla dowolnej liczby całkowitej n z przedziału (1 ≤ n ≤ 30) wypisuje macierz
// jak w poniższych przykładach. Użyj dwóch zagnieżdżonych pętli.
//
//        n = 2	matrix
//        --------------
//        1  2
//        2  3
//
//        n = 3	matrix
//        --------------
//        1  2  3
//        2  3  4
//        3  4  5
//
//        n = 4	matrix
//        --------------
//        1  2  3  4
//        2  3  4  5
//        3  4  5  6
//        4  5  6  7

public class BeforeMatrix {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("n= " + n + " matrix");
        System.out.println("-------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(i + j + " ");
            }

                System.out.println();// wciśnij f 12 i wpisz liczbę n



        }


    }
   // wciśnij f 12 i wpisz liczbę n



    }

