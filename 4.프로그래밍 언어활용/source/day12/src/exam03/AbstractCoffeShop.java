package exam03;

import java.sql.SQLOutput;
import java.util.Map;

public abstract class AbstractCoffeShop implements Coffeshop {
    private String name;  //커피샵 이름
    private int totalSalePrice; // 매출
    private Map<String, Integer>menus;   // 개별 커피샵 메뉴.
    private Person person;

    public AbstractCoffeShop(String name, Map<String, Integer> menus){
       // 초기화 커피숍 이름 및 메뉴.
        this.name = name;
        this.menus = menus;
    }
    @Override
    public Coffeshop enter(Person person) {// 사람입장
        this.person = person;
        System.out.printf("%s님이 %s에 입장하셨습니다.%n", person.getName(),name);

        return this;
    }

    @Override
    public Coffeshop order() {  // 사람 마다 주문 받기. + 커피샵 매출 증가. +주문한 사람의 비용 차감.
        String menu = person.getMenu();
        if(menu == null){
            throw new RuntimeException("메뉴를 선택하세요");
        }
        int price = menus.getOrDefault(menu, 0);
        if(price == 0){
            throw new RuntimeException("없는 메뉴입니다.");
        }

        int money = person.getMoney();
        if(money < price){
            throw new RuntimeException(menu + "를 구입하기에 부족한 급액입니다.");
        }

        totalSalePrice += price;
        money -= price;
        person.setMoney(money);

        System.out.printf("%s님이 %s에서 %s를 %d에 주문하셨습니다.%n", person.getName(), name, menu, price);
        return this;
    }
    public void exit(){
        System.out.printf("%s님이 %s에서 퇴장하였습니다.%n", person.getName(), name);
        person = null;
    }
    public int getTotalSalePrice(){
        return totalSalePrice;
    }
    public String getName(){
        return name;
    }
}
