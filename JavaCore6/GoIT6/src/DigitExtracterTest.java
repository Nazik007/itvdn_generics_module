import java.util.Arrays;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter {
    public int[] extract(String text) {
        String temp = text.replaceAll("[^\\d]","");
        int[] number = new int[temp.length()];

        for (int i = 0; i < number.length; i++) {
            number[i] = temp.charAt(i) - '0';
        }
        return number;
    }
}