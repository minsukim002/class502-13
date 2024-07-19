package exam02;

public class Ex09 {
    public static void main(String[] args) {
        for(int i = 1; i <= 40; i++){
            int Roomnum = i % 10;
            System.out.printf("학생%d는 방번호%d번 입니다.%n", i , Roomnum);
        }
    }
}
