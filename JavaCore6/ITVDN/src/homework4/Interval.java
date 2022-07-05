package homework4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number from 0 to 100, please ");
        int digit = scan.nextInt();



        if (digit >= 0 && digit <= 14){
            System.out.println("The numbers are between 0 and 14");
        }
        if (digit >= 15 && digit <= 35){
            System.out.println("The numbers are between 15 and 35");
        }
        if (digit >= 36 && digit <= 50){
            System.out.println("The numbers are between 36 and 50");
        }
        if (digit >= 50 && digit <= 100){
            System.out.println("The numbers are between 50 and 100");
        }

        else System.out.println("The numbers doesn't fit into the boundaries set by the program");

    }
}
