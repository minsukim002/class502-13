package exam03;

import java.sql.SQLOutput;

public class Ex01 {
    public static void main(String[] args) {
        StarBucks starBucks = new StarBucks();
        CoffeBean coffeBean = new CoffeBean();
        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 15000);

        kim.setMenu("아메리카노");
        lee.setMenu("라떼");
        try {
            starBucks.enter(kim).order().exit();
            coffeBean.enter(lee).order().exit();

            System.out.println(kim);
            System.out.println(lee);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("커피숍별 매출액 요약");
        Coffeshop.showSaleSummary(starBucks);
        Coffeshop.showSaleSummary(coffeBean);
    }
}
