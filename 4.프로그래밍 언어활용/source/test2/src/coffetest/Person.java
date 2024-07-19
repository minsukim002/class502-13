package coffetest;

public class Person {
    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyStarCoffe(StarCoffeshop sCoffe, int money){
        String message = sCoffe.Brewing(4000);
        if(message != null){
            this.money -= money;
            System.out.printf("%s가 %d를 내고 %s%n" , name, money , message);
        }
    }
    public void buyBeanCoffe(BeanCoffeshop bCoffe, int money){
        String message = bCoffe.Brewing(4500);

        if(message != null){
            this.money -= money;
            System.out.printf("%s가 %d를 내고 %s" , name, money , message);
        }
    }
}
