package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
     public static Statement st;
     static{
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/globaltransitdb"+"?useSSL=false", "root", "Nimish@321");
        st=c.createStatement();
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
    }
}
}
