/*Challenge

You're creating a simple game score tracker. The program starts with certain values and you need to update them using increment and decrement operators.

You start with these initial values:
lives = 3
score = 100
level = 1
coins = 5
Perform these operations in order:
Player lost 2 lives (use decrement twice)
Player collected 3 coins (use increment three times)
Player gained 1 life (use increment once)
Player advanced to next level (use increment once)
Player lost 4 coins (use decrement four times)
The program will show the final values after your operations.*/
public class Main {
    public static void main(String[] args) {
        int lives = 3;
        int score = 100;
        int level = 1;
        int coins = 5;
        lives--;
        lives--;

        coins++;
        coins++;
        coins++;

        lives++;

        level++;
        coins--;
        coins--;
        coins--;
        coins--;

        System.out.println("Game Status:");
        System.out.println("-----------");
        System.out.println("Lives: " + lives);
        System.out.println("Score: " + score);
        System.out.println("Level: " + level);
        System.out.println("Coins: " + coins);
    }
}
