package exam01;

import java.io.*;
import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args)  {
        int[] scores = {90, 88, 65, 100, 78 , 98};

        try(FileOutputStream fos = new FileOutputStream("score.txt");
            DataOutputStream dos = new DataOutputStream(fos)){

            for(int score : scores){
                dos.writeInt(score);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
