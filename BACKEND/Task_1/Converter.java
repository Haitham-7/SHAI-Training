/*
 * A program that converts the length from one unit to another.
 * 
 * Version: 1.0
 * Date: April 28, 2023
 * Author: Haitham Al Daajah
 */

import java.util.Scanner;

public class Converter {
    /**
     * The main method of the Converter program.
     * Prompts the user for input and performs length conversion.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value to be converted
        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();

        // Prompt the user to enter the input unit
        System.out.println("Valid units: km (kilometer), m (meter), cm (centimeter), mm (millimeter), mi (mile), inch, ft (feet), yd (yard)");
        System.out.print("Enter the input unit: ");
        String inputUnit = scanner.next();

        // Prompt the user to enter the output unit
        System.out.print("Enter the output unit: ");
        String outputUnit = scanner.next();

        // Convert the length value from the input unit to the output unit
        double result = convert(value, inputUnit, outputUnit);

        // Print the converted value and output unit
        System.out.println("Converted value: " + result + " " + outputUnit);

        scanner.close();
    }


    /**
     * Converts a given length from one unit to another.
     *
     * @param value      The value to be converted.
     * @param inputUnit  The input unit of length.
     * @param outputUnit The output unit of length.
     * @return The converted length value.
     */
    public static double convert(double value, String inputUnit, String outputUnit) {
        double result = 0.0;

        // Convert any input unit to meters to make things easier
        double meters;
        switch (inputUnit.toLowerCase()) {
            case "km":
                meters = value * 1000;
                break;
            case "m":
                meters = value;
                break;
            case "cm":
                meters = value / 100;
                break;
            case "mm":
                meters = value / 1000;
                break;
            case "mi":
                meters = value * 1609.34;
                break;
            case "inch":
                meters = value * 0.0254;
                break;
            case "ft":
                meters = value * 0.3048;
                break;
            case "yd":
                meters = value * 0.9144;
                break;
            default:
                System.out.println("Invalid input unit!");
                return result;
        }

        // Convert meters to the output unit
        switch (outputUnit.toLowerCase()) {
            case "km":
                result = meters / 1000;
                break;
            case "m":
                result = meters;
                break;
            case "cm":
                result = meters * 100;
                break;
            case "mm":
                result = meters * 1000;
                break;
            case "mi":
                result = meters / 1609.34;
                break;
            case "inch":
                result = meters / 0.0254;
                break;
            case "ft":
                result = meters / 0.3048;
                break;
            case "yd":
                result = meters / 0.9144;
                break;
            default:
                System.out.println("Invalid output unit!");
                return result;
        }
        return result;
    }
}
