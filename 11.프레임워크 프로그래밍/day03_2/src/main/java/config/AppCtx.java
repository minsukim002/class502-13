package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppCtx {

    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        DataSource ds = new DataSource();

        /* DB 연결 설정 S */
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("spring");
        ds.setPassword("oracle");
        /* DB 연결 설정 E */


        /* 커넥션 풀 설정 S */
        ds.setTestWhileIdle(true);// 객체 유효성 체크
        ds.setInitialSize(2);
        ds.setMaxActive(100);
        ds.setTimeBetweenEvictionRunsMillis(10 * 1000); //10초에 한번씩 연결 상태 체크
        ds.setMinEvictableIdleTimeMillis(1000  * 60); // 유효 객체 생존 시간 1분.
        /* 커넥션 풀 설정 S */

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
}
