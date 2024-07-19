package exam01;

import java.util.function.BiFunction;

public class Ex02 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> clac = (a, b) -> a + b;
        int result = clac.apply(10, 20);
        System.out.println(result);
    }
}
