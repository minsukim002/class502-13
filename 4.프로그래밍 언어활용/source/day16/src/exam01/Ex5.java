package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex5 {
    public static void main(String[] args) {
        String[] names = {"이름1","이름1","이름2","이름3","이름4",};
        List<String> nameList = Arrays.stream(names).collect(Collectors.toList());
        System.out.println(nameList);



    }


}
