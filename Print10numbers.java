import java.util.Scanner;


public class Print10numbers {


    public static void main(String[] args) {
        //create an object of scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");

        int a = scanner.nextInt();
        int sum = 0;


        for (int i = 10; i <= a; i++) {
            sum = i;
            System.out.println(i);

        }


    }

}
