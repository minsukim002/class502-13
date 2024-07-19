package exam02;

public class StarBucks implements CoffeeShop {
    private int totalProfit;//수입
    private String name;//카페이름

    public StarBucks() {
        name = "스타벅스";
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
