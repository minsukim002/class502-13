package 다른패키지;

public class Ex02 {
    public static void main(String[] args) {
        for(int i = 1; i <=40; i++){
            int roomNo = i % 10;
            System.out.printf("학생%d는 %d 방입니다.%n", i, roomNo);
        }
    }
}
