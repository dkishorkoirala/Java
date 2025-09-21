/*
 * Challenge
 * 
 * You're creating a simple student grading system. The system should determine
 * both a letter grade and a status message using ternary operators.
 * 
 * Given a student's score:
 * 
 * Determine the letter grade using these ranges:
 * 90-100: "A"
 * 80-89: "B"
 * 70-79: "C"
 * 60-69: "D"
 * Below 60: "F"
 * Determine the status message:
 * "A" grade: "Excellent!"
 * "B" or "C" grade: "Good job!"
 * "D" grade: "You need to study more"
 * "F" grade: "Please see the teacher"
 * Use only ternary operators (no if-else statements)!
 */

public class Main {
    public static void main(String[] args) {
        // Don't modify these lines
        int score = 85; // This will be different in each test
        String grade = "";
        String message = "";

        // Write your ternary operators here

        grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        message = (grade == "A") ? "Excellent!"
                : (grade == "B" || grade == "C") ? "Good job!"
                        : (grade == "D") ? "You need to study more" : "Please see the teacher";

        // Don't modify the code below
        System.out.println("Student Score: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Message: " + message);
    }
}