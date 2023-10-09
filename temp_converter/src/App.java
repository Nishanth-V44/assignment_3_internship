import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Temperature Converter!");
        System.out.print("Enter temperature value: ");
        
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid temperature value.");
            scanner.next(); // Clear the invalid input
        }
        
        double temperature = scanner.nextDouble();
        
        System.out.print("Enter temperature unit (C for Celsius, F for Fahrenheit): ");
        char unit;
        
        while (true) {
            String input = scanner.next().toUpperCase();
            if (input.equals("C") || input.equals("F")) {
                unit = input.charAt(0);
                break;
            } else {
                System.out.println("Invalid input. Please enter C or F.");
            }
        }
        
        double convertedTemperature;
        
        if (unit == 'C') {
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.println(temperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
        } else {
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.println(temperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
        }
        
        scanner.close();
    }
}
