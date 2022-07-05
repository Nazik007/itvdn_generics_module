package goit_hw_11_1;

import java.util.Arrays;
import java.util.List;

public class AddNamesList {
    private static final List<String> names = Arrays.asList(
            "Peter",
            "Dan",
            "Olga",
            "Ivan",
            "Timur",
            "Bogdan",
            "Derek",
            "VanGough",
            "Alan",
            "Vasil",
            "Oleg,",
            "Sonya",
            "Zoe",
            "Robert",
            "Alex",
            "Nate"
    );

    public static List<String> getNamesList(){
        return names;
    }
}
