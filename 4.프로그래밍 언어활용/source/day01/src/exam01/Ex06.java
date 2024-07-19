package exam01;

public class Ex06 {
    public static void main(String[] args) {
        for(int i = 1; i <=9; i++ ){  // i = i + 1;
            System.out.println(i + "단=====");
            for(int j= 2; j <=9; j++ ){
                if(j > i ){
                System.out.printf("%d X %d = %d%n", i, j, i*j );}
            }
        }
    }
}
