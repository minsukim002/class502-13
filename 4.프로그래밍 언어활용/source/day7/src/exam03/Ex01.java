package exam03;

public class Ex01 {
    public static void main(String[] args) {
        try(Resources res = new Resources();
        Resources2 res2 = new Resources2()) {
            //res가 AutoClosable 인터페이스 구현 객체인지 체크 -> close() 메서드 자동 호출
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
