package itvdn_classes_objects_4;

public class Car {

    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(){
        this(1990, 180.0, 560, "Green");
    }

    public Car (int year) {
        this(year, 220.0, 720, "Pink");
    }

    public Car (int year, double speed) {
        this(year, speed, 680, "Dark-Green");
    }

    public Car (int year, double speed, int weight) {
        this(year, speed, weight, "White");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this. weight = weight;
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
