package exam02;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        int[] nums ={22, 33, 44, 55,6, 78};
        Arrays.stream(nums).map(x -> x * x ).filter(x -> x % 2 == 1).forEach(System.out::println);

    }
}
