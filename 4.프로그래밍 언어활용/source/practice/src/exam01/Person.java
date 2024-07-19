package exam01;

public class Person {
    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void buystarcoffee(StarCoffee sCoffee, int money){
        String message = sCoffee.brewing(4000);
        if(message != null){
            this.money -= money;
            System.out.println(name + "는" + money + "짜리  " +
                    "" + message);
        }
    }

    public void buybeancoffee(BeanCoffe bCoffe, int money){
        String message = bCoffe.brewing(4500);
        if(message != null){
            this.money -= money;
            System.out.println(name + "씨가" + money +"으로  "+ message );
        }
    }
}




