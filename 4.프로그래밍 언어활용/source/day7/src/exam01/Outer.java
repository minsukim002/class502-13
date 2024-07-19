package exam01;

public class Outer {

    private Calculator cal2 = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    public Calculator method(int num3) {
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2 + num3;
            }
        };

        return cal;
    }
}