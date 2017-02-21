/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Raksaka
 */

public class Assignment_Connect_MySQL {
    
    public static Connection connect() throws SQLException{

        String url = Assignment_Connection_Config.getURL() + Assignment_Connection_Config.getHOST() + Assignment_Connection_Config.getSQLINSTANCENAME() + Assignment_Connection_Config.getDATABASE();
        Connection connect = DriverManager.getConnection(url, Assignment_Connection_Config.getUSERNAME(), Assignment_Connection_Config.getPASSWORD());
        
        return connect;
    }
    
    //Lấy kết quả từ MýSQL
    public static ResultSet Assignment_SQL(String x) throws SQLException{
        
        Connection connect = Assignment_Connect_MySQL.connect();
        Statement statement = connect.createStatement();
        ResultSet rs = statement.executeQuery(x);
        return rs;
}
}