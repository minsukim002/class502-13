package exam02;

public class CoffeeBean implements CoffeeShop {

    private int totalProfit;
    private String name;
    public CoffeeBean() {
        name = "커피빈";
    }

    @Override
    public void addProfit(int price) {
        this.totalProfit += price;

        System.out.printf("%s의 총 수입은 %d%n", name, totalProfit);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Coffee getCoffee(String name) {
        return name.equals("latte") ? new Latte("라떼", 4500) : new Americano("아메리카노", 4000);
    }
}
