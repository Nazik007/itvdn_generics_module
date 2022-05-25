class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

class PalindromeCounter {
    public int count(String phrase) {
        String[] palindrome = phrase.split(" ");
        int counter = 0;

        for (int i = 0; i < palindrome.length; i++) {
            String s2 = "";
            for (int j = (palindrome[i].length()) - 1; j >= 0; j--) {

                s2 = s2 + palindrome[i].charAt(j);
            }
            if (palindrome[i].equalsIgnoreCase(s2)) {
                counter++;
            }
        }
        return counter;
    }
}