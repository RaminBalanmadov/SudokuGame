package com.sudoku.dboperation;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaCOnnect {

    Connection conn = null;

    public static Connection ConnectDB() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqilte:C:\\Users\\Ramin\\Documents\\NetBeansProjects\\SudokuGame\\Sudoku.sqlite");
            return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaCOnnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JavaCOnnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
