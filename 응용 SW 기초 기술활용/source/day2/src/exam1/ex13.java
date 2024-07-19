package exam1;

public class ex13 {
    public static void main(String[] args) {
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                if(j < i){
                    continue;    // -> j가 i 보다 클경우 중지하고 다시 for 문으로.
                }
                 System.out.printf("%d X %d = %d\n", i, j, i * j);

            };
        }
    }
}
