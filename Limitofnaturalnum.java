//program to display n limit of natural number

import java.util.Scanner;

public class Limitofnaturalnum {


    public static void main(String[] args) {
        int i, n, sum = 0;
        {
            //object of scanner class
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input number: ");
            n = scanner.nextInt(); //take integer as input
        }
        System.out.println("The first n natural numbers are : " + n);
        //execute until the condition returns true
        for (i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        //print the sum
        System.out.println("The Sum of Natural Number upto " + n + " terms : " + sum);

    }
}