package com.example.guiserver;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseManager {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            connect();
        }
        return connection;
    }

    private static void connect() {
        Properties props = new Properties();
        try (InputStream input = DatabaseManager.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            props.load(input);

            String url = String.format("jdbc:mysql://%s:%s/%s?user=%s&password=%s",
                    props.getProperty("db.host"),
                    props.getProperty("db.port"),
                    props.getProperty("db.name"),
                    props.getProperty("db.user"),
                    props.getProperty("db.password"));

            connection = DriverManager.getConnection(url);
            System.out.println("Connected to the database successfully!");
        } catch (Exception e) {
            System.err.println("Database connection failed!");
            e.printStackTrace();
        }
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
