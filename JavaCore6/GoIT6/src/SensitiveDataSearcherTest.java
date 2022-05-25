class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}

class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        if (phrase.toLowerCase().contains("pass") || phrase.toLowerCase().contains("key") || phrase.toLowerCase().contains("login") || phrase.toLowerCase().contains("email")){
            return true;
        }
        return false;
    }
}