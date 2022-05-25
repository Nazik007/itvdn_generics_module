import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[] {"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}

class WordDeleter {
    public String remove(String phrase, String[] words){
        Set<String> filterSet = new HashSet<String>(Arrays.asList(words));
        return Stream.of(phrase.split(" ")).filter(s -> !filterSet.contains(s)).collect(Collectors.joining(" "));
    }
}