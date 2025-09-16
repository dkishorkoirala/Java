/*Logical Operators Part 3


When checking multiple conditions, the computer stops checking as soon as it knows the final answer (This is called short-circuit evaluation).

For example:

int x = 0;
int y = 5;
boolean result = x != 0 && y / x > 2;
Here x equals 0, therefore it will not evaluate y / x > 2. If we would reverse the order:

boolean result = y / x > 2 && x != 0;
This will result in an error because y will be divided by 0, which is illegal in math.

This technique is used to optimize the evaluation of logical expressions. For example:

int a = 0;
int b = 2;
int c = 3;
int d = 5;
boolean result = (a > 0 && b < 2) || (c < -5 && d < 10);
In this example, b < 2 and d < 10 will not be evaluated because a > 0 and c < -5 are both false.

Challenge

Let's create a program to decide if it's a good day for solar panel energy production

Initialize these variables:

isSunny with the value true
windSpeed with the value 5.4
temperature with the value 23
solarPanelOutput with the value 9
isCloudy with the value false
Create one logical expression that checks ALL of these conditions:

It's sunny
The wind speed is less than 10
The solar panel output is less than 15
The temperature is above 20 OR there are no clouds*/
public class Main {
    public static void main(String[] args) {

        boolean isSunny = true;
        double windSpeed = 5.4;
        int temperature = 23;
        int solarPanelOutput = 9;
        boolean isCloudy = false;

        boolean result = isSunny && windSpeed < 10 && solarPanelOutput < 15 && (temperature > 20 || isCloudy);

        System.out.println("Checking conditions for solar energy production...");
        System.out.println("1. Is it sunny? " + isSunny);
        System.out.println("2. Is wind speed safe? " + (windSpeed < 10));
        System.out.println("3. Can panels produce more? " + (solarPanelOutput < 15));
        System.out.println("4. Is temperature good OR no clouds? " + (temperature > 20 || !isCloudy));
        System.out.println("\nFinal result - Good day for solar energy production: " + result);
    }
}
