package hw_11.go_it_hw_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSorter implements Sorter {

    @Override
    public String getSortedList(String[] stringsArray) {
        List<String> list = new ArrayList<>(Arrays.asList(stringsArray));
        List<Integer> listofIntegers = new ArrayList<>();

        list.forEach(s -> {
            String[] numbers = s.split(", ");
            Arrays
                    .stream(numbers)
                    .forEach(n -> listofIntegers.add(Integer.valueOf(n)));
        });
        return listofIntegers
                .stream()
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

    }
}
