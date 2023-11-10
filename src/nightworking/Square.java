package nightworking;

public class Square {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public void presentCalculations() {
        System.out.println("Kwadrat o boku " + this.side);
        System.out.println("Pole powierzchni to: " + this.calculateField());
        System.out.println("Obwód to: " + this.calculateCircuit());
        System.out.println("Długość przekątnej to: " + this.calculateDiagonal());
        System.out.println();
    }

    private int calculateField() {
        return side * side;
    }

    private int calculateCircuit() {
        return 4 * side;
    }

    private double calculateDiagonal() {
        return Math.sqrt(2) * side;
    }
}