package homework4;

public class Volume {
    public static void main(String[] args) {
        double h = 18;
        double r = 23;
        final double PI = 3.14d;

        double v = PI * (r * r) * h;
        double s = ( 4* PI *r) + 2 * PI * Math.pow(r,2);

        System.out.println(v);
        System.out.println(s);
    }
}
