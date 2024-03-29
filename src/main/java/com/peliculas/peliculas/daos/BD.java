package com.peliculas.peliculas.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {
    private static final String SQL_TABLE_CREATE = "DROP TABLE IF EXISTS PELICULAS;" +
            "CREATE TABLE PELICULAS (" +
            "ID INT AUTO_INCREMENT PRIMARY KEY," +
            "CATEGORIA VARCHAR(100) NOT NULL," +
            "PREMIOS INT NOT NULL," +
            "TITULO VARCHAR(100) NOT NULL)";


    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:./db_peliculas","sa","");
    }

    public static void createTable() {
        Connection connection = null;

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();
            statement.execute(SQL_TABLE_CREATE);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
