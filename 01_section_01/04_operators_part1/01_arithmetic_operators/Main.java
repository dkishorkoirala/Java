/*Arithmetic Operators


Operators are used to perform operations on values.

First we will discuss the most basic arithmetic operators, they may be familiar from math classes.

Operator	Operation	Example
+	Addition	3 + 2 = 5
-	Subtraction	3 - 2 = 1
*	Multiplication	3 * 2 = 6
/	Division	4 / 2 = 2
Let's see usage example,

int a = 3;
int b = 5;
int c = a + b; // c holds 8
When working with decimal numbers in Java, we use the double data type, which can store numbers with decimal points. The same arithmetic operators (+, -, *, /) work with doubles just like they do with integers:

double x = 3.3;
double y = 4.1;
double z = x + y; // z holds 7.4

Challenge

Write a code that initializes two variables, a and b, with the values 5.2 and 2.6 (respectively).

After that, initialize another variable c that will hold the result of a / b.
*/
public class Main {
    public static void main(String[] args) {
        double a = 5.2;
        double b = 2.6;
        double c = a / b;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

    }
}
