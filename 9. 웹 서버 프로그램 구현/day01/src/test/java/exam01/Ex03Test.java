package exam01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;

public class Ex03Test {

    @TempDir
    private File temDir;

    @Test
    void test1(){
        String path = temDir.getAbsolutePath();
        System.out.println(path);
    }
    
    @Test
    @Timeout(6)
    void test2() throws Exception{
        Thread.sleep(5000);
    }
}
