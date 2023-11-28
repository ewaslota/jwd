package nightworking.objects;

public class Rabbit {
    private int speed;
    private float height;

    public Rabbit(int speed, float height) {
        this.speed = speed;
        this.height = height;
    }

    public boolean equals(Rabbit obj) {
        return this.speed == obj.speed && this.height == obj.height;
    }
}
