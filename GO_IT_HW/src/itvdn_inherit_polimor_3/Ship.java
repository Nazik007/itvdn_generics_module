package itvdn_inherit_polimor_3;

public class Ship extends Vehicle {

    private int passengersCount;
    private String port;

    public Ship(int price, double speed, int year) {
        super(price, speed, year);
        passengersCount = 1500;
        port = "Abigale";
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public String getPort() {
        return port;
    }
}
