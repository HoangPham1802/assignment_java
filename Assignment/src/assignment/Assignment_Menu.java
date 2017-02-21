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

/**
 *
 * @author Raksaka
 */
public class Assignment_Menu {

    public static void main(String[] agrs) throws SQLException{
        printMenu();
    }
    
    public static void printMenu() throws SQLException{
        
        while(true){
            int choice;
            System.out.println("===================================");
            System.out.println("|    Phần mềm quản lí sinh viên   |");
            System.out.println("===================================");
            System.out.println("| Lựa chọn:                       |");
            System.out.println("| 1. Danh sách                    |");
            System.out.println("| 2. Thêm mới                     |");
            System.out.println("| 3. Sửa thông tin                |");
            System.out.println("| 4. Xóa                          |");
            System.out.println("| 5. Tìm kiếm                     |");
            System.out.println("| 6. Thoát chương trình           |");
            System.out.println("===================================");
            
            System.out.println("Xin hãy lựa chọn: ");
            choice = Assignment_Scanner.getInt();
            
            switch(choice){
                case 1:
                    System.out.println("Hiển thị danh sách sinh viên: ");
                    Assignment_User.Assignment_User_ShowList();
                    break;
                case 2:
                    System.out.println("Thêm mới thông tinh sinh viên: ");
                    Assignment_User.Assignment_User_Add();
                    break;
                case 3:
                    System.out.println("Sửa thông tin sinh viên: ");
                    Assignment_User.Assignment_User_Update();
                    break;
                case 4:
                    System.out.println("Xóa thông tin sinh viên: ");
                    Assignment_User.Assignment_User_Delete();
                    break;
                case 5:
                    System.out.println("Tìm kiếm thông tinh sinh viên: ");
                    Assignment_User.Assignment_User_Search();
                    break;
                case 6:
                    System.out.println("Cám ơn và hẹn gặp lại");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Xin vui lòng chọn lại");
                    printMenu();
            }
        }
    }
}