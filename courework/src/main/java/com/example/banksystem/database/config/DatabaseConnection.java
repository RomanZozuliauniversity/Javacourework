package com.example.banksystem.database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String HOST = "localhost";
    private static final Integer PORT = 5432;
    private static final String DB_NAME = "bank_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    static Connection connection;

    public static Connection getConnection() throws SQLException {

        connection = DriverManager.getConnection(String.format("jdbc:postgresql://%s:%s/%s", HOST, PORT, DB_NAME), USER, PASSWORD);

        return connection;

    }

}
