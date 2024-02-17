package overleading;

public class TestOverloading {

  int add (int x, int y) {
      return x + y;
  }

  int add (int x, int y, int z) {
      return x + y + z;
  }

  double add (double x, double y) {
      return x + y;
  }

  double add (double x, double y, double z) {
      return x + y + z;
  }

  String add (String x, String y) {
      return x + y;
  }


    public static void main(String[] args) {
    TestOverloading calc = new TestOverloading();{
       int wynik1 = calc.add (5, 8);
       int wynik2 = calc.add (5, 6, 7);
       double wynik3 = calc.add (4.5, 6.3);
       double wynik4 = calc.add (5.9, 6.3,8.9);
            System.out.println(wynik1);
            System.out.println(wynik2);
            System.out.println(wynik3);
            System.out.println(wynik4);
        }

    }
}
