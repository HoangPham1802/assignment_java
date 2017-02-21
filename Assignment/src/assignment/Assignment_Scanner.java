/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Raksaka
 */
import java.util.Scanner;
/**
 *
 * @author Raksaka
 */
public class Assignment_Scanner {
    public static int getInt(){
        int inputInt;
        while(true){
            try{
                inputInt = new Scanner(System.in).nextInt();
                break;
            }
            catch(Exception e){
                System.out.println("Vui lòng nhập số: ");
            }
        }
        return inputInt;
    }

    public static String getString(){
        String inputString = "";
        while(true){
            try{
                inputString = new Scanner(System.in).nextLine();
                if(inputString.length() > 0){
                    break;
                }
            }
            catch(Exception e){
                System.out.println("Vui lòng nhập chuỗi: ");
            }
        }
        return inputString;
    }
    
    public static char getChar(){
        char inputChar;
        while(true){
            try{
                inputChar = (char) new Scanner(System.in).nextInt();
                break;
            }
            catch(Exception e){
                System.out.println("Vui lòng nhập chữ: ");
            }
        }
        return inputChar;
    }
}