package itvdn_iterator_comparator.home_work_2;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First element");
        list.add("Second element");
        list.add("Third element");
        list.add("Fourth element");
        list.add("Fifth element");

        System.out.println(list.size());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String temp = iterator.next();
            System.out.print(temp + ", ");
        }
    }
}
