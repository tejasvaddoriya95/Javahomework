//program to print sum of x ranging from 1 to 20

import java.util.Scanner;

public class Rangefrom1to20 {

    public static void main(String[] args) {
        // total of any range between 1 to 20
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int a = scanner.nextInt();
        int sum = 0;

        for (int i = a; i <= 20; i++) {
            sum = sum + i;
            System.out.println("the sum of x range is " + sum);
            //print sum of given range
        }
    }
}
