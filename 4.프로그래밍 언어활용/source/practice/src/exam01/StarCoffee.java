package exam01;

public class StarCoffee extends Menu{
    int money;

    public String brewing(int money) {
        this.money += money;

        if (money == Menu.Staramericano) {
            return "별 다방 아메리카노를 구입했습니다.";
        }else {
            return "금액이 맞지 않습니다.";
        }
    }

}

