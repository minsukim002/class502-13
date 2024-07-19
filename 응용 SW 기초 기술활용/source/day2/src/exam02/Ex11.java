package exam02;

public class Ex11 {
    public static void main(String[] args) {
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                if(j >= i) { System.out.printf("%d X %d = %d\n", i, j, i * j);
                }
            };
        }
    }
}
