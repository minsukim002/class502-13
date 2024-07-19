package exam02;

public abstract class car {
    public abstract void start();
    public abstract void press();
    public abstract void turnoff();

    public void run(){  // 템플릿 메서드 패턴 [공통적으로 쓰는 메서드 순서!
        start();
        press();
        turnoff();
    }
}
