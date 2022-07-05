package itvdn_lists_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Halyna Ivanivna");
        teachers.add("Iryna Petrivna");
        teachers.add("Olga Yaroslavivna");
        teachers.add("Natalia Ivanivna");
        teachers.add("Stefania Onufriivna");
        teachers.add("Olga Kindrativna");
        teachers.add("Halyna Yaroslavivna");

        System.out.println(teachers.get(1));
        System.out.println(teachers.get(6));
    }
}
