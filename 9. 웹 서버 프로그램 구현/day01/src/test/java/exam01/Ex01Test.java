package exam01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class Ex01Test {

    @Test
    void teat1(){
        Calculator cal = new Calculator();
        int num1 =10, num2 = 20;
        int result = cal.add(num1, num2);
        assertEquals(30, result);
    }
    @Disabled
    @Test
    void test2(){
        LocalDate expected  = LocalDate.now();
        LocalDate date = LocalDate.of(2024, 6, 5);

        assertEquals(expected, date);

        assertSame(expected, date);
    }
    @Disabled
    @Test
    @DisplayName("테스트....1")
    void test3(){
        fail();
    }
}
