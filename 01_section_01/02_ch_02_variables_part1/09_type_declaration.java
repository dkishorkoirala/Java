/*
 * Type Declaration
 * 
 * 
 * Once a variable is declared with a certain type, it can only hold values of
 * that type. For instance, an int variable can only hold integer values, and a
 * String variable can only hold text.
 * 
 * For example:
 * 
 * int age = 25; // Can only hold whole numbers
 * String str = "abc"; // Can only hold text
 * These would cause errors:
 * 
 * age = "defg"; // Error: can't put text in an int variable
 * str = 25; // Error: can't put a number in a String variable
 * These are valid:
 * 
 * age = 26; // OK: assigning a new integer
 * str = "Jane"; // OK: assigning a new text string
 * 
 * Challenge
 * 
 * Declare the following variables with their corresponding types and values:
 * 
 * An int variable named count with the value 10.
 * A double variable named total with the value 150.75.
 * A char variable named grade with the value 'A'.
 * A boolean variable named isActive with the value false.
 * A String variable named userName with the value "Bob123".
 * After declaring these variables, use System.out.println() to output the
 * values of the variables to the console in the following format:
 * 
 * Count: [value of count]
 * Total: [value of total]
 * Grade: [value of grade]
 * Active: [value of isActive]
 * User Name: [value of userName]
 */

public class Main {
    public static void main(String[] args) {
        int count = 10;
        double total = 150.75;
        char grade = 'A';
        boolean isActive = false;
        String userName = "Bob123";

        System.out.println("Count: " + count);
        System.out.println("Total: " + total);
        System.out.println("Grade: " + grade);
        System.out.println("Active: " + isActive);
        System.out.println("User Name: " + userName);
    }

}