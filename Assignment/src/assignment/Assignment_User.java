/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


import java.sql.SQLException;

/**
 *
 * @author Raksaka
 */
public class Assignment_User{
    
    private static String User_ID;
    private static String User_name;
    private static String User_pseudo;
    private static String User_password;
    
    public Assignment_User(){
        
    }
    
    // Thêm mới danh sách người dùng
    public static void Assignment_User_Add() throws SQLException{
        
        try{
            System.out.println("Nhập ID người dùng: ");
            User_ID = Assignment_Scanner.getString();
            System.out.println("Nhập họ và tên: ");
            User_name = Assignment_Scanner.getString();
            System.out.println("Nhập tên người dùng: ");
            User_pseudo = Assignment_Scanner.getString();
            System.out.println("Nhập mã người dùng: ");
            User_password = Assignment_Scanner.getString();
        
            String User_Add_SQL = "INSERT INTO user (ID, Name, Pseudo, Password)" + 
                                  "VALUES (User_ID, User_name, User_Pseudo, User_password)";
            Assignment_Connect_MySQL.Assignment_SQL(User_Add_SQL);
            while (Assignment_Connect_MySQL.Assignment_SQL(User_Add_SQL).next()) {
                Assignment_User_Print(User_Add_SQL);
            }
        }
        catch(SQLException e){
            System.err.println("Failed to connect" + " " + e.getMessage());
        }
    }
    
    //Hiển thị danh sách người dùng
    public static void Assignment_User_ShowList() throws SQLException{
                
        try{
            String User_ShowList_SQL = "SELECT * FROM user";
            Assignment_Connect_MySQL.Assignment_SQL(User_ShowList_SQL);
            while (Assignment_Connect_MySQL.Assignment_SQL(User_ShowList_SQL).next()) {
                Assignment_User_Print(User_ShowList_SQL);
            }
        }
        catch(SQLException e){
            System.err.println("Failed to connect" + " " + e.getMessage());
        }
    }
    
    //Sửa lại thông tin người dùng
    public static void Assignment_User_Update() throws SQLException{
    
    try{
        System.out.println("Nhập ID người dùng: ");
        User_ID = Assignment_Scanner.getString();
        
        String User_Show_SQL = "SELECT * FROM user WHERE ID = " + User_ID;
        
        Assignment_Connect_MySQL.Assignment_SQL(User_Show_SQL);
        
        if(Assignment_Connect_MySQL.Assignment_SQL(User_Show_SQL).next() == false){
            System.err.println("Không có ID trong danh sách");
        }
        else{
            System.out.println("Nhập họ và tên: ");
            User_name = Assignment_Scanner.getString();
            System.out.println("Nhập tên người dùng: ");
            User_pseudo = Assignment_Scanner.getString();
            System.out.println("Nhập mã người dùng: ");
            User_password = Assignment_Scanner.getString();
        
            String User_Update_SQL = "UPDATE user "
                                    + "SET Name = " + User_name + ", Pseudo = " + User_pseudo + ", Password" + User_password
                                    + "WHERE ID = " + User_ID ;
        
            Assignment_Connect_MySQL.Assignment_SQL(User_Update_SQL);
            while(Assignment_Connect_MySQL.Assignment_SQL(User_Update_SQL).next()){
                Assignment_User_Print(User_Update_SQL);
            }
        }
    }
    catch(SQLException e){
            System.err.println("Failed to connect" + " " + e.getMessage());
        }
    }
    
    //Xóa thông tin người dùng
    public static void Assignment_User_Delete() throws SQLException{
    
    try{
        System.out.println("Nhập ID người dùng: ");
        User_ID = Assignment_Scanner.getString();
        
        String User_Show_SQL = "SELECT * FROM user WHERE ID = " + User_ID;
        
        Assignment_Connect_MySQL.Assignment_SQL(User_Show_SQL);
        
        if(Assignment_Connect_MySQL.Assignment_SQL(User_Show_SQL).next() == false){
            System.err.println("Không có ID trong danh sách");
        }
        else{
            System.out.println("Bạn muốn chắc muốn xóa thông tin của người dùng này: y or n ");
            char del = Assignment_Scanner.getChar();
                if(del == 'y'){
                    String User_Delete_SQL = "DELETE FROM user"
                                            + "WHERE ID = " + User_ID;
                    Assignment_Connect_MySQL.Assignment_SQL(User_Delete_SQL);
                    while(Assignment_Connect_MySQL.Assignment_SQL(User_Delete_SQL).next()){
                        Assignment_User_Print(User_Delete_SQL);
                    }
                }
                else{
                    System.exit(del);
                }
            }
        }
    catch(SQLException e){
            System.err.println("Failed to connect" + " " + e.getMessage());
        }
    }
    
    //Tìm thông tin người dùng
    public static void Assignment_User_Search(){
    
    try{
        System.out.println("Nhập ID người dùng: ");
        User_ID = Assignment_Scanner.getString();
        
        String User_Show_SQL = "SELECT * FROM user WHERE ID = " + User_ID;
        
        Assignment_Connect_MySQL.Assignment_SQL(User_Show_SQL);
        
        if(Assignment_Connect_MySQL.Assignment_SQL(User_Show_SQL).next() == false){
            System.err.println("Không có ID trong danh sách");
        }
        else{            
            Assignment_User_Print(User_Show_SQL);   
        }
    }
    catch(SQLException e){
            System.err.println("Failed to connect" + " " + e.getMessage());
        }    
    }
    
    //In thông tin người dùng ra màn hình
    public static void Assignment_User_Print(String a) throws SQLException{
    
        String UserID = Assignment_Connect_MySQL.Assignment_SQL(a).getString("ID");
        String UserName = Assignment_Connect_MySQL.Assignment_SQL(a).getString("Name");
        String UserPseudo = Assignment_Connect_MySQL.Assignment_SQL(a).getString("Pseudo");
        String UserPassword = Assignment_Connect_MySQL.Assignment_SQL(a).getString("Password");
        System.out.println("---------------------------");
        System.out.println("UserID: " + UserID);
        System.out.println("UserName: " + UserName);
        System.out.println("UserPseudo" + UserPseudo);
        System.out.println("---------------------------");
                
    }
}
