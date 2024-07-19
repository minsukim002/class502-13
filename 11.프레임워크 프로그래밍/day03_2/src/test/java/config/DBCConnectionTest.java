package config;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class DBCConnectionTest {

    @Autowired
    private DataSource dataSource;


    @Test
    void test1() throws Exception{
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }
}
