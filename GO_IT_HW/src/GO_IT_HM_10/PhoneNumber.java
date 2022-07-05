package GO_IT_HM_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/nsovi/Desktop/GO_IT_HW/src/file.txt");
        Scanner scan = new Scanner(file);
        String phoneNumberString = "";
        while (scan.hasNextLine()) {
            phoneNumberString = phoneNumberString.concat(scan.nextLine() + " ");
        }
        scan.close();

        String regex = "(\\d{3}-\\d{3}-\\d{4})|(\\d{3}\\s\\d{3}\\s\\d{4})|(\\(\\d{3}\\)\\s\\d{3}-\\d{4})";
        List<String> phoneNumberList = new ArrayList<>();
        Matcher matcher = Pattern.compile(regex).matcher(phoneNumberString);
        while (matcher.find()) {
            phoneNumberList.add(matcher.group());
        }
        String [] numbers = phoneNumberList.toArray(new String[0]);
        String [] copy = new String[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}"))
                copy[count++] = numbers[i];
            if (numbers[i].matches("\\d{3}-\\d{3}-\\d{4}"))
                copy[count++] = numbers[i];
        }
        String[] validPhoneNumbers = Arrays.copyOf(copy,count);
        String result = "";
        for (String s: validPhoneNumbers) {
            result += s + "\n";
        }
        System.out.println(result);
    }
}
