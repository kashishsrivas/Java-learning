package JDBC;

//JDBC = Java Database Connectivity

import java.sql.Connection;
import java.sql.DriverManager;

//this file contains the connection between postgres and java file.
public class JdbcDemo {
    public static void main(String[] args) {
        String URL = "jdbc:postgresql://localhost:5433/employee_db";
        String user = "postgres";
        String password = "password";

        try {
            Connection con = DriverManager.getConnection(URL,user,password);
            System.out.println("Connected Successfully");
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}