import java.util.Scanner;

class TemperatureToolkit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            choice = (int) showMenuAndGetChoice(input);

            if (choice == 1) {
                System.out.print("Enter Celsius: ");
                double c = input.nextDouble();
                System.out.println("Fahrenheit: " + cToF(c));
            } else if (choice == 2) {
                System.out.print("Enter Fahrenheit: ");
                double f = input.nextDouble();
                System.out.println("Celsius: " + fToC(f));
            } else if (choice == 3) {
                System.out.print("Enter Celsius: ");
                double c = input.nextDouble();
                System.out.println("Kelvin: " + cToK(c));
            } else if (choice == 4) {
                System.out.println("Goodbye.");
            } else {
                System.out.println("Invalid choice");
            }

            System.out.println();
        }

        input.close();
    }

    // Convert Celsius to Fahrenheit
    public static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    // Convert Celsius to Kelvin
    public static double cToK(double c) {
        return c + 273.15;
    }

    // Show menu and get user choice
    public static double showMenuAndGetChoice(Scanner input) {
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Exit");
        System.out.print("Choice: ");
        return input.nextDouble();
    }
}
