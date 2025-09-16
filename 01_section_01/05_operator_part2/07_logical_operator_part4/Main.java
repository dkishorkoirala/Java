/*Logical Operators Part 4


De Morgan's Law is a rule that helps us simplify expressions with NOT in them. When working with logical expressions, sometimes we need to simplify or rearrange them.

not in front of two conditions joined by and, you can split it into two separate parts. The and becomes or, and each part gets its own not:

!(A && B) is the same as (!A) || (!B)

For example:

// Let's check if a number is NOT (between 1 and 10)
int number = 15;

// These two expressions are equivalent:
boolean result1 = !(number >= 1 && number <= 10);
boolean result2 = !(number >= 1) || !(number <= 10);

System.out.println(result1);  // true
System.out.println(result2);  // true
The opposite is also correct: !(A || B) is the same as (!A) && (!B)

For example:

// Checking if a person is NOT (a student or employed)
boolean isStudent = false;
boolean isEmployed = false;

// These two expressions are equivalent:
boolean result1 = !(isStudent || isEmployed);
boolean result2 = !(isStudent) && !(isEmployed);

System.out.println(result1);  // true
System.out.println(result2);  // true

Challenge

You're helping a pet shop create a system to determine if they can sell a pet to a customer.

initialize the following variables:

hasLicense with the value true
hasSpace with the value false
hasExperience with the value true
Write the following logical expressions to determine if:

canSellRegularPet: Customer needs EITHER a license OR experience, AND must have space
canSellExoticPet: Customer needs BOTH a license AND experience, AND must have space
cannotSellAnyPet: Customer has NO license AND NO experience, OR has NO space
result: canSellRegularPet OR canSellExoticPet OR cannotSellAnyPet*/

public class Main {
    public static void main(String[] args) {
        boolean hasLicense = true;
        boolean hasSpace = false;
        boolean hasExperience = true;

        boolean canSellRegularPet = (hasLicense || hasExperience) && (hasSpace);
        boolean canSellExoticPet = (hasLicense && hasExperience) && (hasSpace);
        boolean cannotSellAnyPet = (!hasLicense && !hasExperience) || (!hasSpace);

        boolean result = canSellRegularPet || canSellExoticPet || cannotSellAnyPet;
        System.out.println("Can sell regular pet: " + canSellRegularPet);
        System.out.println("Can sell exotic pet: " + canSellExoticPet);
        System.out.println("Cannot sell any pet: " + cannotSellAnyPet);
        System.out.println("Result: " + result);
    }
}
