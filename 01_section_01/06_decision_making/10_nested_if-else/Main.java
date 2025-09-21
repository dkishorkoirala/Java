
/*
 * Nested If - Else
 * 
 * 
 * We can nest if-elif-else statements within each other. This allows us to
 * create hierarchical decision-making structures.
 * 
 * For example:
 * 
 * if (age > 18) {
 * if (hasLicense) {
 * System.out.println("You can drive");
 * } else {
 * System.out.println("Get a license first");
 * }
 * } else {
 * System.out.println("Too young to drive");
 * }
 * 
 * It can be infinite nested:
 * 
 * if (condition1) {
 * if (condition2) {
 * if (condition3) {
 * // if condition1, condition2 and condition3 are true
 * ...
 * }
 * }
 * }
 * 
 * Challenge
 * 
 * Create a program that checks if someone can ride a rollercoaster. The
 * requirements are:
 * 
 * Must be at least 12 years old
 * Must be taller than 150cm
 * If they meet both requirements but are under 15, they need adult supervision
 * Print exactly these messages for each case:
 * 
 * If too young: Sorry, you're too young
 * If not tall enough: Sorry, you're not tall enough
 * If under 15 and no adult: Sorry, you need an adult with you
 * If under 15 with adult: You can ride with adult supervision!
 * If 15 or older and tall enough: You can ride by yourself!
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt(); // Don't change this line
        int height = scanner.nextInt(); // Don't change this line
        boolean hasAdult = scanner.nextBoolean(); // Don't change this line

        // Write your code below
        if (age < 12) {
            System.out.println("Sorry, you're too young");
        } else if (height <= 150) {
            System.out.println("Sorry, you're not tall enough");
        } else {
            if (age < 15) {
                if (hasAdult) {
                    System.out.println("You can ride with adult supervision!");
                } else {
                    System.out.println("Sorry, you need an adult with you");
                }
            } else {
                System.out.println("You can ride by yourself!");
            }
        }
        scanner.close();
    }
}