/*Arithmetic Shortcuts


Java created a cool shortcut for self-arithmetic operations.

For example instead of writing:

int a = 5;
a = a + 3; // a holds 8
We can simplify it by writing +=:

int a = 5;
a += 3; // a holds 8
The += is adding to a itself the value 3

This operation is valid for all arithmetic operations:

Operator	Shortcut
+	+=
-	-=
*	*=
/	/=
%	%=

Challenge

You are given a code with initialization of count. (Don't delete this line!)

Your task is to add the following operations, in this order:

Add 4 to count
Multiply count by 2
Subtract 1 from count
Use the arithmetic shortcuts to do so!
*/
public class Main {
    public static void main(String[] args) {
        int count = 0;
        count += 4;
        count *= 2;
        count -= 1;
        System.out.println("count = " + count);
    }
}
