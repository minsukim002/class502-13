package exam01;

import java.util.Arrays;

public class Ex0 {
    public static void main(String[] args) {
        char[] chars = new char[10];
        Arrays.fill(chars, '*');
        System.out.println(Arrays.toString(chars
        ));
        String userId = "user01";
        char[] chars2 = userId.toCharArray();
        Arrays.fill(chars2, 4, userId.length(), '*');
        System.out.println(Arrays.toString(chars2));
        userId = String.valueOf(chars2);
        System.out.println(userId);
    }
}
