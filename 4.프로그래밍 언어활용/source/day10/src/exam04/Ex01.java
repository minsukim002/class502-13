package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple());

//        if (Applebox.getItem() instanceof Grape){
//        Grape apple = (Grape) appleBox.getItem();
//        System.out.println(apple.get());
//        }
//

        Box grapeBox = new Box();
        grapeBox.setItem(new Grape());
    }
}
