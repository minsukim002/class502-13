package exam20;

public class Ex03 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2;

            String str = null;
            System.out.println(str.toUpperCase());

            System.out.println(result);

        }catch (ArithmeticException | NullPointerException e){
            e.printStackTrace();
        }


        System.out.println("매우 중요한 실행코드");
    }
}
