package exam03;

public interface Coffeshop {
     Coffeshop enter(Person person);
     Coffeshop order();
     void exit();
     int getTotalSalePrice();
     String getName();

     static void showSaleSummary(Coffeshop shop){
          System.out.printf("%s의 총 매출은 %d원 입니다.%n", shop.getName(),
                  shop.getTotalSalePrice());
     }
}
