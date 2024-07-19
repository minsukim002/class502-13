package exam01;

import java.util.Map;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("년 월 입력:");
           String input = sc.nextLine(); // 2024 5

            if (input.equals("exit")){
                System.out.println("종료합니다.");
                break;
            }

            try {
                String[] date = input.split("||s+");
                int year = Integer.parseInt(date[0]);
                int month = Integer.parseInt(date[1]);

                System.out.printf("------%d년 %d월 -----%n", year, month);
                System.out.println("일 월 화 수 목 금 토");

            }catch (Exception e){ // 숫자 형식 오류가 발생한 경우
                System.out.println("입력 형식이 잘못되었습니다. 입력 예) 2024 5");
                continue;
            }
        }

    }
    public static Object getCalendar(int year, int month){

        return null;
    }
}
