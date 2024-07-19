package exam01;

import java.io.File;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) throws IOException{
//        File file = new File("D:/test1.txt");
//        file.createNewFile();

        File dir = new File("D:/fstdy");
        File file = new File(dir, "test1.txt");

        if(dir.mkdir()){
            dir.mkdir();
        }
        file.createNewFile();
    }

}
