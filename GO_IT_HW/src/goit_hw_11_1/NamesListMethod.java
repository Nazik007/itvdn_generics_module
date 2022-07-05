package goit_hw_11_1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NamesListMethod implements NamesList {
    @Override
    public String getNamesListFrom(List<String> namesList) {
        AtomicInteger counter = new AtomicInteger(0);

        List<String> resultList = namesList
                .stream()
                .map(n -> counter.incrementAndGet() + ". " + n)
                .filter(n -> counter.get() % 2 == 1)
                .collect(Collectors.toList());
        return String.join(", ", resultList);
    }
}
