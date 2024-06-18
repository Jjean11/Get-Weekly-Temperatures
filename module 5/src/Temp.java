import java.util.ArrayList;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayLists to store days of the week and temperatures
        ArrayList weekday = new ArrayList<>();

        weekday.add("Monday");
        weekday.add("Tuesday");
        weekday.add("Wednesday");
        weekday.add("Thursday");
        weekday.add("Friday");
        weekday.add("Saturday");
        weekday.add("Sunday");

        ArrayList <Integer>temperatures = new ArrayList<>();
        temperatures.add(70);
        temperatures.add(75);
        temperatures.add(65);
        temperatures.add(79);
        temperatures.add(80);
        temperatures.add(83);
        temperatures.add(83);

        //variable to confirm users response to display whole week and average
        String wholeWeek= "week";


        // Prompt user to enter a weekday
        System.out.println("\nWhat day would you like to view the temperature for?:");
        String day = scanner.next();

        //average
        int sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        double average = (double) sum / temperatures.size();


        // Ensure input matches arraylist items
        day = day.substring(0, 1).toUpperCase() + day.substring(1).toLowerCase();

        // Print response to user if input matches items in arraylist or in variable
        boolean found = false;
        for (int i = 0; i < weekday.size(); i++) {
            if (weekday.get(i).equals(day)) {
                System.out.printf("On " + day + " Temperature will be " + temperatures.get(i));
                found = true;

            } while (!weekday.get(i).equals(wholeWeek) && found); {
                System.out.printf("The temperatures for the whole week are " + weekday + temperatures + "and the weekly average is "+ average);
                break;

            }

        }
    }
}
