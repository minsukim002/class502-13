package exam02;

public class Ex04 {
    public static void main(String[] args) {
        FruitBox<Apple> applebox = new FruitBox<>();
        applebox.add(new Apple());

        Jucier.make2(applebox);

      //  FruitBox<Grape> grapebox = new FruitBox<>();
        FruitBox<Fruit> grapebox = new FruitBox<>();
        grapebox.add(new Grape());
        Jucier.make2(grapebox);
    }
}
