//program to make calculator using switch statement

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = scanner.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = scanner.nextDouble();

        System.out.println("Enter second number");
        number2 = scanner.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        scanner.close();
    }
}

