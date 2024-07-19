package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(60, 70, 80 , 99, 77);
        Long sum = (long) scores.stream().mapToInt(x -> x).sum();
        System.out.println(sum);
    }
}
