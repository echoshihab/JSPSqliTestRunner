package com.test.util;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBUtil {
    public static final String DB_IP = System.getenv("DB_ADDRESS");
    public static final String DB_PORT = System.getenv("DB_PORT");
    public static final String DB_USER = System.getenv("DB_USER");
    public static final String DB_PASSWORD = System.getenv("DB_PASSWORD");
    public static final String DB_NAME = System.getenv("DB_NAME");

    /**
     * Gets a database connection
     *
     * @return a database connection
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            String connectionString = "jdbc:sqlserver://" +
                    DB_IP +
                    ":" +
                    DB_PORT +
                    ";DatabaseName=" +
                    DBUtil.DB_NAME +
                    ";user=" +
                    DB_USER +
                    ";password=" +
                    DB_PASSWORD +
                    ";integratedSecurity=true;";

            conn = DriverManager.getConnection(connectionString);

        } catch (Exception e) {
            System.out.println("DBUtil.getConnection: Got an Exception: " + e.getMessage());
        }
        return conn;
    }
}
