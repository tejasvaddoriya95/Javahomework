// program to display sum of natural numbers

import java.util.Scanner;

public class Sumofnaturalnum {
    // Driver method
    public static void main(String[] args) {
        //create an object of scanner class
        Scanner scanner = new Scanner(System.in);
        int n;
        // declare the number
        System.out.println("Enter the number");
        n = scanner.nextInt();

        int sum = 0;  //variable to calculate the sum
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("the sum of natural number is " + sum);

    }

}
