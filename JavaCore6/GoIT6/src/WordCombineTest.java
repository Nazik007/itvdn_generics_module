import java.util.Locale;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
       char[] source = sourceWord.toLowerCase().toCharArray();
       char[] target = targetWord.toLowerCase().toCharArray();

       boolean test = false;

        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < source.length; j++) {
                if (target[i] == source[j]){
                    test = true;
                }

            }
            
        }
        return test;
    }
}