//program to check input number is prime or not
import java.util.Scanner;

public class Primenumber {


    public static void main(String[] args) {

        int n;
        int count = 0;
        //create an object of scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        n = scanner.nextInt();
        //check the input number prime or not
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;


        }
        if (count == 2)
            System.out.println("Prime number");

        else {
            System.out.println("not prime number");
        }


    }

}

