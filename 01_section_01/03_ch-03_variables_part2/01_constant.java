/*
 * Constants
 * 
 * 
 * A constant is a special type of variable that cannot be changed once it is
 * initialized.
 * 
 * To declare a constant use the keyword final followed by the variable type:
 * 
 * final int MAX_VALUE = 100;
 * In the above example, a constant named MAX_VALUE is initialized with the
 * value 100.
 * 
 * If we try to change a constant value:
 * 
 * final int MAX_VALUE = 100;
 * MAX_VALUE = 200; // This will cause an error
 * It will result in an error because constant values cannot be changed.
 * 
 * Challenge
 * 
 * Create a constant named PI and initialize it with the value 3.14159.
 */

public class Main {

    public static void main(String[] args) {
        final double PI = 3.14159;
        System.out.println("PI = " + PI);
    }
}