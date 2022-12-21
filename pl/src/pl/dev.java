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
public class dev extends user {
    static Connection con;
    
    static public void changestatus(String s,String b) throws SQLException{
       sec c1 = new sec();
          
                con = c1.connect();
                PreparedStatement ps = con.prepareStatement("UPDATE bugs SET status=? where BUG_ID=?");
//                ps.setString(1, STATUS.getText());
//                ps.setString(2, BUG_ID.getText());
                  ps.setString(1, s);
                  ps.setString(2, b);
                  ps.execute();
                

    }

    public dev(int ID, String u1, String u2, String u3, String u4) {
        super(ID, u1, u2, u3, u4);
    }
    
    
}
