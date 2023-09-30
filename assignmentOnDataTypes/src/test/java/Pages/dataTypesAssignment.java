package Pages;
// Assignment by Marvel submitted on the 16th of september, 2023.

public class dataTypesAssignment {
    public static void main(String[] args) {
        // 1. Variables of different data types declared and values assigned.
        var num1 = 5;
        var num2 = 3.15;
        var text1 = "Hello, ";
        var text2 = "world!";
        var booleanValue = true;
        double sum;

        // 2. Basic operations performed
         // this will be used to sum both the double and an int value
        sum =  num1 + num2;
        var product = num1 * num2; // this will be used to multiply the two values
        var concatenation = text1 + text2;
        var equalCheck = num1 == num2;

        // Print out the results
        System.out.println("Sum of num1 and num2: " + sum);
        System.out.println("Product of num1 and num2: " + product);
        System.out.println("Concatenated text: " + concatenation);
        System.out.println("Are num1 and num2 equal? " + equalCheck);
        System.out.println("The value of isTrue: " + booleanValue);
    }
}

