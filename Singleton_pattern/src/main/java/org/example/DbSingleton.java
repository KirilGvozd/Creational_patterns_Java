package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private Connection connection = null;

    private static class LazyHolder {
        static final DbSingleton INSTANCE = new DbSingleton();
    }

    private DbSingleton() {
        try {
            String jdbcURL = "jdbc:h2:mem:test";
            connection = DriverManager.getConnection(jdbcURL);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public static DbSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }

}
