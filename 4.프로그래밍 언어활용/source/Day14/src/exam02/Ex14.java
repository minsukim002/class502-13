package exam02;

import java.util.stream.IntStream;

public class Ex14 {
    public static void main(String[] args) {
        int total = IntStream.range(1, 100).filter(x -> x % 2 ==1).sum();

    }
}
