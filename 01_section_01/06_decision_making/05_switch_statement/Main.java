/*Switch Statement


The switch statement is like a multi-way if statement. Instead of evaluating a single condition, it checks the value of a variable against multiple cases and executes the code associated with the matching case.

Here's the basic structure of a switch statement:

switch (variable) {
    case value1:
        // Code to execute if variable equals value1
        break;
    case value2:
        // Code to execute if variable equals value2
        break;
    // ... more cases
    default:
        // Code to execute if no case matches
}
The switch keyword is followed by the variable you want to test in parentheses.
Each case represents a possible value of the variable.
The code inside each case is executed if the variable matches that case's value.
The break statement is crucial; it exits the switch after a case is executed. Without it, execution would "fall through" to the next case.
The default case is optional and is executed if no other case matches.
Here's an example:

int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    // ... cases for other days
    default:
        dayName = "Invalid day";
}
You can also combine multiple cases into one:

int day = 3;
String dayName;

switch (day) {
    case 1:
    case 2:
    case 3:
        dayName = "Start of week";
        break;
    // ... cases for other days
    default:
        dayName = "Invalid day";
}

Challenge

Create a program that takes a month number (1 for January, 2 for February, etc.) and prints the season it belongs to. Use a switch statement for the logic.

The seasons and their corresponding months are:

Winter: December (12), January (1), February (2)
Spring: March (3), April (4), May (5)
Summer: June (6), July (7), August (8)
Autumn: September (9), October (10), November (11)
For any other month number, print "Invalid month".*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season = "";

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }

        System.out.println(season);
    }
}