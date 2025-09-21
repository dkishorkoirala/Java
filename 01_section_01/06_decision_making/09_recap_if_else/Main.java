
/*
 * Recap - If Else
 * Challenge
 * 
 * You are given a code which gets as input two numbers n1 and n2 and a single
 * char string op.
 * 
 * Note: we will learn in next lessons how to get input from the user, currently
 * just don't touch the three first lines.
 * 
 * 
 * 
 * The possible values for op are '+', '-', '/' and '*'
 * 
 * Your task is to set the variable result based on the conditions:
 * 
 * if op is '+', set result with n1 + n2.
 * if op is '-', set result with n1 - n2.
 * if op is '/', set result with n1 / n2.
 * if op is '*', set result with n1 * n2.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Don't change this line
        int n1 = scanner.nextInt(); // Don't change this line
        int n2 = scanner.nextInt(); // Don't change this line
        scanner.nextLine(); // Don't change this line
        String op = scanner.nextLine(); // Don't change this line

        // Write your code below
        double result = 0;

        if (op.equals("+")) {
            result = n1 + n2;
        } else if (op.equals("-")) {
            result = n1 - n2;
        } else if (op.equals("/")) {
            // cast to double to avoid integer division
            result = (double) n1 / n2;
        } else if (op.equals("*")) {
            result = n1 * n2;
        }

        System.out.println(result);
    }
}