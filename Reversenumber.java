//program to reverse a number

import java.util.Scanner;

public class Reversenumber {

    public static void main(String[] args) {
        //create an object of scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = 0;
        int reversen = 0;

        n = scanner.nextInt();
        for (; n != 0; ) {
            reversen = reversen * 10;
            reversen = reversen + n % 10;
            n = n / 10;
        }
        System.out.println("reverse of input number: " + reversen);
    }
}
