import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Assignment_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (dd-MM-yyyy): ");
        String dates = scanner.nextLine();

        System.out.print("Enter the number of days to add: ");
        int days;
        try {
            days = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: The number of days should be an integer.");
            return;
        }

        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(dates, formate);

        LocalDate newDate = date.plus(days, ChronoUnit.DAYS);
        System.out.println("Input: date=" + dates + ", days=" + days);
        System.out.println("Output: " + newDate.format(formate));

        scanner.close();
    }
}