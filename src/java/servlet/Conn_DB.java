/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yunshuliang
 */
//public class Conn_DB {
//    
//    public void conn_DB(){
//        String connectionURL = "jdbc:derby://localhost:1527/Yunshu Liang"; //ConnectionURL, username and password should be specified in getConnection()
//        try {
//            Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560"); 
//            System.out.println("Connect successfully ! ");
//            conn.close();
//        }
//        catch (SQLException ex) { 
//            System.out.println("Connect failed ! ");
//        }
//    }
//    
//    
//    public void seleAll(){
//        String connectionURL = "jdbc:derby://localhost:1527/Yunshu Liang";//ConnectionURL, username and password should be specified in getConnection() 
//            try {
//                Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560"); 
//                String sql = "SELECT * FROM CONTACT";
//                Statement st = conn.createStatement();
//                ResultSet rs=null; 
//                rs=st.executeQuery(sql); 
//                while(rs.next()){
//                    System.out.println(rs.getString("NAME")+"\t"+rs.getString("MOBILE_PHONE_NUMBER")); }
//                    rs.close(); st.close(); conn.close();} 
//                catch (SQLException ex) {
//                    System.out.println("Connect failed ! ");
//                }
//    }
//    
//    
//    public void insert(){
//    String connectionURL = "jdbc:derby://localhost:1527/Yunshu Liang"; //ConnectionURL, username and password should be specified in getConnection()
//        try {
//            Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560"); 
//            String sql = "INSERT INTO CONTACT (NAME, MOBILE_PHONE_NUMBER) VALUES ('FRANK', '4123042345')"; 
//            Statement st = conn.createStatement();
//            st.executeUpdate(sql); st.close(); conn.close();
//        } catch (SQLException ex) { 
//            System.out.println("Connect failed ! ");
//        }
//    }
//    
//    public void selectPhone(String name) throws Exception{
//        String connectionURL = "jdbc:derby://localhost:1527/Yunshu Liang"; 
//        Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560"); 
//        String sql = "select mobile_phone_number from contact where name='" + name + "'"; 
//        Statement st = conn.createStatement();
//        ResultSet rs = st.executeQuery(sql);
//        while (rs.next()) {
//            System.out.println(rs.getString("NAME")+"\t"+rs.getString("MOBILE_PHONE_NUMBER"));
//        }
//        st.close(); conn.close();
//        
//    }
//    
//}
public class Conn_DB {
    
    public void conn_DB(){
        String connectionURL = "jdbc:derby://localhost:1527/Yunshu Liang"; //ConnectionURL, username and password should be specified in getConnection()
        try {
            Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560"); 
            System.out.println("Connect successfully ! ");
            conn.close();
        }
        catch (SQLException ex) { 
            System.out.println("Connect failed ! ");
        }
    }
    
    
    public void seleAll(){
        String connectionURL = "jdbc:derby://localhost:1527/Yunshu Liang";//ConnectionURL, username and password should be specified in getConnection() 
            try {
                Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560"); 
                String sql = "SELECT * FROM CONTACT";
                Statement st = conn.createStatement();
                ResultSet rs=null; 
                rs=st.executeQuery(sql); 
//                if (rs==null){
//                    System.out.println("Search failed:No such record!");
//                }
                while(rs.next()){
                    System.out.println(rs.getString("NAME")+"\t"+rs.getString("MOBILE_PHONE_NUMBER")); }
                    rs.close(); st.close(); conn.close();} 
                catch (SQLException ex) {
                    System.out.println("Connect failed ! ");
                }
    }
    
    
    public void insert(String name, String number){
    String connectionURL = "jdbc:derby://localhost:1527/Yunshu Liang"; //ConnectionURL, username and password should be specified in getConnection()
        try {
            Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560"); 
            String sql = "insert into contact values('" + name + "','"+number+"')";
            Statement st = conn.createStatement();
            st.executeUpdate(sql); st.close(); conn.close();
        } catch (SQLException ex) { 
            System.out.println("Connect failed ! ");
        }
    }
    
    public String selectPhone(String name){
        String connectionURL = "jdbc:derby://localhost:1527/Yunshu Liang"; 
        String res = "";
        try {
        Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560"); 
        String sql = "select mobile_phone_number from contact where name='" + name + "'"; 
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            res += rs.getString("MOBILE_PHONE_NUMBER");
        }
        st.close(); conn.close();
        return res;
        } catch (SQLException ex) {
            System.out.println("connect failire!");
        }
        return null;
    }
    
    public void delePhone(String name){
        String connectionURL = "jdbc:derby://localhost:1527/Yunshu Liang"; 
        try {
             Connection conn = DriverManager.getConnection(connectionURL, "IS2560", "IS2560"); 
             String sql = "delete from contact WHERE name='"+ name +"'"; 
             Statement st = conn.createStatement();
             st.executeUpdate(sql); st.close(); conn.close();
        } 
        catch (SQLException ex) { 
            System.out.println("Connect failed ! ");
        }
    }
}
  



    
