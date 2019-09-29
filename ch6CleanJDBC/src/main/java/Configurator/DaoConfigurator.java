package Configurator;

import DaoImpl.JdbcSingerDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class DaoConfigurator {

    @Bean
    public DataSource dataSource(){
        try{
            EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
            return embeddedDatabaseBuilder.setType(EmbeddedDatabaseType.H2).build();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    public JdbcSingerDao jdbcSingerDao(){
        JdbcSingerDao jdbcSingerDao = new JdbcSingerDao();
        jdbcSingerDao.setJdbcTemplate(jdbcTemplate());
        return jdbcSingerDao;
    }
}
