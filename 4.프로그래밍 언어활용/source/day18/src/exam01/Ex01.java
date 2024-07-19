package exam01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate startDate = LocalDate.of(today.getYear(), today.getMonth(), 1);

        int yoil =startDate.getDayOfWeek().getValue();
        System.out.println(yoil);

        LocalDate endDate = startDate.plusMonths(1).minusDays(1);
        System.out.println(endDate);
    }

}
