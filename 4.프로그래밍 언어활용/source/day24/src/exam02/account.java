package exam02;

public class account {
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }
    public synchronized void witjdraw(int money){
        if(balance >= money){
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){}
            balance -= money;
        }
    }
}
