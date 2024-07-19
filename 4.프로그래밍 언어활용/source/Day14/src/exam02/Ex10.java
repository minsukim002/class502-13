package exam02;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Ex10 {
    public static void main(String[] args) {
        int[] scores = {60, 70, 80, 90, 100};
        IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
        double avg= stat.getAverage();
        Long count = stat.getCount();
        int max = stat.getMax();
        int min = stat.getMin();
        Long sum = stat.getSum();

        System.out.printf("평균 : %f, 총 갯수 : %d, 최대: %d, 최소: %d, 합계:%d%n", avg, count, max, min, sum);
    }
}
