package nightworking.objects;

/**
 * Utwórz klasę ze zmiennymi egzemplarza height, width, depth, będącymi liczbami całkowitymi.
 * Utwórz aplikację, która korzysta z nowej klasy, ustawia zmienne w obiekcie a następnie je wyświetla.
 */
public class DimensionsApplication {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(15, 9, 5);
        Dimensions dimensions2 = new Dimensions(15, 9, 5);

        Dimensions dimensions1 = dimensions;



        dimensions.showDetails();
    }
}
