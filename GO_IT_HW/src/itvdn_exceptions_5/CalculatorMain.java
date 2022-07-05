package itvdn_exceptions_5;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("We are going to help you to calculate the numbers!\nPlease, type in your first number: ");
        int operand1 = scan.nextInt();
        System.out.print("Please, enter the second number: ");
        int operand2 = scan.nextInt();
        System.out.println("Please choose the arithmetic action from '+','-','*','/' ");
        char operator = scan.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(calc.add(operand1,operand2));
            break;

            case '-':
                System.out.println(calc.sub(operand1,operand2));
            break;

            case '*':
                System.out.println(calc.mul(operand1,operand2));
            break;

            case '/':
               if(operand2 != 0){
                   System.out.println(calc.div(operand1,operand2));
               }else
                calc.divError();
            break;
        }

    }
}
