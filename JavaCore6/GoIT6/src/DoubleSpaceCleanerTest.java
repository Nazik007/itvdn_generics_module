class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}

class DoubleSpaceCleaner {
    public String clean(String phrase) {
        while (phrase.contains("  ")){
            phrase = phrase.replace("  ", " ");
        }
        return phrase.trim();
    }
}