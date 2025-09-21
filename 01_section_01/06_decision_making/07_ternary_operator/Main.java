
/*
 * Ternary Operator
 * 
 * 
 * The ternary operator is a simple one-line if-else statement. It has the
 * following syntax:
 * 
 * variable = (condition) ? value_if_true : value_if_false;
 * The ternary operator evaluates the condition. If it's true, it assigns
 * value_if_true to the variable; otherwise, it assigns value_if_false.
 * 
 * For example:
 * 
 * int age = 20;
 * String message = (age >= 18) ? "Adult" : "Minor";
 * In this example, since age is greater than or equal to 18, message will be
 * assigned the value "Adult". If age were less than 18, message would be
 * assigned "Minor".
 * 
 * Challenge
 * 
 * Create a program that checks if a number is positive, negative, or zero using
 * the ternary operator. The program should:
 * 
 * Take an integer input from the user.
 * Use the ternary operator to determine if the number is positive, negative, or
 * zero.
 * Print the result in the format: "The number is [positive/negative/zero]".
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "";

        // Write your code below

        result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";

        System.out.println("The number is " + result);
        scanner.close();
    }
}