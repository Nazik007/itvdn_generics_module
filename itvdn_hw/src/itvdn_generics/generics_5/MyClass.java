package itvdn_generics.generics_5;

public class MyClass {
    public static <T> void factoryMethod (T t) {
        T element = t;
        System.out.println("is a variable from " + element.getClass());
    }
}
