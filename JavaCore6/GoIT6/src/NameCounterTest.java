class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}

class NameCounter {
    public int count(String text) {
        String[] words = text.split(" ");

        int wordLength = 0, counter = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            wordLength = word.length();

            if (wordLength >= 2 && Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1)))
                counter++;
        }
        return counter;

    }
}