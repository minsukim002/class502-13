package exam01;

import javax.swing.*;

public class Ex02 {
    public static void main(String[] args) {
        Thread th = new Thread(() -> {String message = JOptionPane.showInputDialog("메세지입력");
            System.out.println(message);});
     th.start();
    }
}
