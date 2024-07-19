package exam02;

public class Latte implements Coffee {
    private int price;
    private String name;

    public Latte(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
