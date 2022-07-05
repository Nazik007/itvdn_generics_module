package itvdn_inherit_polimor_3;

public abstract class Vehicle {
    private int price;
    private double speed;
    private int year;

    public Vehicle(int price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public double getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

}
