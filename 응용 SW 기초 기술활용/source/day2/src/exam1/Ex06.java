package exam1;

public class Ex06 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 0, j =10; ; i++, j +=2){
            total += i;
            System.out.println(j);
            if(i > 200){
                break;
            }

        }
    }
}
