package exam01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 터미널에서 입력 받기.
        System.out.println("이름을 입력하세요:");
        String name = sc.nextLine();
        System.out.printf("이름:%s%n", name);
    }
}
