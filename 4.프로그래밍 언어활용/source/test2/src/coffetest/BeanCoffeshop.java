package coffetest;

public class BeanCoffeshop {
    int money;

    public String Brewing(int money){

        this.money += money;

        if(money == Menu.BeanLatte){
            return "콩다방 라떼를 구입했습니다.";
        }
        else {
            return null;
        }
    }
}
