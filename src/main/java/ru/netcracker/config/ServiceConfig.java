package ru.netcracker.config;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.postgresql.ds.PGPoolingDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "ru.netcracker")
public class ServiceConfig {
    /** Бин, отвечающий за инициализацию базы данных
     * @return source
     */
    @Bean
    public DataSource getDataSource() {
        PGPoolingDataSource source = new PGPoolingDataSource();
        source.setServerName("localhost");
        source.setDatabaseName("postgres");
        source.setUser("postgres");
        source.setPassword("1234");
        source.setMaxConnections(10);
        return source;
    }

    /**бин,отвечающий за создание и инициализацию JdbcTemplate
     * @return JdbcTemplate
     */
    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }
}
