/*Boolean


A boolean type has only 2 possible values: true or false.

To assign a boolean value to a variable, use the keyword boolean followed by the variable name:

boolean variable_true = true;
boolean variable_false = false;
In the above example, two boolean variables named variable_true and variable_false are initialized with the values true and false, respectively.

Booleans are the building blocks for creating logic in the programs we write. We have a whole chapter about logic and conditions.

Challenge

Declare a variable named isLoggedIn and assign it the value true. */

public class Main{
    public static void main(String[] args)
    {
        boolean isLoggedIn = true;

        System.out.println("isLoggedIn = " + isLoggedIn);
    }
}