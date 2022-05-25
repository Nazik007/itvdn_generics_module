import java.util.Arrays;

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}

class Phrase {
    private String[] words;

    public Phrase(String[] words) {
        this.words = words.clone();

    }

    @Override
    public String toString() {
        String result = " ";

        for (int i = 0; i < words.length; i++) {
            result += words[i] + " ";
        }
        return result;
    }
}