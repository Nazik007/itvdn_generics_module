class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}

class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        String[] wordsCounter = phrase.toLowerCase().split(" ");
        String result = word.toLowerCase();
        float counter = 0F;

        for (int i = 0; i < wordsCounter.length; i++) {
            if (result.equals(wordsCounter[i])){
                counter++;
            }
        }
        return counter / wordsCounter.length;
        }
}