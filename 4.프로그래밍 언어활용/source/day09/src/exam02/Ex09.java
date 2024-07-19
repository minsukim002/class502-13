package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex09 {
    public static void main(String[] args) {

    }
    public static boolean checkMobile(String mobile){

        Pattern pattern = Pattern.compile("01[016]");
        Matcher matcher = pattern.matcher(mobile);


        boolean matched = matcher.find();
        return matched;
    }
}
