package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. loading a Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Creating a connection
        String username = "root";
        String password = "root";
        String connectionUrl = "jdbc:mysql://localhost:3306/730batchlive";

        Connection con = DriverManager.getConnection(connectionUrl,username,password);

        // 3. creating a statement
        Statement st = con.createStatement();

        // 4. executing query
        // DDL  - Data definition language --> select
        // DML - Data Manipulation language --> insert , update , delete

        String sql = "insert into student values(34,'Rohini','IT',78)";
        st.executeUpdate(sql);


    }
}
