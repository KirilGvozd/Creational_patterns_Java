package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String[] args) throws SQLException {
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        Connection connection = instance.getConnection();

        Statement statement = connection.createStatement();

        statement.execute("CREATE TABLE Students (ID int primary key, name varchar(65))");

        System.out.println("Table Students was created.");

        int rows = statement.executeUpdate("INSERT INTO Students (ID, name) values (1, 'Kirill')");

        if (rows > 0) {
            System.out.println("1 row was inserted.");
        }

        connection.close();
    }
}
