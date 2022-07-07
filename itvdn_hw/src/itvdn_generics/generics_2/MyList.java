package itvdn_generics.generics_2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    List<T> myList = new ArrayList<T>();

    public void add (T t) {
        myList.add(t);
    }

    public int index (int t) {
        return myList.indexOf(t);
    }

    public int count (T t) {
        return myList.size();
    }

    public List<T> getList() {
        return myList;
    }
}

class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("Hello");
        list.add("World");
        list.add("!");

        System.out.println(list.getList());
        System.out.println(list.getList().indexOf("Hello"));
        System.out.println(list.count("World"));

        System.out.println("---------");

        MyList<Integer> list1 = new MyList<>();
        list1.add(1);
        list1.add(3);
        list1.add(6);
        list1.add(123);

        System.out.println(list1.getList());
        System.out.println(list1.getList().indexOf(6));
        System.out.println(list1.count(123));



    }
}
