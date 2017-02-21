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
public class Assignment_Connection_Config {

    private static final String URL = "jdbc:sqlserver://";
    private static final String HOST = "localhost:3306;";
    private static final String DATABASE = "databaseName=user";
    private static final String USERNAME = "sa;";
    private static final String PASSWORD = "sa";
    private static final String SQLINSTANCENAME = "instance=SQLEXPRESS;";
    
    public static String getURL() {
        return URL;
    }

    public static String getHOST() {
        return HOST;
    }

    public static String getDATABASE() {
        return DATABASE;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static String getSQLINSTANCENAME() {
        return SQLINSTANCENAME;
    }
    
}
