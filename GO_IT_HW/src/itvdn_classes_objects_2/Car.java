package itvdn_classes_objects_2;

public class Car {
    private int year;
    private String color;

    Car () {
        this.year = 2002;
        this.color = "Red";
    }


    Car (int year) {
        this.year = year;
        this.color = "Black";
    }
    Car (int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
