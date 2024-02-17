package overleading;

public class HondaAccord extends Car {
   public void parametry () {
       System.out.println("Honda Accord ma 4 drzwi");
    }

    public static void main(String[] args) {
        HondaAccord hondzia = new HondaAccord();
        hondzia.parametry();

        Car car = new Car();
        car.parametry();
    }
}
