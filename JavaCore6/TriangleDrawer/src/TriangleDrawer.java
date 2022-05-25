

public class TriangleDrawer {
    public static void main(String[] args) {
        TriangleDrawer drawer = new TriangleDrawer();
        System.out.println("*".repeat(3));
    }

    public String drawTriangle(int side) {
        String temp = "";
        String result = "";
        while (side > 0) {
            temp = temp + "*".repeat(side) + "\n";
            side--;

        }

        return temp;
    }
}