package exam1;

public class ex11 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i+= 2){
            System.out.println(i + "단 =========");
            for(int j = 0; j <= 9; j++){
                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }
        }
    }
}
