//program to print multiplication table for any number

import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String args[]) {
        //create an object of scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
//reading a number whose table is to be print
        int num = scanner.nextInt();
//loop start execution form and execute until the condition i<=10 becomes false
        for (int i = 1; i <= 10; i++) {
//prints table of the entered number
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}


