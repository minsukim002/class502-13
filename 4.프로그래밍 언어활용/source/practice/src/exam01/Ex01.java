package exam01;

public class Ex01 {
    public static void main(String[] args) {

        Person kim = new Person("kim", 10000);
        StarCoffee starCoffee = new StarCoffee();
        BeanCoffe beanCoffe = new BeanCoffe();

        kim.buystarcoffee(starCoffee, 4000);
        kim.buybeancoffee(beanCoffe, 4500);
    }
}
