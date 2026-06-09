package sqlprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryDatabaseSystem {
    static final String URL = "jdbc:postgresql://localhost:5433/library_db";

    static final String User = "postgres";

    static final String password = "your_password";

    static Scanner sc = new Scanner(System.in);

    //add books
    public static void addBooks(Connection con){
        try {
            System.out.println("Enter the Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the Book title: ");
            String title = sc.nextLine();

            System.out.println("Enter the Author name: ");
            String author = sc.nextLine();

            String query = "INSERT INTO books(id, title, author) VALUES(?, ?, ?)"; 

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, author);

            ps.executeUpdate();

            System.out.println("Books Added Successfully.");


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //view books
    public static void viewBooks(Connection con){
        try {
            String query = "SELECT * FROM books";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.println("\n===== BOOK LIST =====");

            while(rs.next()){
                System.out.println(rs.getInt("id") + " | " + 
                                    rs.getString("title") + " | " + 
                                    rs.getString("author"));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //update books
    public static void updateBooks(Connection con){
        try {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Title: ");
            String title = sc.nextLine();

            String query = "UPDATE books SET title = ? WHERE id = ?";

            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, title);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();

            if(rows > 0){
                System.out.println("Books Updated. ");
            }else{
                System.out.println("Books not found. ");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //delete books
    public static void deleteBooks(Connection con){
        try {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();

            String query = "DELETE FROM books WHERE id = ?"; 

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if(rows > 0){
                System.out.println("Book Deleted");
            }else{
                System.out.println("Book not found");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection(URL, User, password);
            System.out.println("Database Connected");
            int choice;

            do {
                System.out.println("\n===== LIBRARY SYSTEM =====");
                System.out.println("1. Add Book");
                System.out.println("2. View Books");
                System.out.println("3. Update Book");
                System.out.println("4. Delete Book");
                System.out.println("5. Exit");
                System.out.print("Enter Choice: ");

                choice = sc.nextInt();

                switch(choice) {
                    case 1:
                        addBooks(con);
                        break;

                    case 2:
                        viewBooks(con);
                        break;

                    case 3:
                        updateBooks(con);
                        break;

                    case 4:
                        deleteBooks(con);
                        break;

                    case 5:
                        System.out.println("Thank You");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } while(choice != 5);
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
