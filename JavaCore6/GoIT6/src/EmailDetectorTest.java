class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}

class EmailDetector {
    public boolean isPresent(String text) {
        String regex = ".*\\S{2}@\\S{2}.*";
        return text.matches(regex);
    }
    }
