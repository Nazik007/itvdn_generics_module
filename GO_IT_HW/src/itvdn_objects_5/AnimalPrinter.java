package itvdn_objects_5;

public class AnimalPrinter {
    public static void main(String[] args) {
        Animal animal = new Animal("Васька", 45, false);
        System.out.println(animal);
        System.out.println(animal.hashCode());
        System.out.println(animal.equals(animal));
    }
}
