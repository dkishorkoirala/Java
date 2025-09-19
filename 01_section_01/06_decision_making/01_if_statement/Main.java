/*If Statement


If statements allow us to execute code with conditions.

For example, let's look at the following code:

int age = 20;
String status = "Child";
if (age > 18) {
    status = "Adult";
}
age += 1;
The above code checks whether the age variable is bigger than 18. If it is, it will set status to hold "Adult" string.

In the end, the code will increment age by 1 whether the age is bigger than 18 or not.

 

To use an if statement in Java, we need to use curly braces {} to define the code block, and everything inside the if statement should be placed between these braces:

if (condition) {
    code;
    code;
    code;
}
If the condition is true, we will enter the code block inside the if (The indented code)

Challenge

You are given a code.

The variables a and b have missing values, fill them so that the code inside the if statement will be executed and c will equal 3.

Bonus: try to find more than one solution!*/
public class Main {
    public static void main(String[] args) {
        int a = 11;
        int b = 11;

        // Don't change below this line
        int c = 0;
        if (a >= b && !(b < 10)) {
            c = 2;
        }

        c += 1;
        System.out.println("c = " + c);
    }
}
