import java.util.Scanner;

/**
 * This program calculates the horoscope based on the user's date of birth.
 *
 * @version 1.0
 * @since 2023-04-28
 * @author Haitham Al Daajah
 *
 *
 *   -Side Note:
 *
 *   We should always remember that astrology is not real.
 *  
 *   Everything that happened, everything that is happening, and
 *   everything that will happen are all because of the well of Allah
 *   and we should always believe that :)
 */
public class Horoscope {
    /**
     * The main method that accepts user input and calculates the horoscope.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the date of birth
        System.out.print("Enter your date of birth (mm/dd  OR  mm-dd): ");
        String dateOfBirth = scanner.nextLine();

        // Calculate the horoscope based on the date of birth
        String horoscope = calculateHoroscope(dateOfBirth);

        // Print the horoscope if it is not null
        if (horoscope != null) {
            System.out.println("Your Horoscope is " + horoscope + "!");
        } else {
            System.out.println("Invalid date of birth format!");
        }
        scanner.close();
    }
    

    /**
     * Calculates the horoscope for the given date of birth.
     *
     * @param dateOfBirth the date of birth in the format "mm/dd" or "mm-dd"
     * @return the horoscope corresponding to the date of birth, or null if the date format is invalid
     */
    public static String calculateHoroscope(String dateOfBirth) {
        String horoscope = null;

        // Split the date of birth into month and day parts
        String[] parts = dateOfBirth.split("[/-]");

        // Check if the date of birth has the correct format
        if (parts.length != 2) {
            return horoscope;
        }

        // Convert day and month to integers
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        // Determine the horoscope based on the given date of birth
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            horoscope = "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            horoscope = "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            horoscope = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            horoscope = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            horoscope = "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            horoscope = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            horoscope = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            horoscope = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            horoscope = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            horoscope = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            horoscope = "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            horoscope = "Capricorn";
        }
        return horoscope;
    }
}
