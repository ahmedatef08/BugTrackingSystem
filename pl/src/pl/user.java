/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl;

/**
 *
 * @author abdoe
 */
public class user {
    private int ID;

    int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    private String username,email,pass,usertype;
    public user(int ID,String u1,String u2,String u3,String u4) {
        this.ID = ID;
        this.username = u1;
        this.pass = u2;
        this.usertype = u3;
        this.email = u4;
    }
    public user(int ID) {
        this.ID = ID;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    
}
