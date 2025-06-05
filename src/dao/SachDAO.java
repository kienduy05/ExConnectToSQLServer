package dao;

import Database.JDBCUtil;
import Model.SachModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SachDAO implements DAOInterface<SachModel> {
    public static SachDAO getInstance(){
        return new SachDAO();
    }
    @Override
    public ArrayList<SachModel> selectAll() {
        ArrayList<SachModel> ketqua = new ArrayList<>();
        try{
            Connection conn = JDBCUtil.getConnection();
            String sql = "SELECT * FROM sach";
            System.out.println(sql);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println("Ban da thuc thi: "+sql);
            while(rs.next()){
                String ma = rs.getString("ma_sach");
                String ten = rs.getString("ten_sach");
                SachModel sach = new SachModel(ma,ten);
                ketqua.add(sach);
            }
            JDBCUtil.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }
}
