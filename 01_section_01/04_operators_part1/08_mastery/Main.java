/*Challenge

You're writing a game scoring system. The program contains multiple sequences of operations using pre and post increment/decrement. Your task is to trace through the code and verify your understanding.

Start with these initial values:
points = 5
bonus = 10
lives = 3
Study these sequences and predict the results:

result1 = points++; // Post-increment
result2 = ++bonus;  // Pre-increment  
result3 = --lives;  // Pre-decrement
result4 = lives--;  // Post-decrement
Complete the verification code to check if your predictions are correct.
*/
public class Main {
    public static void main(String[] args) {
        // Initial values
        int points = 5;
        int bonus = 10;
        int lives = 3;

        // Execute the operations
        int result1 = points++;
        int result2 = ++bonus;
        int result3 = --lives;
        int result4 = lives--;

        boolean check1 = (result1 == 5); // What value did result1 get?
        boolean check2 = (result2 == 11); // What value did result2 get?
        boolean check3 = (result3 == 2); // What value did result3 get?
        boolean check4 = (result4 == 2); // What value did result4 get?

        boolean check5 = (points == 6); // What is points final value?
        boolean check6 = (bonus == 11); // What is bonus final value?
        boolean check7 = (lives == 1); // What is lives final value?

        if (check1 && check2 && check3 && check4 && check5 && check6 && check7) {
            System.out.println("All predictions correct!");
        } else {
            System.out.println("Some predictions are incorrect. Review pre/post increment rules.");
        }
    }
}
