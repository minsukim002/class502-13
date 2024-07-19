package coffetest;

public class Ex01 {
    public static void main(String[] args) {


        Person kim = new Person("kim", 10000);
        StarCoffeshop starCoffeshop = new StarCoffeshop();
        BeanCoffeshop beanCoffeshop = new BeanCoffeshop();

        kim.buyStarCoffe(starCoffeshop, 4000);
        kim.buyBeanCoffe(beanCoffeshop, 4500);
    }
}
