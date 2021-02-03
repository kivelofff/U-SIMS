package cz.uranium.development.sims.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultDao {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost/data";
    private static final String USER = "user0514";
    private static final String PASSWORD = "123qwerty";

    private Connection connection;
    private Statement statement;

    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void init() throws SQLException {
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        statement = connection.createStatement();
    }

    private void releaseResources() throws SQLException {
        statement.close();
        connection.close();
    }
    
}
