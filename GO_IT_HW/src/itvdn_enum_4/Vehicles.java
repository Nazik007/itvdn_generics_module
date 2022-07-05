package itvdn_enum_4;

public enum Vehicles {
    MERCEDES (20000,"White") {
        @Override
        public String getColor() {
            return color;
        }
    }, BMW (18000, "Black") {
        @Override
        public String getColor() {
            return color;
        }
    }, FERRARI (350000, "Red") {
        @Override
        public String getColor() {
            return color;
        }
    }, FIAT (12000, "Yellow") {
        @Override
        public String getColor() {
            return color;
        }
    };
    int cost;
    String color;

    Vehicles(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public abstract String getColor();

    @Override
    public String toString() {
        return "The car is " + super.toString() + ", the cost is " + cost + "$, color is " + color + ".";
    }
}
 class Main {
    public static void main(String[] args) {
        Vehicles merc = Vehicles.MERCEDES;
        Vehicles bmw = Vehicles.BMW;
        Vehicles fer = Vehicles.FERRARI;
        Vehicles fiat = Vehicles.FIAT;

        System.out.println(fiat);
        System.out.println(bmw);
        System.out.println(merc);
        System.out.println(fer);
    }
}



