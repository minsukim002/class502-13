package exam01;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] scoures = {67, 80 , 100, 98, 76, 56 };

        int max = Arrays.stream(scoures)
                .reduce((a, b) -> a > b ? a: b)
                .getAsInt();
        System.out.println(max);
    }
}
