//program to find factorial of number entered by user
import java.util.Scanner;

public class Factorialofnumber {

    public static void main(String[] args) {
        // create an object of scanner class
        Scanner scanner = new Scanner(System.in);

        // declare the variable
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = num * i;
        }
        System.out.println("Factorial of the number: " + num);
    }
}
