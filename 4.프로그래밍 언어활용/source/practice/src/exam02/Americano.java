package exam02;

public class Americano implements Coffee{
    private int price;
    private String name;

    public Americano(String name, int price) {
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
