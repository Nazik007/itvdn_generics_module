class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength {
    public double count(String phrase) {
        String[] arr = phrase.split(" ");
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i].length();
        }
        return (double) result / arr.length;
    }
}