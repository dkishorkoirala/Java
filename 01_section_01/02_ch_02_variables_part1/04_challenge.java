/*Challenge

You're creating a simple profile system. Create several String variables to store different pieces of information:

Create the following String variables:
    firstName with value "Alex"
    city with value "New York"
    hobby with value "Playing guitar"
    greeting with value "Hello, nice to meet you!"
    favoriteQuote with value "Life is like a box of chocolates"
    mood with value "Happy"
Pay attention to:
    Exact spacing
    Proper use of quotation marks
    Case sensitivity
    Special characters and emojis
The program will automatically print all values in a profile format.
*/

public class Main{
    public static void main(String[] args){
        String firstName = "Alex";
        String city = "New York";
        String hobby = "Playing guitar";
        String greeting = "Hello, nice to meet you!";
        String favoriteQuote = "Life is like a box of chocolates";
        String mood = "Happy";

        System.out.println("Name: " + firstName);
        System.out.println("City: " + city);
        System.out.println("Hobby: " + hobby);
        System.out.println("Greeting: " + greeting);
        System.out.println("Favorite Quote: " + favoriteQuote);
        System.out.println("Current Mood: " + mood);
    }
}