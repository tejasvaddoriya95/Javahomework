//program to print fibonacci series
import java.util.Scanner;

public class Fibonaccinumber {

    public static void main(String[] args) {
        //create instance of scanner class
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int f1 = 0;
        int f2 = 1;
        System.out.println("fibonacci series till" + "as below");
        //print the fibonacci series
        for (int i = f2; i <= n; i++) {
            System.out.println(f1 + " ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

        }
    }
}
