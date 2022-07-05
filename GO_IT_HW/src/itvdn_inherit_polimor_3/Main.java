package itvdn_inherit_polimor_3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane (1000, 300);
        Ship ship = new Ship(1000000, 250, 2001);
        Car car = new Car(20000, 200, 1995);

        System.out.println("Plane\n" + "price: " + plane.getPrice()+ "; speed: " + plane.getSpeed()+ "; year: " + plane.getYear()+ "; height: " + plane.getHeight() + "; passengers count: " + plane.getPassangersCount() + ";");
        System.out.println("Ship\n" + "price: " + ship.getPrice()+ "; speed: " + ship.getSpeed()+ "; year: " + ship.getYear()+ "; port: " + ship.getPort() + "; passengers count: " + ship.getPassengersCount() + ";");
        System.out.println("Car\n" + "price: " + car.getPrice()+ "; speed: " + car.getSpeed()+ "; year: " + car.getYear() + ";");
    }
}
