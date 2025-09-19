/*
 * Challenge
 * 
 * Easy
 * Create the logic to determine the ticket type and price.
 * 
 * These variables are already set:
 * age (customer's age)
 * time (show time in 24-hour format, e.g., 1430 for 2:30 PM)
 * isHoliday (boolean indicating if it's a holiday)
 * Set the ticketType and price variables based on these conditions:
 * For children (age < 13):
 * "CHILD" ticket
 * Base price $8
 * Add $2 if it's a holiday
 * For teens (age 13-17):
 * "TEEN" ticket
 * Base price $12
 * Add $3 if it's a holiday
 * For adults (age 18-59):
 * "ADULT" ticket
 * Base price $15
 * Add $5 if it's a holiday
 * Subtract $3 if show time is before 1700 (5 PM)
 * For seniors (age 60 and above):
 * "SENIOR" ticket
 * Base price $10
 * No holiday surcharge
 * Subtract $2 if show time is before 1700 (5 PM)
 */

public class Main {
    public static void main(String[] args) {
        // Don't modify these values!
        int age = 25;
        int time = 1430; // 24-hour format
        boolean isHoliday = true;

        // Your code to determine ticket type and price
        String ticketType = "";
        int price = 0;

        if (age < 13) {
            ticketType = "CHILD";
            price = 8;
            if (isHoliday) {
                price += 2;
            }
        } else if (age >= 13 && age <= 17) {
            ticketType = "TEEN";
            price = 12;
            if (isHoliday) {
                price += 3;
            }
        } else if (age >= 18 && age <= 59) {
            ticketType = "ADULT";
            price = 15;
            if (isHoliday) {
                price += 5;
            }
            if (time < 1700) {
                price -= 3;
            }
        } else {
            ticketType = "SENIOR";
            price = 10;
            if (time < 1700) {
                price -= 2;
            }
        }
        // Don't modify the code below
        System.out.println("Customer Age: " + age);
        System.out.println("Show Time: " + time);
        System.out.println("Holiday? " + isHoliday);
        System.out.println("-------------------");
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Final Price: $" + price);
    }
}