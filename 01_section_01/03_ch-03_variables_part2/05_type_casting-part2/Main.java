/*
 * Type Casting Part 2
 * 
 * 
 * It is also possible to convert number and booleans to string and vice versa.
 * To convert a value to string we can use the String.valueOf() function:
 * 
 * int number1 = 789;
 * double number2 = 789;
 * boolean isValid = true;
 * String text1 = String.valueOf(number1); // becomes "789"
 * String text2 = String.valueOf(number2); // becomes "789.0"
 * String text3 = String.valueOf(isValid); // becomes "true"
 * To convert a string to a different type is a bit more complicated:
 * 
 * String to Integer:
 * 
 * String numberText = "123";
 * int number = Integer.parseInt(numberText); // becomes 123
 * String to Double:
 * 
 * String decimalText = "45.67";
 * double decimal = Double.parseDouble(decimalText); // becomes 45.67
 * String to Boolean:
 * 
 * String boolText = "true";
 * boolean bool = Boolean.parseBoolean(boolText); // becomes true
 * parseBoolean will convert any case-insensitive string that has the value
 * “true”. For example True, tRue, TRUE will all become true
 * 
 * Trying to convert a string to an invalid type will result in an error:
 * 
 * String invalidNumber = "abc";
 * int number = Integer.parseInt(invalidNumber); // This will cause a
 * NumberFormatException
 * 
 */