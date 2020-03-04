package assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlServer {
    Connection connection;
    private final String BASE_URL = "jdbc:mysql://localhost:3306/";
    private final String DATABASE_NAME = "t1907m";
    private final String USER = "root";
    private final String PASSWORD = "";
    private final String TIMEZONE = "&serverTimezone=UTC";
    private final String CLASS_FOR_NAME = "com.mysql.cj.jdbc.Driver";
    private final String UTF8_URL = "?useUnicode=true&characterEncoding=utf-8";
    private static MySqlServer instance;

    public static MySqlServer getInstance(){
        if (instance == null){
            instance = new MySqlServer();
        }
        return instance;
    }
    public Connection getConnection(){
        try {
            if (connection == null || connection.isClosed()){
                Class.forName(CLASS_FOR_NAME);
                connection = DriverManager.getConnection(BASE_URL + DATABASE_NAME + UTF8_URL + TIMEZONE, USER, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
