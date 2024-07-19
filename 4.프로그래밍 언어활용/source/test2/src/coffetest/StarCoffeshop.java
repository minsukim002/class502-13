package coffetest;

public class StarCoffeshop {
    int money;

    public String Brewing(int money){

        this.money += money;

        if(money == Menu.StarAmericano){
            return "별다방 아메리카노를 구입했습니다.";
        }
        else {
            return null;
        }
    }
}


