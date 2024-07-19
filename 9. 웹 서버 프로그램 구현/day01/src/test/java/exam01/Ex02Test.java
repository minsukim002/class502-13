package exam01;

import lombok.Builder;
import org.junit.jupiter.api.*;

public class Ex02Test {

    @BeforeAll
    static void beforeAll(){
        System.out.println("BEFORE ALL");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("AFTER ALL");
    }

    @BeforeEach
    @AfterEach
    void beforeEach(){
        System.out.println("BEFORE EACH");
    }

    @Test
    void test1(){
        System.out.println("테스트1 진행");
    }
    @Test
    void test2(){
        System.out.println("테스트2 진행");
    }
}
