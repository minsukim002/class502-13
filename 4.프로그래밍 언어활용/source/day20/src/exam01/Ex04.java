package exam01;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        char ch = (char)isr.read();
        System.out.println(ch);

    }
}
