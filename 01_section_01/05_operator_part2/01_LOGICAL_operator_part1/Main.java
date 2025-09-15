/*Logical Operators Part 1


Logical operators are used to check combinations of comparisons that return true or false.

For example the following statement contains two comparisons: 

Is 5 greater than 3 and less than 6?

Operator	Meaning	Example
&&	And - true if all operands are true	a && b
||	Or - true if any operand is true	a || b
!	Not - true if the operand is false	!a
 

Let's see some examples,

5 is bigger than 3 and 1 equals 1,

boolean b1 = (5 > 3) && (1 == 1); // holds true
Explanation: All of the operands are true, so b1 will hold true (and operation is true if both operands are true) .

 

5 is not equals 4 or five equals 2,

boolean b2 = !(5 == 4) || (5 == 2); // holds true
Explanation: The first operand (5 != 4) is true so b2 is also true (or operation is true if either one of the operands is true)

 

1 is not equals 1 or false,

boolean b3 = !(1 == 1) || false; // holds false
Explanation: All of the operands are false, so b3 will hold false (or operation).

 

not (3 bigger than 4),

boolean b4 = !(3 > 4); // holds true
Explanation: The operand is false, so b4 will hold true (not operation).

 

not (5 bigger than 10 or 5 bigger than 1),

boolean b5 = !(5 > 10 || 5 > 1); // holds false
Explanation: 5 > 10 || 5 > 1 is true (one of the operands is true), so in total b5 is false (not operation).

Challenge

You are given a code, Replace the question marks of the variables b1 and b2 so that b3 holds true.

There are many right solutions! */
public class Main {
    public static void main(String[] args) {
        boolean b1 = false, b2 = true;
        boolean b3 = b1 || b2;

        System.out.println("b3 = " + b3);
    }

}
