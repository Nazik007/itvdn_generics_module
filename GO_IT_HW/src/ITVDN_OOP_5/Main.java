package ITVDN_OOP_5;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        address.setIndex(48500);
        address.setCountry("Ukraine");
        address.setCity("Lviv");
        address.setStreet("Shevchenka");
        address.setHouse(72);
        address.setApartment(31);

        System.out.println("Index: " + address.getIndex());
        System.out.println("Country: " + address.getCountry());
        System.out.println("City: " + address.getCity());
        System.out.println("Street: " + address.getStreet());
        System.out.println("House number: " + address.getHouse());
        System.out.println("Apartment number: " + address.getApartment());
    }
}
