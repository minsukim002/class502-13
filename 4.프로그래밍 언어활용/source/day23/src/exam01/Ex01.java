package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Runnable r = () ->{
          for (int i = 0; i<5; i++){
              System.out.println("Thread2-" + i);

              for(long j = 0; j < 100000000000L; j++);
          }
        };

        Ex01_1 th1 = new Ex01_1();
        Thread th2 = new Thread(r);

       // th1.run();
       // th2.run();
        th1.start();
        th2.start();
    }
}


class Ex01_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Thread1-" + i);
        }
    }

}