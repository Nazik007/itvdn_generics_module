package itvdn_classes_objects_3;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(1998);
        Car c3 = new Car(2000,160.0, 860);
        Car c4 = new Car(2008,180.0,750,"Blue");

        System.out.println("Car 1: name: BMW year: " + c1.getYear() + " speed: " + c1.getSpeed() + " weight: " + c1.getWeight() + " color: " + c1.getColor());
        System.out.println("Car 2: name: Mercedes year: " + c2.getYear() + " speed: " + c2.getSpeed() + " weight: " + c2.getWeight() + " color: " + c2.getColor());
        System.out.println("Car 3: name: Audi year: " + c3.getYear() + " speed: " + c3.getSpeed() + " weight: " + c3.getWeight() + " color: " + c3.getColor());
        System.out.println("Car 4: name: Bently year: " + c4.getYear() + " speed: " + c4.getSpeed() + " weight: " + c4.getWeight() + " color: " + c4.getColor());
    }
}
