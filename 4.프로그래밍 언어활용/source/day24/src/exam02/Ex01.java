package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Ex01_1 ex01_1 = new Ex01_1();
        Thread th1 = new Thread(ex01_1);
        Thread th2 = new Thread(ex01_1);
        th1.start();
        th2.start();
    }
}

class Ex01_1 implements Runnable{

    private account acc = new account();

    @Override
    public void run() {
       while (acc.getBalance() > 0) {
           int money = (int)(Math.random() * 3 + 1) *100;
           acc.witjdraw(money);
           System.out.println("balcance" + acc.getBalance());
       }
    }
}