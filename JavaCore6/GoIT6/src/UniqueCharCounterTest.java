

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}

class UniqueCharCounter {
    public int count(String phrase) {
        {
            String unique = phrase.replaceAll("(?i)(.)(?=.*?\\1)", "");
            return unique.length();
        }

    }
}