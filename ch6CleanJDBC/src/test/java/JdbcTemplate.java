import DaoImpl.JdbcSingerDao;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTemplate {

    @Test
    public void testSpringDao(){
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("dataSource.xml");
        DataSource dataSource = genericXmlApplicationContext.getBean("dataSourceStandartDriver",DataSource.class);
        try{
            org.springframework.jdbc.core.JdbcTemplate jdbcTemplate = new org.springframework.jdbc.core.JdbcTemplate();
            jdbcTemplate.setDataSource(dataSource);

            JdbcSingerDao jdbcSingerDao = new JdbcSingerDao();
            jdbcSingerDao.setJdbcTemplate(jdbcTemplate);
            System.out.println(jdbcSingerDao.findLastNameById(1L));

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
