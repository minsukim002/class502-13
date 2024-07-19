package test;

public class Q2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 40; i++){
            int RoomNo = i %10;
            System.out.printf("학생%d은 방번호 %d입니다%n", i, RoomNo);
        }
    }
}
