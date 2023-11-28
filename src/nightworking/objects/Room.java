package nightworking.objects;

public class Room {
    private String street;
    private int floor;
    private double area;
    private double price;
    private boolean lift;

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setLift(boolean lift) {
        this.lift = lift;
    }

    public boolean getLift() {
        return lift;
    }

    public Room(String street, int floor, double area, double price, boolean lift) {
        this.setStreet(street);
        this.setFloor(floor);
        this.setArea(area);
        this.setPrice(price);
        this.setLift(lift);
    }

    public boolean equals(Room obj) {
        return obj.getStreet().equals(this.getStreet()) && //na Stringu (który też jest obiektem) zamiast == wywołujemy equals
                obj.getFloor() == this.getFloor() &&
                obj.getArea() == this.getArea() &&
                obj.getPrice() == this.getPrice() &&
                obj.getLift() == this.getLift();
    }

    public void showAttributs() {
        System.out.println("Dane pokoju na wynajem: ");
        System.out.println("Ulica - " + getStreet());
        System.out.println("Piętro - " + getFloor());
        System.out.println("Metraż - " + getArea() + " m2");
        System.out.println("Cena - " + getPrice() + " zł");
        System.out.println("Dostęp do windy - " + getLift());

    }

    public static void main(String[] args) {
        Room room1 = new Room("Kochanowskiego", 0, 15, 1200, true);
        Room room2 = new Room("Kochanowskiego", 0, 15, 1200, true);

        System.out.println(room1.equals(room2));

        room1.showAttributs();
    }
}
