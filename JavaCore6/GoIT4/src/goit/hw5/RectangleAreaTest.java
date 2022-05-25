package goit.hw5;

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea {

    private final int[] coords;

    public RectangleArea(int[] coords) {
        this.coords = coords;
    }

    public int getArea() {
       int result = (coords[2] - coords[0]) * (coords[3] - coords[1]);
        return Math.abs(result);
    }
}
