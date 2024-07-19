package exam01;

import java.io.*;

public class Ex09 {
    public static void main(String[] args) {
    try(FileInputStream fis = new FileInputStream("book.txt");
    ObjectInputStream ois = new ObjectInputStream(fis)) {

        Ex08 book1 = (Ex08)ois.readObject();
        System.out.println(book1);
    }catch (IOException | ClassNotFoundException e){
        e.printStackTrace();
    }

    }}