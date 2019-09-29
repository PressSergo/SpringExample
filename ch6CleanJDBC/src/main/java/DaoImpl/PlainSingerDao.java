package DaoImpl;

import DaoInterface.SingerDao;
import Entities.Singer;

import java.sql.*;
import java.util.List;

public class PlainSingerDao implements SingerDao {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Music","postgres","1");
    }

    private void closeConnection(Connection connection){
        if (connection == null){
            return;
        }
        try{
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    @Override
    public List<Singer> findAll() {
        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from singer");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getLong("id")+
                        "    "+resultSet.getString("first_name"));
            }
            preparedStatement.close(); // закрываем statement
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            closeConnection(connection);
        }
        return null;
    }

    @Override
    public List<Singer> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public String findLastNameById(Long id) {
        return null;
    }

    @Override
    public String findFirstNameById(Long id) {
        return null;
    }

    @Override
    public void insert(Singer singer) {

    }

    @Override
    public void update(Singer singer) {

    }

    @Override
    public void delete(Long singerId) {

    }

    @Override
    public List<Singer> findAllWithDetail() {
        return null;
    }

    @Override
    public void insertWithDetail(Singer singer) {

    }
}
