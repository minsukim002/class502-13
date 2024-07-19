package exam01;

import java.time.LocalDate;
import java.time.Period;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate enddate = LocalDate.of(2024, 9, 30);

        Period period = Period.between(today, enddate);
        int month = period.getMonths();
        int day = period.getDays();
        System.out.println(month + day);
    }
}
