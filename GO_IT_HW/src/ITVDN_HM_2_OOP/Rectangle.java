package ITVDN_HM_2_OOP;

import java.util.Scanner;

public class Rectangle {

    public double side1;
    public double side2;

    public double areaCalculator (double side1, double side2) {
        double s;
        s = side1 * side2;
        return s;
    }

    public double perimeterCalculator (double side1, double side2) {
        double p;
        p = 2 * (side1 + side2);
        return p;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть довжину першої сторони прямокутинка: ");
        double side1 = scan.nextDouble();
        System.out.println("Введіть довжину другої сторони прямокутинка: ");
        double side2 = scan.nextDouble();

        System.out.println("Площа прямокутника - " + rectangle.areaCalculator(side1,side2));
        System.out.println("Периметр прямокутника - " + rectangle.perimeterCalculator(side1,side2));
    }
}
