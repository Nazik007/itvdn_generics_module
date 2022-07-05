package itvdn_classes_objects_4;

public class Main {
    public static void main(String[] args) {
       Car c1 = new Car();
       Car c2 = new Car(1994);
       Car c3 = new Car(2002,220.20);
       Car c4 = new Car(2016,260.0, 560);
       Car c5 = new Car(2001,180.0, 480, "Black");

       System.out.println("Car name: Zhuguli " + " year: " + c1.getYear() + " speed: " + c1.getSpeed() + " weight: " + c1.getWeight() + " color : " + c1.getColor());
       System.out.println("Car name: Audi " + " year: " + c2.getYear() + " speed: " + c2.getSpeed() + " weight: " + c2.getWeight() + " color : " + c2.getColor());
       System.out.println("Car name: BMW " + " year: " + c3.getYear() + " speed: " + c3.getSpeed() + " weight: " + c3.getWeight() + " color : " + c3.getColor());
       System.out.println("Car name: Reno " + " year: " + c4.getYear() + " speed: " + c4.getSpeed() + " weight: " + c4.getWeight() + " color : " + c4.getColor());
       System.out.println("Car name: Mercedes " + " year: " + c5.getYear() + " speed: " + c5.getSpeed() + " weight: " + c5.getWeight() + " color : " + c5.getColor());
    }
}
