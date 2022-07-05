package GO_LECTURE_TESTS.MODULE_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileExample {
    public static void main(String[] args) {
        String absolutePath = "/Users/nsovi/Desktop/GO_IT_HW/Some text.txt";

        try (FileInputStream fileInputStream = new FileInputStream(absolutePath)) {
            int ch = fileInputStream.read();
            while (ch != -1){
                System.out.print((char) ch);
                ch = fileInputStream.read();
            }

        }catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }
}
