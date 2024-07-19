package exam01;

import java.io.File;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:/fstudy/sub1/sub2/sub3");
        File file = new File(dir, "test1.txt");

        if(!dir.exists()){
            dir.mkdir();
        }

        file.createNewFile();
    }
}
