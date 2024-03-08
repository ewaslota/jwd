package enums.lab17;

public class DirectionTester {
    public static void main(String[] args) {
        for(DirectionsOfTheWorld directionsOfTheWorld : DirectionsOfTheWorld.values()) {
            System.out.println(directionsOfTheWorld);
        }
        System.out.println();
        System.out.println(DirectionsOfTheWorld.valueOf("S").getRotation());
    }
}
