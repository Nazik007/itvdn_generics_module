package itvdn_inherit_polimor_3;

public class Plane extends Vehicle {
    private int height;
    private int passangersCount;

    public Plane(int height, int passangersCount) {
        super(50000, 300, 2001);
        this.height = height;
        this.passangersCount = passangersCount;
    }

    public int getHeight() {
        return height;
    }

    public int getPassangersCount() {
        return passangersCount;
    }
}
