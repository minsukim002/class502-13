package exam05;

import exam03.A;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBOx = new Box<Apple>();
        appleBOx.setItem(new Apple());
        //appleBOx.setItem(new  Grape());
        Apple apple = appleBOx.getItem();
        System.out.println(apple.get());

    }
}
