package exam01;

public class ImplCalculator implements Calculator{
    @Override
    public Long factorial(long num) {

        long total = 1L;
        for(long i = 1; i <= num; i++){
            total*= i;
        }

        return total;
    }
}
