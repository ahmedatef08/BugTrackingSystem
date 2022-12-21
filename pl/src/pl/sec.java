/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abdoe
 */
public class sec {
    private final String user="root";
    private final String password="";
    private final String url="jdbc:mysql://localhost/pl_project";
    public Connection connect() throws SQLException{
        return DriverManager.getConnection(url, user,password);
    }
    
}
