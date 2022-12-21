/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author abdoe
 */
public class testerM extends user {
    static Connection con;
    static int ID;
    public testerM(int ID) {
        super(ID);
        this.ID = getID();
    }
    
    static public void addBug(String ID_DEV,String TITLE,String desc,String project_name,String status,String BUG_DATE,String BUG_TYPE,String BUG_LEVEL,String priority) throws SQLException {
        sec c1 = new sec();
        con = c1.connect();
//                ps.setString(1, STATUS.getText());
//                ps.setString(2, BUG_ID.getText());
                  PreparedStatement ps = con.prepareStatement("insert into bugs(ID_TESTER,ID_DEV,TITLE,description,project_name,status,BUG_DATE,BUG_TYPE,BUG_LEVEL,priority)  values(?,?,?,?,?,?,?,?,?,?)");
                  ps.setInt(1, ID);
                ps.setString(2, ID_DEV);
                ps.setString(3, TITLE);
                ps.setString(4, desc);
                ps.setString(5,project_name);
                ps.setString(6,status);
                ps.setString(7,BUG_DATE);
                ps.setString(8,BUG_TYPE);
                ps.setString(9,BUG_LEVEL);
                ps.setString(10,priority);
                  ps.execute();
        
        
    }

    
    
}
