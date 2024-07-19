package exam02;

public class Ex01 {
    public static void main(String[] args) {

        StarBucks starBucks = new StarBucks();
        CoffeeBean coffeeBean = new CoffeeBean();

        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 20000);

        kim.stopBy(starBucks);
        kim.buy(starBucks.getCoffee("americano"));

        lee.stopBy(coffeeBean);
        lee.buy(coffeeBean.getCoffee("latte"));
        lee.buy(coffeeBean.getCoffee("americano"));


    }
}
