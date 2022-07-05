package goit_11_2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorterSecond implements ListSorterFirst {
    @Override
    public List<String> getSortedListFrom(List<String> stringList) {
        return stringList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
