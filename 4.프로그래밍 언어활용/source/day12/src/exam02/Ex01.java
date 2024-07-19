package exam02;

import java.util.HashMap;

public class Ex01 {
    public static void main(String[] args) {
        HashMap<String, String> members = new HashMap<>();
        members.put("user01", "사용자01");
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");
        members.putIfAbsent("user03", "(수정)");

        HashMap<String, String> members2 = new HashMap<>();
        members2.put("user4", "사용자04");
        members2.put("user5", "사용자05");
        members.put("user03", "(수정)");
        members.putAll(members2);


        System.out.println(members);
    }
}
