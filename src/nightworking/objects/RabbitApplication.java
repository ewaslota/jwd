package nightworking.objects;

public class RabbitApplication {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit(23, 0.3f);
        Rabbit rabbit2 = new Rabbit(23, 0.3f);

        System.out.println(
                rabbit1.equals(rabbit2)
        );

        System.out.println(
                rabbit2.equals(rabbit1)
        );
    }
}
