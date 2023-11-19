package nightworking.tools;

import java.util.Scanner;

/**
 * Implement a class that converts number in any numeral system (2-36) to decimal and tests it
 */
public class AnyToDecimalConverter {
    public static void main(String[] args) {
        System.out.println("This program converts number in any numeral system (2-36) to decimal.");
        String yN;
        do {
            System.out.print("Numeral system: ");
            Scanner input1 = new Scanner(System.in);
            int numeralSystem = input1.nextInt();

            if (numeralSystem > 36 || numeralSystem < 2) {
                System.out.println("Numeral system range is from 2 to 36.");
                System.out.println();
                yN = "y";
                continue;
            }

            System.out.print("Number: ");
            Scanner input2 = new Scanner(System.in);
            String number = input2.nextLine();
            int decimal;
            try {
                decimal = AnyToDecimalConverter.convert(number, numeralSystem);
            } catch (Throwable throwable) {
                System.out.println(throwable.getMessage());
                System.out.println();
                yN = "y";
                continue;
            }
            System.out.println("Decimal: " + decimal);

            System.out.print("Do you want to calculate again? y/N ");
            Scanner input3 = new Scanner(System.in);
            yN = input3.nextLine().toLowerCase();
            System.out.println();
        } while (yN.equals("y"));
        System.out.println("Goodbye!");
    }

    public static int convert(String any, int numeralSystem) throws IllegalStateException {
        if (numeralSystem > 36 || numeralSystem < 2) {
            throw new IllegalStateException("Numeral system range is from 2 to 36.");
        }
        int sum = 0;
        int weight = any.length();
        for (int i = 0; i < any.length(); i++) {
            weight--;
            int digit = switch(any.charAt(i)) {
                case '0' -> 0;
                case '1' -> 1;
                case '2' -> 2;
                case '3' -> 3;
                case '4' -> 4;
                case '5' -> 5;
                case '6' -> 6;
                case '7' -> 7;
                case '8' -> 8;
                case '9' -> 9;
                case 'a', 'A' -> 10;
                case 'b', 'B' -> 11;
                case 'c', 'C' -> 12;
                case 'd', 'D' -> 13;
                case 'e', 'E' -> 14;
                case 'f', 'F' -> 15;
                case 'g', 'G' -> 16;
                case 'h', 'H' -> 17;
                case 'i', 'I' -> 18;
                case 'j', 'J' -> 19;
                case 'k', 'K' -> 20;
                case 'l', 'L' -> 21;
                case 'm', 'M' -> 22;
                case 'n', 'N' -> 23;
                case 'o', 'O' -> 24;
                case 'p', 'P' -> 25;
                case 'q', 'Q' -> 26;
                case 'r', 'R' -> 27;
                case 's', 'S' -> 28;
                case 't', 'T' -> 29;
                case 'u', 'U' -> 30;
                case 'v', 'V' -> 31;
                case 'w', 'W' -> 32;
                case 'x', 'X' -> 33;
                case 'y', 'Y' -> 34;
                case 'z', 'Z' -> 35;
                default -> throw new IllegalStateException("Unexpected value: " + any.charAt(i));
            };

            if (digit >= numeralSystem) {
                throw new IllegalStateException("The digit: " + any.charAt(i) + " is out of range of " + numeralSystem + " numeral system.");
            }

            sum += digit * Math.pow(numeralSystem, weight);
        }

        return sum;
    }
}
