package homework4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double operand1, operand2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("We are going to help you to calculate the numbers!\nPlease, type in your first number: ");

        operand1 = scanner.nextDouble();
        System.out.print("Please, enter the second number: ");
        operand2 = scanner.nextDouble();

        System.out.print("Now choose the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        switch(operator)
        {
            case '+':
                System.out.println(operand1 + operand2);
                break;

            case '-':
                System.out.println(operand1 - operand2);
                break;

            case '*':
                System.out.println(operand1 * operand2);
                break;

            case '/':
                if ( operand2 == 0) System.out.println("I'm sorry, but the numbers can't be divided by 0");
                  else System.out.println(operand1 / operand2);
                break;


            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

    }
}

