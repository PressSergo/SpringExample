import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class testDriverManagerDataSource {

    @Test
    public void testSpringDao(){
        GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext("dataSource.xml");
        DataSource dataSource = genericXmlApplicationContext.getBean("dataSourceStandartDriver",DataSource.class);
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from singer");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getLong("id")+
                        "    "+resultSet.getString("first_name"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
