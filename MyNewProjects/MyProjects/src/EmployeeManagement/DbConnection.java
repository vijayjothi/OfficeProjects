package EmployeeManagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    static Connection con;

    public static Connection createDBConnection() {

        try {
            //load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            String url = "jdbc:mysql://localhost:3306/employeeDB?useSSL=false";
            String username = "root";
            String password = "We@lthyvijay202k";
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            ex.getStackTrace();
        }

        return con;
    }
}
