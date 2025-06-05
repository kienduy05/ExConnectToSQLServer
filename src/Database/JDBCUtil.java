package Database;
import java.sql.*;
public class JDBCUtil {
    public static Connection getConnection(){
        Connection c = null;
        try{
            String url = "jdbc:sqlserver://localhost:1433;databaseName=quanlysach1;user=sa;password=123456";
            c= DriverManager.getConnection(url);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return c;
    }
    public static void closeConnection(Connection c){
        try {
            if(c!=null){
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
