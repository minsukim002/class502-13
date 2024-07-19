package exam02;

public class Person {

    private CoffeeShop coffeeShop;//들릴 커피숍 이름
    private int money;//소지금
    private String name;//사람 이름

    public Person(String name, int money) {//생성자
        this.name = name;
        this.money = money;
    }

    public void stopBy(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }//들리는 커피숍 이름

    public void buy(Coffee coffee) {//커피구매
        int price = coffee.getPrice();
        if (money >= price) {
            money -= price;
            coffeeShop.addProfit(price);
            System.out.printf("%s가 %s에서 %s를 %d원에 샀습니다. 남은 금액은 %d 입니다.%n", name, coffeeShop.getName(), coffee.getName(), price, money);
        }
    }
}
