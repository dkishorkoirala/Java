/*Numbers


Variables are containers that hold data values. They are used to store, manipulate, and display information within a program.

In short a variable is like a memory unit that we can access by typing the name of the variable. 

Each variable has a unique name and a value that can be of different types. Java has various built-in data types that define the type of value a variable can hold.

To initialize a variable, we use the following format:

variable_type variable_name = value;
In Java, numbers are typically represented using two main data types: int and double.

int is used to store whole numbers without any decimal point. For example:

int age = 30;
int temperature = -5;
int count = 100;
double is used to store numbers with a decimal point. For example:

double price = 99.99;
double pi = 3.14159;
double fraction = 0.5;
When declaring variables in Java, you need to specify the type of the variable before the variable name. This is known as type declaration. Once a variable is declared with a certain type, it can only hold values of that type.

Challenge

Write a Java program that declares and initializes the following variables:

Declare an int variable named quantity and initialize it with the value 5.
Declare a double variable named itemPrice and initialize it with the value 24.99.
After declaring and initializing these variables, use System.out.println() to output the values of the variables to the console in the following format:

Quantity: [value of quantity]
Price: [value of itemPrice]
 */

public class Main{
    public static void main(String[] args){
        int quantity = 5;
        double itemPrice = 24.99;

        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + itemPrice);
    }
}