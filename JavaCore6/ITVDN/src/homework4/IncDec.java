package homework4;

public class IncDec {
    public static void main(String[] args) {
       int x = 10, y = 12, z = 3;

        x += y - x++ * z;
        y /= x + 5 % z;

        System.out.println(x + y);
    }
}
