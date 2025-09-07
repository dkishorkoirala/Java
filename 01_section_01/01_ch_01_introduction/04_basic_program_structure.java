/*Basic Program Structure


In Java, every line of code that runs must be inside a class. A class is like a blueprint for creating objects, which are instances of the class. In our lessons, we will name the main class Main, but it can be named anything.

The main method is a crucial part of a Java program because it serves as the starting point of execution. When you run a Java program, the Java Virtual Machine (JVM) looks for the main method to begin executing the code. Without a main method, the JVM wouldn't know where to start.

Here's a simple breakdown of a basic Java program:

public class Main { // Class declaration
    public static void main(String[] args) { // Main method
        System.out.println("Hello, Coddy!"); // Output statement
    }
}
Important note: In Java, each statement must end with a semicolon (;). The semicolon is mandatory and tells Java that you've reached the end of a statement. Forgetting to add a semicolon will result in a compilation error. However, note that code blocks enclosed in curly braces {} (like class and method declarations) don't need semicolons.

Challenge

Create a Java program with a class named Main that contains the main method. Inside the main method, write code to output the following text:

This is my first Java program!
*/
public class Main{
    public static void main(String[] args){
        System.out.println("This is my first Java program!");
    }
}
