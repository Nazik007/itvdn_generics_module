import java.beans.JavaBean;
import java.util.Arrays;

public class ArlanHelper {
    public String drawQuad(int n) {
        String result = "";

        int lines = n;

        while (lines > 0) {
            lines--;

            int columns = n;
            while (columns > 0) {
                result += "*";
                columns--;
            }

            result += "\n";
        }

        return result;
    }

    public String drawRect(int width, int height, char c) {
        String result = "";

        int lines = height;

        while (lines > 0) {
            lines--;

            int columns = width;
            while (columns > 0) {
                result += c;
                columns--;
            }

            result += "\n";
        }

        return result;
    }

    public String drawLine(int length) {
        String result = "";

        boolean star = true;

        while (length > 0) {
            result += star ? '*' : '#';
            star = !star;
            length--;
        }

        return result;
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[]{'J', 'a', 'v', 'a'}, 3));
    }

    public String drawPattern(char[] pattern, int repeatCount) {
        String temp = "";
        String result = "";
        if (pattern.length != 0) {
            int i = 0;
            while (i < pattern.length) {
                temp += pattern[i];
                i++;
            }
            while (repeatCount>0){
                result+=temp;
                repeatCount--;
            }
        }
        return result;
    }
}