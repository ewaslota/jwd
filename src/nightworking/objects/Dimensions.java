package nightworking.objects;

public class Dimensions {
    int height;
    int width;
    int depth;

    public Dimensions(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void showDetails() {

        System.out.println("Wymiary to: ");
        System.out.println("wysokość - " + height + " cm,");
        System.out.println("szerokość - " + width + " cm,");
        System.out.println("głębokość - " + depth + " cm,");

    }
}
