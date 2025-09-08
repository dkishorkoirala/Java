/*Challenge

You're creating a text-based game interface. Create multiple char variables to represent different game symbols:

Create these char variables with the specified values:
    player with value '+'
    enemy with value '*'
    coin with value '$'
    heart with value '3'
    arrow with value '>'
    wall with value '#'
Pay attention to:
    Using single quotes (not double quotes)
    Exact symbols as specified
    Proper char declaration syntax
The program will display these game symbols in a status display.
 */

public class Main{
    public static void main(String[] args){

        char player = '+';
        char enemy = '*';
        char coin = '$';
        char heart = '3';
        char arrow = '>';
        char wall = '#';


        System.out.println("Game Symbols:");
        System.out.println("-------------");
        System.out.println("Player: " + player);
        System.out.println("Enemy: " + enemy);
        System.out.println("Coin: " + coin);
        System.out.println("Life: " + heart);
        System.out.println("Direction: " + arrow);
        System.out.println("Wall: " + wall);
    }
}