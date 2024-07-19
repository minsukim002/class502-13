package exam1;

public class ex07 {
    public static void main(String[] args) {

        for(int i = 1; i <= 9; i++){
            if(i % 2 == 0) {
                continue;  // 다시 for 문으로 돌아간다.
            }
            System.out.println(i + "단 ============");
                for (int j = 1; j <= 9; j++) {
                    // System.out.println(i + "X" + j + "=" + (i * j));
                    System.out.printf("%d X %d = %d\n", i, j, i * j);
                }


        }
    }
}
