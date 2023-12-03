package nightworking.loops;

public class RafalBinaryToDecimal {
    public static void main(String[] args) {
        String binary = "11000011111";
        int sum = 0;
        int weight = binary.length() - 1;
        for (int i = 0; i < binary.length(); i++) {
            //cyfra: binary.charAt(i)
            int digit = switch(binary.charAt(i)) {
                case '0' -> 0;
                case '1' -> 1;
                default -> throw new IllegalStateException("Unexpected value: " + binary.charAt(i));
            };

            //potęga: 2 ^ waga (weight)
            int power = (int) Math.pow(2, weight);

            //działanie: cyfra * potęga
            int calculation = digit * power;

            //sum += działanie
            sum += calculation;
            //zmniejszamy wagę o 1
            weight--;
        }
        System.out.println(sum);
    }
}
