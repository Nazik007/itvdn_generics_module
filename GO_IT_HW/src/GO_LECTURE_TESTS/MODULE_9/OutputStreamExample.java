package GO_LECTURE_TESTS.MODULE_9;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        byte[] out = new byte[]{-128, -127, 120, 5, 9, 32};
        byte[] data = new byte[out.length];

        OutputStream outputStream = new OutputStream() {
            private int index = 0;

            @Override
            public void write(int b) throws IOException {
                data[index++] = (byte) b;
            }
        };

        outputStream.write(out);

        System.out.println(Arrays.toString(out));
    }
}
