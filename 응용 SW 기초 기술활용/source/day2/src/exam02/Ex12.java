package exam02;

public class Ex12 {
    public static void main(String[] args) {
        for(int i = 1; i <= 40; i++){
            int RoomNo = i % 10;
            System.out.printf("학생%d 방번호 %d입니다%n", i, RoomNo);

        }
    }
}