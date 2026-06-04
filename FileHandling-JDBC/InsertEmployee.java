package JDBC;

import java.sql.*;

public class InsertEmployee {
    public static void main(String[] args) {
        String URL = "jdbc:postgresql://localhost:5433/employee_db";
        String user = "postgres";
        String password = "password";

        try {
            
            Connection con = DriverManager.getConnection(URL, user, password);
            String sql = "INSERT INTO employee VALUES (1, 'kashish', 50000)";

            Statement st = con.createStatement();
            st.executeUpdate(sql);

            System.out.println("Employee Added.");
            con.close(); 
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
