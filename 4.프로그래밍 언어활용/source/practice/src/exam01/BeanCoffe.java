package exam01;

public class BeanCoffe{
    int money;

    public String brewing(int money){
        this.money += money;

        if(money == Menu.BeanLatte){
            return "콩 다방 라떼를 구입했습니다.";
        } else{
            return "금액이 맞지 않습니다.";
        }

    }

}
