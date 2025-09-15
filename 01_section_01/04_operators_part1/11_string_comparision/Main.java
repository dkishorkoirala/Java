/*
 * String Comparison
 * 
 * 
 * In Java, comparing strings is different from comparing numbers. While you can
 * use <, >, ==, etc., for numbers, strings require different methods because
 * they are objects, not primitive.
 * 
 * The most common and correct way to compare if two strings have the same
 * content is using the equals() method:
 * 
 * String str1 = "hello";
 * String str2 = "hello";
 * String str3 = "Hello";
 * 
 * boolean result1 = str1.equals(str2); // true
 * boolean result2 = str1.equals(str3); // false (case-sensitive)
 * Using equalsIgnoreCase() If you want to compare strings without considering
 * upper/lower case:
 * 
 * String str1 = "Hello";
 * String str2 = "hello";
 * 
 * boolean result = str1.equalsIgnoreCase(str2); // true
 * Many beginners try to use == to compare strings, but this is usually wrong:
 * 
 * String str1 = "hello";
 * String str2 = "hello";
 * 
 * boolean result = (str1 == str2);
 * Don't comapre string with the == sign!
 */