package com.supermarket.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    //Information local database
    private final String jdbcURL = "jdbc:mysql://localhost:3306/supermarketdb";
    private final String jdbcUsername = "mirisrodos";
    private final String jdbcPassword = "123456";

    public DBConnection() {

    }
    //Da test lay duoc du lieu roi
    public Connection getConnection() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return cn;
    }
}
