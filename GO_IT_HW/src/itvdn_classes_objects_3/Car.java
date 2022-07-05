package itvdn_classes_objects_3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car () {
        this.year = 1990;
        this.speed = 120.0;
        this.weight = 500;
        this.color = "Red";
    }

    public Car (int year){
        this.year = year;
        this.speed = 100.0;
        this.weight = 600;
        this.color = "Yellow";
    }

    public Car (int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 450;
        this.color = "Grey";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "White";
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
