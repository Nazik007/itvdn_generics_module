package itvdn_classes_objects_2;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Car c2 = new Car(1998);
        Car c3 = new Car(2001,"Black");

        System.out.println("Default constructor: " + "Year " + c.getYear() + ", color " + c.getColor());
        System.out.println("Constructor with one parameter: " + "Year " + c2.getYear() + ", color " + c2.getColor());
        System.out.println("Constructor with two parameters: " + "Year " + c3.getYear() + ", color " + c3.getColor());

    }
}
