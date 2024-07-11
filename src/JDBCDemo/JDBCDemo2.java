package JDBCDemo;

import java.sql.*;

public class JDBCDemo2 {

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

        String sql = "select * from student where branch='IT'";

        ResultSet rs = st.executeQuery(sql);

        while (rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }


    }
}
