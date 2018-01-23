package com.sudoku.dboperation;

import static com.sudoku.dboperation.JavaCOnnect.ConnectDB;
import java.sql.*;
import javax.swing.*;
import com.sudoku.model.AddNewGameRow1;
import com.sudoku.model.AddNewGameRow2;
import com.sudoku.model.AddNewGameRow3;
import com.sudoku.model.AddNewGameRow4;
import com.sudoku.model.AddNewGameRow5;
import com.sudoku.model.AddNewGameRow6;
import com.sudoku.model.AddNewGameRow7;
import com.sudoku.model.AddNewGameRow8;
import com.sudoku.model.AddNewGameRow9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBOperation {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private void ConnectDB() {

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sudoku", "root", "admin");
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//
//    public static Connection ConnectDB() {
//
//        try {
//            Class.forName("org.sqlite.JDBC");
//            Connection conn = DriverManager.getConnection("jdbc:sqilte:C:\\Users\\Ramin\\Documents\\NetBeansProjects\\SudokuGame\\sudokugame.sqlite");
//            return conn;
//        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(JavaCOnnect.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }

    private void close() {

        try {
            if (!conn.isClosed()) {
                conn.close();

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AddNewGameRow1(AddNewGameRow1 gameRow1) {

        ConnectDB();
        try {
            ps = conn.prepareStatement("insert into game1 values(0,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, gameRow1.getOne());
            ps.setString(2, gameRow1.getTwo());
            ps.setString(3, gameRow1.getThree());
            ps.setString(4, gameRow1.getFour());
            ps.setString(5, gameRow1.getFive());
            ps.setString(6, gameRow1.getSix());
            ps.setString(7, gameRow1.getSeven());
            ps.setString(8, gameRow1.getEigth());
            ps.setString(9, gameRow1.getNine());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void AddNewGameRow2(AddNewGameRow2 gameRow2) {

        ConnectDB();
        try {
            ps = conn.prepareStatement("insert into game2 values(0,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, gameRow2.getOne());
            ps.setString(2, gameRow2.getTwo());
            ps.setString(3, gameRow2.getThree());
            ps.setString(4, gameRow2.getFour());
            ps.setString(5, gameRow2.getFive());
            ps.setString(6, gameRow2.getSix());
            ps.setString(7, gameRow2.getSeven());
            ps.setString(8, gameRow2.getEigth());
            ps.setString(9, gameRow2.getNine());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void AddNewGameRow3(AddNewGameRow3 gameRow3) {

        ConnectDB();
        try {
            ps = conn.prepareStatement("insert into game3 values(0,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, gameRow3.getOne());
            ps.setString(2, gameRow3.getTwo());
            ps.setString(3, gameRow3.getThree());
            ps.setString(4, gameRow3.getFour());
            ps.setString(5, gameRow3.getFive());
            ps.setString(6, gameRow3.getSix());
            ps.setString(7, gameRow3.getSeven());
            ps.setString(8, gameRow3.getEigth());
            ps.setString(9, gameRow3.getNine());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void AddNewGameRow4(AddNewGameRow4 gameRow4) {

        ConnectDB();
        try {
            ps = conn.prepareStatement("insert into game4 values(0,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, gameRow4.getOne());
            ps.setString(2, gameRow4.getTwo());
            ps.setString(3, gameRow4.getThree());
            ps.setString(4, gameRow4.getFour());
            ps.setString(5, gameRow4.getFive());
            ps.setString(6, gameRow4.getSix());
            ps.setString(7, gameRow4.getSeven());
            ps.setString(8, gameRow4.getEigth());
            ps.setString(9, gameRow4.getNine());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void AddNewGameRow5(AddNewGameRow5 gameRow5) {

        ConnectDB();
        try {
            ps = conn.prepareStatement("insert into game5 values(0,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, gameRow5.getOne());
            ps.setString(2, gameRow5.getTwo());
            ps.setString(3, gameRow5.getThree());
            ps.setString(4, gameRow5.getFour());
            ps.setString(5, gameRow5.getFive());
            ps.setString(6, gameRow5.getSix());
            ps.setString(7, gameRow5.getSeven());
            ps.setString(8, gameRow5.getEigth());
            ps.setString(9, gameRow5.getNine());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void AddNewGameRow6(AddNewGameRow6 gameRow6) {

        ConnectDB();
        try {
            ps = conn.prepareStatement("insert into game6 values(0,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, gameRow6.getOne());
            ps.setString(2, gameRow6.getTwo());
            ps.setString(3, gameRow6.getThree());
            ps.setString(4, gameRow6.getFour());
            ps.setString(5, gameRow6.getFive());
            ps.setString(6, gameRow6.getSix());
            ps.setString(7, gameRow6.getSeven());
            ps.setString(8, gameRow6.getEigth());
            ps.setString(9, gameRow6.getNine());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void AddNewGameRow7(AddNewGameRow7 gameRow7) {

        ConnectDB();
        try {
            ps = conn.prepareStatement("insert into game7 values(0,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, gameRow7.getOne());
            ps.setString(2, gameRow7.getTwo());
            ps.setString(3, gameRow7.getThree());
            ps.setString(4, gameRow7.getFour());
            ps.setString(5, gameRow7.getFive());
            ps.setString(6, gameRow7.getSix());
            ps.setString(7, gameRow7.getSeven());
            ps.setString(8, gameRow7.getEigth());
            ps.setString(9, gameRow7.getNine());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void AddNewGameRow8(AddNewGameRow8 gameRow8) {

        ConnectDB();
        try {
            ps = conn.prepareStatement("insert into game8 values(0,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, gameRow8.getOne());
            ps.setString(2, gameRow8.getTwo());
            ps.setString(3, gameRow8.getThree());
            ps.setString(4, gameRow8.getFour());
            ps.setString(5, gameRow8.getFive());
            ps.setString(6, gameRow8.getSix());
            ps.setString(7, gameRow8.getSeven());
            ps.setString(8, gameRow8.getEigth());
            ps.setString(9, gameRow8.getNine());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void AddNewGameRow9(AddNewGameRow9 gameRow9) {

        ConnectDB();
        try {
            ps = conn.prepareStatement("insert into game9 values(0,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, gameRow9.getOne());
            ps.setString(2, gameRow9.getTwo());
            ps.setString(3, gameRow9.getThree());
            ps.setString(4, gameRow9.getFour());
            ps.setString(5, gameRow9.getFive());
            ps.setString(6, gameRow9.getSix());
            ps.setString(7, gameRow9.getSeven());
            ps.setString(8, gameRow9.getEigth());
            ps.setString(9, gameRow9.getNine());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public List<AddNewGameRow1> allRows1() {
        List<AddNewGameRow1> gameRow1 = new ArrayList();
        ConnectDB();
        try {
            ps = conn.prepareStatement("select * from game1");
            rs = ps.executeQuery();
            while (rs.next()) {
                AddNewGameRow1 addNewGameRow1 = new AddNewGameRow1();
                addNewGameRow1.setId(rs.getInt("id"));
                addNewGameRow1.setOne(rs.getString("row1"));
                addNewGameRow1.setTwo(rs.getString("row2"));
                addNewGameRow1.setThree(rs.getString("row3"));
                addNewGameRow1.setFour(rs.getString("row4"));
                addNewGameRow1.setFive(rs.getString("row5"));
                addNewGameRow1.setSix(rs.getString("row6"));
                addNewGameRow1.setSeven(rs.getString("row7"));
                addNewGameRow1.setEigth(rs.getString("row8"));
                addNewGameRow1.setNine(rs.getString("row9"));
                gameRow1.add(addNewGameRow1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return gameRow1;

    }

    public List<AddNewGameRow2> allRows2() {
        List<AddNewGameRow2> gameRow2 = new ArrayList();
        ConnectDB();
        try {
            ps = conn.prepareStatement("select * from game2");
            rs = ps.executeQuery();
            while (rs.next()) {
                AddNewGameRow2 addNewGameRow2 = new AddNewGameRow2();
                addNewGameRow2.setId(rs.getInt("Id"));
                addNewGameRow2.setOne(rs.getString("row1"));
                addNewGameRow2.setTwo(rs.getString("row2"));
                addNewGameRow2.setThree(rs.getString("row3"));
                addNewGameRow2.setFour(rs.getString("row4"));
                addNewGameRow2.setFive(rs.getString("row5"));
                addNewGameRow2.setSix(rs.getString("row6"));
                addNewGameRow2.setSeven(rs.getString("row7"));
                addNewGameRow2.setEigth(rs.getString("row8"));
                addNewGameRow2.setNine(rs.getString("row9"));
                gameRow2.add(addNewGameRow2);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return gameRow2;

    }

    public List<AddNewGameRow3> allRows3() {
        List<AddNewGameRow3> gameRow3 = new ArrayList();
        ConnectDB();
        try {
            ps = conn.prepareStatement("select * from game3");
            rs = ps.executeQuery();
            while (rs.next()) {
                AddNewGameRow3 addNewGameRow3 = new AddNewGameRow3();
                addNewGameRow3.setId(rs.getInt("Id"));
                addNewGameRow3.setOne(rs.getString("row1"));
                addNewGameRow3.setTwo(rs.getString("row2"));
                addNewGameRow3.setThree(rs.getString("row3"));
                addNewGameRow3.setFour(rs.getString("row4"));
                addNewGameRow3.setFive(rs.getString("row5"));
                addNewGameRow3.setSix(rs.getString("row6"));
                addNewGameRow3.setSeven(rs.getString("row7"));
                addNewGameRow3.setEigth(rs.getString("row8"));
                addNewGameRow3.setNine(rs.getString("row9"));
                gameRow3.add(addNewGameRow3);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return gameRow3;

    }

    public List<AddNewGameRow4> allRows4() {
        List<AddNewGameRow4> gameRow4 = new ArrayList();
        ConnectDB();
        try {
            ps = conn.prepareStatement("select * from game4");
            rs = ps.executeQuery();
            while (rs.next()) {
                AddNewGameRow4 addNewGameRow4 = new AddNewGameRow4();
                addNewGameRow4.setId(rs.getInt("Id"));
                addNewGameRow4.setOne(rs.getString("row1"));
                addNewGameRow4.setTwo(rs.getString("row2"));
                addNewGameRow4.setThree(rs.getString("row3"));
                addNewGameRow4.setFour(rs.getString("row4"));
                addNewGameRow4.setFive(rs.getString("row5"));
                addNewGameRow4.setSix(rs.getString("row6"));
                addNewGameRow4.setSeven(rs.getString("row7"));
                addNewGameRow4.setEigth(rs.getString("row8"));
                addNewGameRow4.setNine(rs.getString("row9"));
                gameRow4.add(addNewGameRow4);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return gameRow4;

    }

    public List<AddNewGameRow5> allRows5() {
        List<AddNewGameRow5> gameRow5 = new ArrayList();
        ConnectDB();
        try {
            ps = conn.prepareStatement("select * from game5");
            rs = ps.executeQuery();
            while (rs.next()) {
                AddNewGameRow5 addNewGameRow5 = new AddNewGameRow5();
                addNewGameRow5.setId(rs.getInt("Id"));
                addNewGameRow5.setOne(rs.getString("row1"));
                addNewGameRow5.setTwo(rs.getString("row2"));
                addNewGameRow5.setThree(rs.getString("row3"));
                addNewGameRow5.setFour(rs.getString("row4"));
                addNewGameRow5.setFive(rs.getString("row5"));
                addNewGameRow5.setSix(rs.getString("row6"));
                addNewGameRow5.setSeven(rs.getString("row7"));
                addNewGameRow5.setEigth(rs.getString("row8"));
                addNewGameRow5.setNine(rs.getString("row9"));
                gameRow5.add(addNewGameRow5);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return gameRow5;

    }

    public List<AddNewGameRow6> allRows6() {
        List<AddNewGameRow6> gameRow6 = new ArrayList();
        ConnectDB();
        try {
            ps = conn.prepareStatement("select * from game6");
            rs = ps.executeQuery();
            while (rs.next()) {
                AddNewGameRow6 addNewGameRow6 = new AddNewGameRow6();
                addNewGameRow6.setId(rs.getInt("Id"));
                addNewGameRow6.setOne(rs.getString("row1"));
                addNewGameRow6.setTwo(rs.getString("row2"));
                addNewGameRow6.setThree(rs.getString("row3"));
                addNewGameRow6.setFour(rs.getString("row4"));
                addNewGameRow6.setFive(rs.getString("row5"));
                addNewGameRow6.setSix(rs.getString("row6"));
                addNewGameRow6.setSeven(rs.getString("row7"));
                addNewGameRow6.setEigth(rs.getString("row8"));
                addNewGameRow6.setNine(rs.getString("row9"));
                gameRow6.add(addNewGameRow6);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return gameRow6;

    }

    public List<AddNewGameRow7> allRows7() {
        List<AddNewGameRow7> gameRow7 = new ArrayList();
        ConnectDB();
        try {
            ps = conn.prepareStatement("select * from game7");
            rs = ps.executeQuery();
            while (rs.next()) {
                AddNewGameRow7 addNewGameRow7 = new AddNewGameRow7();
                addNewGameRow7.setId(rs.getInt("Id"));
                addNewGameRow7.setOne(rs.getString("row1"));
                addNewGameRow7.setTwo(rs.getString("row2"));
                addNewGameRow7.setThree(rs.getString("row3"));
                addNewGameRow7.setFour(rs.getString("row4"));
                addNewGameRow7.setFive(rs.getString("row5"));
                addNewGameRow7.setSix(rs.getString("row6"));
                addNewGameRow7.setSeven(rs.getString("row7"));
                addNewGameRow7.setEigth(rs.getString("row8"));
                addNewGameRow7.setNine(rs.getString("row9"));
                gameRow7.add(addNewGameRow7);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return gameRow7;

    }

    public List<AddNewGameRow8> allRows8() {
        List<AddNewGameRow8> gameRow8 = new ArrayList();
        ConnectDB();
        try {
            ps = conn.prepareStatement("select * from game8");
            rs = ps.executeQuery();
            while (rs.next()) {
                AddNewGameRow8 addNewGameRow8 = new AddNewGameRow8();
                addNewGameRow8.setId(rs.getInt("Id"));
                addNewGameRow8.setOne(rs.getString("row1"));
                addNewGameRow8.setTwo(rs.getString("row2"));
                addNewGameRow8.setThree(rs.getString("row3"));
                addNewGameRow8.setFour(rs.getString("row4"));
                addNewGameRow8.setFive(rs.getString("row5"));
                addNewGameRow8.setSix(rs.getString("row6"));
                addNewGameRow8.setSeven(rs.getString("row7"));
                addNewGameRow8.setEigth(rs.getString("row8"));
                addNewGameRow8.setNine(rs.getString("row9"));
                gameRow8.add(addNewGameRow8);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return gameRow8;

    }

    public List<AddNewGameRow9> allRows9() {
        List<AddNewGameRow9> gameRow9 = new ArrayList();
        ConnectDB();
        try {
            ps = conn.prepareStatement("select * from game9");
            rs = ps.executeQuery();
            while (rs.next()) {
                AddNewGameRow9 addNewGameRow9 = new AddNewGameRow9();
                addNewGameRow9.setId(rs.getInt("Id"));
                addNewGameRow9.setOne(rs.getString("row1"));
                addNewGameRow9.setTwo(rs.getString("row2"));
                addNewGameRow9.setThree(rs.getString("row3"));
                addNewGameRow9.setFour(rs.getString("row4"));
                addNewGameRow9.setFive(rs.getString("row5"));
                addNewGameRow9.setSix(rs.getString("row6"));
                addNewGameRow9.setSeven(rs.getString("row7"));
                addNewGameRow9.setEigth(rs.getString("row8"));
                addNewGameRow9.setNine(rs.getString("row9"));
                gameRow9.add(addNewGameRow9);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return gameRow9;

    }
}
