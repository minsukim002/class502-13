package exam02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1","이름2","이름3");
        Collections.sort(names);
        System.out.println(names);
    }
}
