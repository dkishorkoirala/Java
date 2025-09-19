/*Challenge

You're creating a simple game score calculator. Set the initial values for score and bonus so that the player achieves the "High Score" status.

The scoring rules are:

Starting score must be between 80 and 100 (inclusive)
Starting bonus must be between 10 and 20 (inclusive)
The player achieves "High Score" status if:
Score is above 90 AND bonus is above 15, OR
Score is above 85 AND bonus is above 18
Find at least two different combinations of score and bonus values that will result in a "High Score" status!*/
public class Main {
    public static void main(String[] args) {
        // Initialize your values here
        int score = 91;
        int bonus = 16;

        // Don't modify the code below
        String status = "Regular Score";

        if (score >= 80 && score <= 100 && bonus >= 10 && bonus <= 20) {
            if ((score > 90 && bonus > 15) || (score > 85 && bonus > 18)) {
                status = "High Score";
            }
        } else {
            status = "Invalid Values";
        }

        System.out.println("Status: " + status);
    }
}
