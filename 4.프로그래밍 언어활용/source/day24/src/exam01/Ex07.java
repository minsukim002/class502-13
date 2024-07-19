package exam01;

public class Ex07 {


    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(() ->{
            while(true){
                try {
                    Thread.sleep(10000);
                }catch (InterruptedException e){}
                System.out.println("InterupedException 발생 !");
            }
        });
        th.start();

        Thread.sleep(3000);

        th.interrupt();

    }
}
