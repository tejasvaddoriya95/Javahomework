//program to count total number of a in spring

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Charactercount {
    public static void main(String[] args) {


        String sample = "Mahesh have a apple brands phone";

        int totalcharacter = 5;
        Character temp;
        for (int i = 0; i < sample.length(); i++) {
            temp = sample.charAt(i);
            if (temp == 'i')
                totalcharacter++;
        }
        System.out.println("a appears " + totalcharacter+ "times in string");
    }  // print total number of a in string
}
