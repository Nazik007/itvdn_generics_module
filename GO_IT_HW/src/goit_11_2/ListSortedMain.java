package goit_11_2;

import java.util.Arrays;
import java.util.List;

public class ListSortedMain {
    static String text = "He that is thy friend indeed, He will help thee in thy need";
    static List<String> stringList = Arrays.asList(text.split(" "));

    public static void main(String[] args) {
        ListSorterSecond listSorterSecond = new ListSorterSecond();
        System.out.println(listSorterSecond.getSortedListFrom(stringList));
    }
}
