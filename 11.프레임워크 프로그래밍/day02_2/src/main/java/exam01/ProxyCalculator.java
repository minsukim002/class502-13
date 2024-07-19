package exam01;

public class ProxyCalculator implements Calculator{

    // ImplCalculator, RecCalculator 대신 수행해 주려면? 다형성

    private Calculator calculator;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
    @Override
    public long factorial(long num) {

        long result = calculator.factorial(num); // 다른 계산기의 factorial 연산을 대신 수행.

        return result;
    }
}
