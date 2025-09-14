/*Challenge


Create a program that plays "Lucky Seven" using modulo operations. Your program should:

Initialize a variable points with value 105
Check the following conditions using modulo in sequence:
If points modulo 7 equals 0, add 50 to points
If points modulo 3 equals 2, subtract 25 from points
If points modulo 5 equals 4, multiply points by 2
If points modulo 2 equals 1, divide points by 2 (integer division)
Print the final value of points*/
public class Main {
    public static void main(String[] args) {
        int points = 105;
        if (points % 7 == 0) {
            points += 50;
        }
        if (points % 3 == 2) {
            points -= 25;
        }
        if (points % 5 == 4) {
            points *= 2;
        }
        if (points % 2 == 1) {
            points /= 2;
        }
        System.out.println("Final points: " + points);
    }
}
