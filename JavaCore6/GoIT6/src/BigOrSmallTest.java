import java.util.Locale;

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}

class BigOrSmall {
    public String calculate(String text) {
       int uppercase = 0;
       int lowercase = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i)))
                uppercase++;
            if (Character.isLowerCase(text.charAt(i)))
                lowercase++;
        }
        if (uppercase > lowercase){
            return "Big";
        }
        if (lowercase > uppercase){
            return "Small";
        }
        return "Same";
    }
}