package itvdn_lists_3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0,"Monkey");
        zoo.add(1,"Dog");
        zoo.add(2,"Cat");
        zoo.add(3,"Mouse");
        zoo.add(4,"Zebra");
        zoo.add(5,"Penguin");
        zoo.add(6,"Swallow");
        zoo.add(7,"Pig");

        System.out.println("Before the manipulations: ");
        System.out.println(zoo.size());
        System.out.println(zoo);
        System.out.println();

        zoo.remove("Mouse");
        zoo.remove("Penguin");
        zoo.remove("Pig");

        System.out.println("After the manipulations: ");
        System.out.println(zoo.size());
        System.out.println(zoo);

    }
}
