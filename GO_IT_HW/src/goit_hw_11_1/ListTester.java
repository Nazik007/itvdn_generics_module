package goit_hw_11_1;

import java.util.List;
import java.util.stream.Collectors;

public class ListTester {
    public static void main(String[] args) {
        List<String> namesList = AddNamesList
                .getNamesList()
                .stream()
                .limit(100)
                .collect(Collectors.toList());

        System.out.println(new  NamesListMethod().getNamesListFrom(namesList));
    }
}
