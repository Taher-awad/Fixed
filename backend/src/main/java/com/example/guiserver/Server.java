package com.example.guiserver;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Server {
    public static void startServer() {
        DatabaseManager.getConnection();
        int port = 9999;
        MultiClientServer server = new MultiClientServer(port);
        server.start();
    }
}
