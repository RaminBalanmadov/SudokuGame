package com.sudoku.screen;

import com.sudoku.dboperation.DBOperation;
import com.sudoku.model.AddNewGameRow1;
import com.sudoku.model.AddNewGameRow2;
import com.sudoku.model.AddNewGameRow3;
import com.sudoku.model.AddNewGameRow4;
import com.sudoku.model.AddNewGameRow5;
import com.sudoku.model.AddNewGameRow6;
import com.sudoku.model.AddNewGameRow7;
import com.sudoku.model.AddNewGameRow8;
import com.sudoku.model.AddNewGameRow9;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ScreenFrame extends javax.swing.JFrame {

    DBOperation db = new DBOperation();

    public ScreenFrame() {
        setResizable(false);
        initComponents();

    }
    String btnName = "";
    String one = "1";
    String two = "2";
    String three = "3";
    String four = "4";
    String five = "5";
    String six = "6";
    String seven = "7";
    String eigth = "8";
    String nine = "9";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 0), new java.awt.Dimension(6, 32767));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        btn7_7 = new javax.swing.JButton();
        btn7_2 = new javax.swing.JButton();
        btn7_9 = new javax.swing.JButton();
        btn8_7 = new javax.swing.JButton();
        btn8_2 = new javax.swing.JButton();
        btn8_3 = new javax.swing.JButton();
        btn9_6 = new javax.swing.JButton();
        btn9_8 = new javax.swing.JButton();
        btn8_6 = new javax.swing.JButton();
        btn8_8 = new javax.swing.JButton();
        btn7_5 = new javax.swing.JButton();
        btn8_1 = new javax.swing.JButton();
        btn7_8 = new javax.swing.JButton();
        btn8_4 = new javax.swing.JButton();
        btn7_1 = new javax.swing.JButton();
        btn8_9 = new javax.swing.JButton();
        btn7_4 = new javax.swing.JButton();
        btn7_3 = new javax.swing.JButton();
        btn8_5 = new javax.swing.JButton();
        btn7_6 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnTest = new javax.swing.JButton();
        btn2_9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn2_2 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn2_4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn2_8 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2_7 = new javax.swing.JButton();
        btn1_7 = new javax.swing.JButton();
        btn2_3 = new javax.swing.JButton();
        btn1_6 = new javax.swing.JButton();
        btn1_2 = new javax.swing.JButton();
        btn1_3 = new javax.swing.JButton();
        btn2_5 = new javax.swing.JButton();
        btn1_4 = new javax.swing.JButton();
        btn2_6 = new javax.swing.JButton();
        btn9_2 = new javax.swing.JButton();
        btn1_9 = new javax.swing.JButton();
        btn9_3 = new javax.swing.JButton();
        btn9_5 = new javax.swing.JButton();
        btn9_7 = new javax.swing.JButton();
        btn9_4 = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btn9_1 = new javax.swing.JButton();
        btn9_9 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btn3_4 = new javax.swing.JButton();
        btn3_3 = new javax.swing.JButton();
        btn3_7 = new javax.swing.JButton();
        btn3_2 = new javax.swing.JButton();
        btn3_6 = new javax.swing.JButton();
        btn4_5 = new javax.swing.JButton();
        btn3_9 = new javax.swing.JButton();
        btn4_7 = new javax.swing.JButton();
        btn4_2 = new javax.swing.JButton();
        btn4_3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        btn1_5 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        btn4_9 = new javax.swing.JButton();
        btn2_1 = new javax.swing.JButton();
        btn1_8 = new javax.swing.JButton();
        btn3_5 = new javax.swing.JButton();
        btn1_1 = new javax.swing.JButton();
        btn4_1 = new javax.swing.JButton();
        btn3_8 = new javax.swing.JButton();
        btn4_4 = new javax.swing.JButton();
        btn3_1 = new javax.swing.JButton();
        btn5_2 = new javax.swing.JButton();
        btn5_7 = new javax.swing.JButton();
        btn6_5 = new javax.swing.JButton();
        btn5_6 = new javax.swing.JButton();
        btn6_8 = new javax.swing.JButton();
        btn6_6 = new javax.swing.JButton();
        btn5_9 = new javax.swing.JButton();
        btn6_7 = new javax.swing.JButton();
        btn6_2 = new javax.swing.JButton();
        btn6_3 = new javax.swing.JButton();
        btn4_6 = new javax.swing.JButton();
        btn4_8 = new javax.swing.JButton();
        btn5_5 = new javax.swing.JButton();
        btn5_4 = new javax.swing.JButton();
        btn6_9 = new javax.swing.JButton();
        btn5_3 = new javax.swing.JButton();
        btn6_1 = new javax.swing.JButton();
        btn5_8 = new javax.swing.JButton();
        btn6_4 = new javax.swing.JButton();
        btn5_1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn7_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_7ActionPerformed(evt);
            }
        });

        btn7_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_2ActionPerformed(evt);
            }
        });

        btn7_9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_9ActionPerformed(evt);
            }
        });

        btn8_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_7ActionPerformed(evt);
            }
        });

        btn8_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_2ActionPerformed(evt);
            }
        });

        btn8_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_3ActionPerformed(evt);
            }
        });

        btn9_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_6ActionPerformed(evt);
            }
        });

        btn9_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_8ActionPerformed(evt);
            }
        });

        btn8_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_6ActionPerformed(evt);
            }
        });

        btn8_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_8ActionPerformed(evt);
            }
        });

        btn7_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_5ActionPerformed(evt);
            }
        });

        btn8_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_1ActionPerformed(evt);
            }
        });

        btn7_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_8ActionPerformed(evt);
            }
        });

        btn8_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_4ActionPerformed(evt);
            }
        });

        btn7_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_1ActionPerformed(evt);
            }
        });

        btn8_9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_9ActionPerformed(evt);
            }
        });

        btn7_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_4ActionPerformed(evt);
            }
        });

        btn7_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_3ActionPerformed(evt);
            }
        });

        btn8_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8_5ActionPerformed(evt);
            }
        });

        btn7_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7_6ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnTest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTest.setText("Yoxla");
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        btn2_9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_9ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn2_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_2ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn2_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_4ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn2_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_8ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_7ActionPerformed(evt);
            }
        });

        btn1_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_7ActionPerformed(evt);
            }
        });

        btn2_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_3ActionPerformed(evt);
            }
        });

        btn1_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_6ActionPerformed(evt);
            }
        });

        btn1_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_2ActionPerformed(evt);
            }
        });

        btn1_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_3ActionPerformed(evt);
            }
        });

        btn2_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_5ActionPerformed(evt);
            }
        });

        btn1_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_4ActionPerformed(evt);
            }
        });

        btn2_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_6ActionPerformed(evt);
            }
        });

        btn9_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_2ActionPerformed(evt);
            }
        });

        btn1_9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_9ActionPerformed(evt);
            }
        });

        btn9_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_3ActionPerformed(evt);
            }
        });

        btn9_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_5ActionPerformed(evt);
            }
        });

        btn9_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_7ActionPerformed(evt);
            }
        });

        btn9_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_4ActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText("Dəyişdir");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btn9_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_1ActionPerformed(evt);
            }
        });

        btn9_9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn9_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9_9ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));

        btn3_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_4ActionPerformed(evt);
            }
        });

        btn3_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_3ActionPerformed(evt);
            }
        });

        btn3_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_7ActionPerformed(evt);
            }
        });

        btn3_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_2ActionPerformed(evt);
            }
        });

        btn3_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_6ActionPerformed(evt);
            }
        });

        btn4_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_5ActionPerformed(evt);
            }
        });

        btn3_9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_9ActionPerformed(evt);
            }
        });

        btn4_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_7ActionPerformed(evt);
            }
        });

        btn4_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_2ActionPerformed(evt);
            }
        });

        btn4_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_3ActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));

        jTextField8.setBackground(new java.awt.Color(0, 0, 0));

        jTextField9.setBackground(new java.awt.Color(0, 0, 0));

        btn1_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_5ActionPerformed(evt);
            }
        });

        jTextField7.setBackground(new java.awt.Color(0, 0, 0));

        jTextField11.setBackground(new java.awt.Color(0, 0, 0));

        jTextField10.setBackground(new java.awt.Color(0, 0, 0));

        jTextField13.setBackground(new java.awt.Color(0, 0, 0));

        jTextField12.setBackground(new java.awt.Color(0, 0, 0));

        btn4_9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_9ActionPerformed(evt);
            }
        });

        btn2_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_1ActionPerformed(evt);
            }
        });

        btn1_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_8ActionPerformed(evt);
            }
        });

        btn3_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_5ActionPerformed(evt);
            }
        });

        btn1_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_1ActionPerformed(evt);
            }
        });

        btn4_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_1ActionPerformed(evt);
            }
        });

        btn3_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_8ActionPerformed(evt);
            }
        });

        btn4_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_4ActionPerformed(evt);
            }
        });

        btn3_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3_1ActionPerformed(evt);
            }
        });

        btn5_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_2ActionPerformed(evt);
            }
        });

        btn5_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_7ActionPerformed(evt);
            }
        });

        btn6_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_5ActionPerformed(evt);
            }
        });

        btn5_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_6ActionPerformed(evt);
            }
        });

        btn6_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_8ActionPerformed(evt);
            }
        });

        btn6_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_6ActionPerformed(evt);
            }
        });

        btn5_9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_9ActionPerformed(evt);
            }
        });

        btn6_7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_7ActionPerformed(evt);
            }
        });

        btn6_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_2ActionPerformed(evt);
            }
        });

        btn6_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_3ActionPerformed(evt);
            }
        });

        btn4_6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_6ActionPerformed(evt);
            }
        });

        btn4_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn4_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4_8ActionPerformed(evt);
            }
        });

        btn5_5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_5ActionPerformed(evt);
            }
        });

        btn5_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_4ActionPerformed(evt);
            }
        });

        btn6_9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_9ActionPerformed(evt);
            }
        });

        btn5_3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_3ActionPerformed(evt);
            }
        });

        btn6_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_1ActionPerformed(evt);
            }
        });

        btn5_8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_8ActionPerformed(evt);
            }
        });

        btn6_4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn6_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6_4ActionPerformed(evt);
            }
        });

        btn5_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5_1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("SUDOKU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnTest, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btn8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btn7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btn7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btn7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btn8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1_8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField7)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4_7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4_8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn4_9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn5_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5_7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5_8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5_9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn6_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6_7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6_8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6_9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn6_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn7_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn7_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7_7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7_8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn7_9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn8_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8_7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8_8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8_9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn9_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9_5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9_7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9_8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9_9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField6)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTest)
                    .addComponent(btnNext))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (AddNewGameRow1 row1 : db.allRows1()) {
            btn1_1.setText(row1.getOne());
            btn1_2.setText(row1.getTwo());
            btn1_3.setText(row1.getThree());
            btn1_4.setText(row1.getFour());
            btn1_5.setText(row1.getFive());
            btn1_6.setText(row1.getSix());
            btn1_7.setText(row1.getSeven());
            btn1_8.setText(row1.getEigth());
            btn1_9.setText(row1.getNine());
        }
        for (AddNewGameRow2 row2 : db.allRows2()) {
            btn2_1.setText(row2.getOne());
            btn2_2.setText(row2.getTwo());
            btn2_3.setText(row2.getThree());
            btn2_4.setText(row2.getFour());
            btn2_5.setText(row2.getFive());
            btn2_6.setText(row2.getSix());
            btn2_7.setText(row2.getSeven());
            btn2_8.setText(row2.getEigth());
            btn2_9.setText(row2.getNine());
        }
        for (AddNewGameRow3 row3 : db.allRows3()) {
            btn3_1.setText(row3.getOne());
            btn3_2.setText(row3.getTwo());
            btn3_3.setText(row3.getThree());
            btn3_4.setText(row3.getFour());
            btn3_5.setText(row3.getFive());
            btn3_6.setText(row3.getSix());
            btn3_7.setText(row3.getSeven());
            btn3_8.setText(row3.getEigth());
            btn3_9.setText(row3.getNine());
        }
        for (AddNewGameRow4 row4 : db.allRows4()) {
            btn4_1.setText(row4.getOne());
            btn4_2.setText(row4.getTwo());
            btn4_3.setText(row4.getThree());
            btn4_4.setText(row4.getFour());
            btn4_5.setText(row4.getFive());
            btn4_6.setText(row4.getSix());
            btn4_7.setText(row4.getSeven());
            btn4_8.setText(row4.getEigth());
            btn4_9.setText(row4.getNine());
        }
        for (AddNewGameRow5 row5 : db.allRows5()) {
            btn5_1.setText(row5.getOne());
            btn5_2.setText(row5.getTwo());
            btn5_3.setText(row5.getThree());
            btn5_4.setText(row5.getFour());
            btn5_5.setText(row5.getFive());
            btn5_6.setText(row5.getSix());
            btn5_7.setText(row5.getSeven());
            btn5_8.setText(row5.getEigth());
            btn5_9.setText(row5.getNine());
        }
        for (AddNewGameRow6 row6 : db.allRows6()) {
            btn6_1.setText(row6.getOne());
            btn6_2.setText(row6.getTwo());
            btn6_3.setText(row6.getThree());
            btn6_4.setText(row6.getFour());
            btn6_5.setText(row6.getFive());
            btn6_6.setText(row6.getSix());
            btn6_7.setText(row6.getSeven());
            btn6_8.setText(row6.getEigth());
            btn6_9.setText(row6.getNine());
        }
        for (AddNewGameRow7 row7 : db.allRows7()) {
            btn7_1.setText(row7.getOne());
            btn7_2.setText(row7.getTwo());
            btn7_3.setText(row7.getThree());
            btn7_4.setText(row7.getFour());
            btn7_5.setText(row7.getFive());
            btn7_6.setText(row7.getSix());
            btn7_7.setText(row7.getSeven());
            btn7_8.setText(row7.getEigth());
            btn7_9.setText(row7.getNine());
        }
        for (AddNewGameRow8 row8 : db.allRows8()) {
            btn1_1.setText(row8.getOne());
            btn1_2.setText(row8.getTwo());
            btn1_3.setText(row8.getThree());
            btn1_4.setText(row8.getFour());
            btn1_5.setText(row8.getFive());
            btn1_6.setText(row8.getSix());
            btn1_7.setText(row8.getSeven());
            btn1_8.setText(row8.getEigth());
            btn1_9.setText(row8.getNine());
        }
        for (AddNewGameRow9 row9 : db.allRows9()) {
            btn9_1.setText(row9.getOne());
            btn9_2.setText(row9.getTwo());
            btn9_3.setText(row9.getThree());
            btn9_4.setText(row9.getFour());
            btn9_5.setText(row9.getFive());
            btn9_6.setText(row9.getSix());
            btn9_7.setText(row9.getSeven());
            btn9_8.setText(row9.getEigth());
            btn9_9.setText(row9.getNine());
        }

        if (!btn1_1.getText().isEmpty()) {
            btn1_1.setEnabled(false);
        }
        if (!btn1_2.getText().isEmpty()) {
            btn1_2.setEnabled(false);
        }
        if (!btn1_3.getText().isEmpty()) {
            btn1_3.setEnabled(false);
        }
        if (!btn1_4.getText().isEmpty()) {
            btn1_4.setEnabled(false);
        }
        if (!btn1_5.getText().isEmpty()) {
            btn1_5.setEnabled(false);
        }
        if (!btn1_6.getText().isEmpty()) {
            btn1_6.setEnabled(false);
        }
        if (!btn1_7.getText().isEmpty()) {
            btn1_7.setEnabled(false);
        }
        if (!btn1_8.getText().isEmpty()) {
            btn1_8.setEnabled(false);
        }
        if (!btn1_9.getText().isEmpty()) {
            btn1_9.setEnabled(false);
        }
        if (!btn2_1.getText().isEmpty()) {
            btn2_1.setEnabled(false);
        }
        if (!btn2_2.getText().isEmpty()) {
            btn2_2.setEnabled(false);
        }
        if (!btn2_3.getText().isEmpty()) {
            btn2_3.setEnabled(false);
        }
        if (!btn2_4.getText().isEmpty()) {
            btn2_4.setEnabled(false);
        }
        if (!btn2_5.getText().isEmpty()) {
            btn2_5.setEnabled(false);
        }
        if (!btn2_6.getText().isEmpty()) {
            btn2_6.setEnabled(false);
        }
        if (!btn2_7.getText().isEmpty()) {
            btn2_7.setEnabled(false);
        }
        if (!btn2_8.getText().isEmpty()) {
            btn2_8.setEnabled(false);
        }
        if (!btn2_9.getText().isEmpty()) {
            btn2_9.setEnabled(false);
        }
        if (!btn3_1.getText().isEmpty()) {
            btn3_1.setEnabled(false);
        }
        if (!btn3_2.getText().isEmpty()) {
            btn3_2.setEnabled(false);
        }
        if (!btn3_3.getText().isEmpty()) {
            btn3_3.setEnabled(false);
        }
        if (!btn3_4.getText().isEmpty()) {
            btn3_4.setEnabled(false);
        }
        if (!btn3_5.getText().isEmpty()) {
            btn3_5.setEnabled(false);
        }
        if (!btn3_6.getText().isEmpty()) {
            btn3_6.setEnabled(false);
        }
        if (!btn3_7.getText().isEmpty()) {
            btn3_7.setEnabled(false);
        }
        if (!btn3_8.getText().isEmpty()) {
            btn3_8.setEnabled(false);
        }
        if (!btn3_9.getText().isEmpty()) {
            btn3_9.setEnabled(false);
        }
        if (!btn4_1.getText().isEmpty()) {
            btn4_1.setEnabled(false);
        }
        if (!btn4_2.getText().isEmpty()) {
            btn4_2.setEnabled(false);
        }
        if (!btn4_3.getText().isEmpty()) {
            btn4_3.setEnabled(false);
        }
        if (!btn4_4.getText().isEmpty()) {
            btn4_4.setEnabled(false);
        }
        if (!btn4_5.getText().isEmpty()) {
            btn4_5.setEnabled(false);
        }
        if (!btn4_6.getText().isEmpty()) {
            btn4_6.setEnabled(false);
        }
        if (!btn4_7.getText().isEmpty()) {
            btn4_7.setEnabled(false);
        }
        if (!btn4_8.getText().isEmpty()) {
            btn4_8.setEnabled(false);
        }
        if (!btn4_9.getText().isEmpty()) {
            btn4_9.setEnabled(false);
        }
        if (!btn5_1.getText().isEmpty()) {
            btn5_1.setEnabled(false);
        }
        if (!btn5_2.getText().isEmpty()) {
            btn5_2.setEnabled(false);
        }
        if (!btn5_3.getText().isEmpty()) {
            btn5_3.setEnabled(false);
        }
        if (!btn5_4.getText().isEmpty()) {
            btn5_4.setEnabled(false);
        }
        if (!btn5_5.getText().isEmpty()) {
            btn5_5.setEnabled(false);
        }
        if (!btn5_6.getText().isEmpty()) {
            btn5_6.setEnabled(false);
        }
        if (!btn5_7.getText().isEmpty()) {
            btn5_7.setEnabled(false);
        }
        if (!btn5_8.getText().isEmpty()) {
            btn5_8.setEnabled(false);
        }
        if (!btn5_9.getText().isEmpty()) {
            btn5_9.setEnabled(false);
        }
        if (!btn6_1.getText().isEmpty()) {
            btn6_1.setEnabled(false);
        }
        if (!btn6_2.getText().isEmpty()) {
            btn6_2.setEnabled(false);
        }
        if (!btn6_3.getText().isEmpty()) {
            btn6_3.setEnabled(false);
        }
        if (!btn6_4.getText().isEmpty()) {
            btn6_4.setEnabled(false);
        }
        if (!btn6_5.getText().isEmpty()) {
            btn6_5.setEnabled(false);
        }
        if (!btn6_6.getText().isEmpty()) {
            btn6_6.setEnabled(false);
        }
        if (!btn6_7.getText().isEmpty()) {
            btn6_7.setEnabled(false);
        }
        if (!btn6_8.getText().isEmpty()) {
            btn6_8.setEnabled(false);
        }
        if (!btn6_9.getText().isEmpty()) {
            btn6_9.setEnabled(false);
        }
        if (!btn7_1.getText().isEmpty()) {
            btn7_1.setEnabled(false);
        }
        if (!btn7_2.getText().isEmpty()) {
            btn7_2.setEnabled(false);
        }
        if (!btn7_3.getText().isEmpty()) {
            btn7_3.setEnabled(false);
        }
        if (!btn7_4.getText().isEmpty()) {
            btn7_4.setEnabled(false);
        }
        if (!btn7_5.getText().isEmpty()) {
            btn7_5.setEnabled(false);
        }
        if (!btn7_6.getText().isEmpty()) {
            btn7_6.setEnabled(false);
        }
        if (!btn7_7.getText().isEmpty()) {
            btn7_7.setEnabled(false);
        }
        if (!btn7_8.getText().isEmpty()) {
            btn7_8.setEnabled(false);
        }
        if (!btn7_9.getText().isEmpty()) {
            btn7_9.setEnabled(false);
        }
        if (!btn8_1.getText().isEmpty()) {
            btn8_1.setEnabled(false);
        }
        if (!btn8_2.getText().isEmpty()) {
            btn8_2.setEnabled(false);
        }
        if (!btn8_3.getText().isEmpty()) {
            btn8_3.setEnabled(false);
        }
        if (!btn8_4.getText().isEmpty()) {
            btn8_4.setEnabled(false);
        }
        if (!btn8_5.getText().isEmpty()) {
            btn8_5.setEnabled(false);
        }
        if (!btn8_6.getText().isEmpty()) {
            btn8_6.setEnabled(false);
        }
        if (!btn8_7.getText().isEmpty()) {
            btn8_7.setEnabled(false);
        }
        if (!btn8_8.getText().isEmpty()) {
            btn8_8.setEnabled(false);
        }
        if (!btn8_9.getText().isEmpty()) {
            btn8_9.setEnabled(false);
        }
        if (!btn9_1.getText().isEmpty()) {
            btn9_1.setEnabled(false);
        }
        if (!btn9_2.getText().isEmpty()) {
            btn9_2.setEnabled(false);
        }
        if (!btn9_3.getText().isEmpty()) {
            btn9_3.setEnabled(false);
        }
        if (!btn9_4.getText().isEmpty()) {
            btn9_4.setEnabled(false);
        }
        if (!btn9_5.getText().isEmpty()) {
            btn9_5.setEnabled(false);
        }
        if (!btn9_6.getText().isEmpty()) {
            btn9_6.setEnabled(false);
        }
        if (!btn9_7.getText().isEmpty()) {
            btn9_7.setEnabled(false);
        }
        if (!btn9_8.getText().isEmpty()) {
            btn9_8.setEnabled(false);
        }
        if (!btn9_9.getText().isEmpty()) {
            btn9_9.setEnabled(false);
        }

        if (!btn1_1.getText().isEmpty()) {
            btn1_1.setForeground(Color.BLUE);
        }
        if (!btn1_2.getText().isEmpty()) {
            btn1_2.setForeground(Color.BLUE);
        }
        if (!btn1_3.getText().isEmpty()) {
            btn1_3.setForeground(Color.BLUE);
        }
        if (!btn1_4.getText().isEmpty()) {
            btn1_4.setForeground(Color.BLUE);
        }
        if (!btn1_5.getText().isEmpty()) {
            btn1_5.setForeground(Color.BLUE);
        }
        if (!btn1_6.getText().isEmpty()) {
            btn1_6.setForeground(Color.BLUE);
        }
        if (!btn1_7.getText().isEmpty()) {
            btn1_7.setForeground(Color.BLUE);
        }
        if (!btn1_8.getText().isEmpty()) {
            btn1_8.setForeground(Color.BLUE);
        }
        if (!btn1_9.getText().isEmpty()) {
            btn1_9.setForeground(Color.BLUE);
        }
        if (!btn2_1.getText().isEmpty()) {
            btn2_1.setForeground(Color.BLUE);
        }
        if (!btn2_2.getText().isEmpty()) {
            btn2_2.setForeground(Color.BLUE);
        }
        if (!btn2_3.getText().isEmpty()) {
            btn2_3.setForeground(Color.BLUE);
        }
        if (!btn2_4.getText().isEmpty()) {
            btn2_4.setForeground(Color.BLUE);
        }
        if (!btn2_5.getText().isEmpty()) {
            btn2_5.setForeground(Color.BLUE);
        }
        if (!btn2_6.getText().isEmpty()) {
            btn2_6.setForeground(Color.BLUE);
        }
        if (!btn2_7.getText().isEmpty()) {
            btn2_7.setForeground(Color.BLUE);
        }
        if (!btn2_8.getText().isEmpty()) {
            btn2_8.setForeground(Color.BLUE);
        }
        if (!btn2_9.getText().isEmpty()) {
            btn2_9.setForeground(Color.BLUE);
        }
        if (!btn3_1.getText().isEmpty()) {
            btn3_1.setForeground(Color.BLUE);
        }
        if (!btn3_2.getText().isEmpty()) {
            btn3_2.setForeground(Color.BLUE);
        }
        if (!btn3_3.getText().isEmpty()) {
            btn3_3.setForeground(Color.BLUE);
        }
        if (!btn3_4.getText().isEmpty()) {
            btn3_4.setForeground(Color.BLUE);
        }
        if (!btn3_5.getText().isEmpty()) {
            btn3_5.setForeground(Color.BLUE);
        }
        if (!btn3_6.getText().isEmpty()) {
            btn3_6.setForeground(Color.BLUE);
        }
        if (!btn3_7.getText().isEmpty()) {
            btn3_7.setForeground(Color.BLUE);
        }
        if (!btn3_8.getText().isEmpty()) {
            btn3_8.setForeground(Color.BLUE);
        }
        if (!btn3_9.getText().isEmpty()) {
            btn3_9.setForeground(Color.BLUE);
        }
        if (!btn4_1.getText().isEmpty()) {
            btn4_1.setForeground(Color.BLUE);
        }
        if (!btn4_2.getText().isEmpty()) {
            btn4_2.setForeground(Color.BLUE);
        }
        if (!btn4_3.getText().isEmpty()) {
            btn4_3.setForeground(Color.BLUE);
        }
        if (!btn4_4.getText().isEmpty()) {
            btn4_4.setForeground(Color.BLUE);
        }
        if (!btn4_5.getText().isEmpty()) {
            btn4_5.setForeground(Color.BLUE);
        }
        if (!btn4_6.getText().isEmpty()) {
            btn4_6.setForeground(Color.BLUE);
        }
        if (!btn4_7.getText().isEmpty()) {
            btn4_7.setForeground(Color.BLUE);
        }
        if (!btn4_8.getText().isEmpty()) {
            btn4_8.setForeground(Color.BLUE);
        }
        if (!btn4_9.getText().isEmpty()) {
            btn4_9.setForeground(Color.BLUE);
        }
        if (!btn5_1.getText().isEmpty()) {
            btn5_1.setForeground(Color.BLUE);
        }
        if (!btn5_2.getText().isEmpty()) {
            btn5_2.setForeground(Color.BLUE);
        }
        if (!btn5_3.getText().isEmpty()) {
            btn5_3.setForeground(Color.BLUE);
        }
        if (!btn5_4.getText().isEmpty()) {
            btn5_4.setForeground(Color.BLUE);
        }
        if (!btn5_5.getText().isEmpty()) {
            btn5_5.setForeground(Color.BLUE);
        }
        if (!btn5_6.getText().isEmpty()) {
            btn5_6.setForeground(Color.BLUE);
        }
        if (!btn5_7.getText().isEmpty()) {
            btn5_7.setForeground(Color.BLUE);
        }
        if (!btn5_8.getText().isEmpty()) {
            btn5_8.setForeground(Color.BLUE);
        }
        if (!btn5_9.getText().isEmpty()) {
            btn5_9.setForeground(Color.BLUE);
        }
        if (!btn6_1.getText().isEmpty()) {
            btn6_1.setForeground(Color.BLUE);
        }
        if (!btn6_2.getText().isEmpty()) {
            btn6_2.setForeground(Color.BLUE);
        }
        if (!btn6_3.getText().isEmpty()) {
            btn6_3.setForeground(Color.BLUE);
        }
        if (!btn6_4.getText().isEmpty()) {
            btn6_4.setForeground(Color.BLUE);
        }
        if (!btn6_5.getText().isEmpty()) {
            btn6_5.setForeground(Color.BLUE);
        }
        if (!btn6_6.getText().isEmpty()) {
            btn6_6.setForeground(Color.BLUE);
        }
        if (!btn6_7.getText().isEmpty()) {
            btn6_7.setForeground(Color.BLUE);
        }
        if (!btn6_8.getText().isEmpty()) {
            btn6_8.setForeground(Color.BLUE);
        }
        if (!btn6_9.getText().isEmpty()) {
            btn6_9.setForeground(Color.BLUE);
        }
        if (!btn7_1.getText().isEmpty()) {
            btn7_1.setForeground(Color.BLUE);
        }
        if (!btn7_2.getText().isEmpty()) {
            btn7_2.setForeground(Color.BLUE);
        }
        if (!btn7_3.getText().isEmpty()) {
            btn7_3.setForeground(Color.BLUE);
        }
        if (!btn7_4.getText().isEmpty()) {
            btn7_4.setForeground(Color.BLUE);
        }
        if (!btn7_5.getText().isEmpty()) {
            btn7_5.setForeground(Color.BLUE);
        }
        if (!btn7_6.getText().isEmpty()) {
            btn7_6.setForeground(Color.BLUE);
        }
        if (!btn7_7.getText().isEmpty()) {
            btn7_7.setForeground(Color.BLUE);
        }
        if (!btn7_8.getText().isEmpty()) {
            btn7_8.setForeground(Color.BLUE);
        }
        if (!btn7_9.getText().isEmpty()) {
            btn7_9.setForeground(Color.BLUE);
        }
        if (!btn8_1.getText().isEmpty()) {
            btn8_1.setForeground(Color.BLUE);
        }
        if (!btn8_2.getText().isEmpty()) {
            btn8_2.setForeground(Color.BLUE);
        }
        if (!btn8_3.getText().isEmpty()) {
            btn8_3.setForeground(Color.BLUE);
        }
        if (!btn8_4.getText().isEmpty()) {
            btn8_4.setForeground(Color.BLUE);
        }
        if (!btn8_5.getText().isEmpty()) {
            btn8_5.setForeground(Color.BLUE);
        }
        if (!btn8_6.getText().isEmpty()) {
            btn8_6.setForeground(Color.BLUE);
        }
        if (!btn8_7.getText().isEmpty()) {
            btn8_7.setForeground(Color.BLUE);
        }
        if (!btn8_8.getText().isEmpty()) {
            btn8_8.setForeground(Color.BLUE);
        }
        if (!btn8_9.getText().isEmpty()) {
            btn8_9.setForeground(Color.BLUE);
        }
        if (!btn9_1.getText().isEmpty()) {
            btn9_1.setForeground(Color.BLUE);
        }
        if (!btn9_2.getText().isEmpty()) {
            btn9_2.setForeground(Color.BLUE);
        }
        if (!btn9_3.getText().isEmpty()) {
            btn9_3.setForeground(Color.BLUE);
        }
        if (!btn9_4.getText().isEmpty()) {
            btn9_4.setForeground(Color.BLUE);
        }
        if (!btn9_5.getText().isEmpty()) {
            btn9_5.setForeground(Color.BLUE);
        }
        if (!btn9_6.getText().isEmpty()) {
            btn9_6.setForeground(Color.BLUE);
        }
        if (!btn9_7.getText().isEmpty()) {
            btn9_7.setForeground(Color.BLUE);
        }
        if (!btn9_8.getText().isEmpty()) {
            btn9_8.setForeground(Color.BLUE);
        }
        if (!btn9_9.getText().isEmpty()) {
            btn9_9.setForeground(Color.BLUE);
        }


    }//GEN-LAST:event_formWindowOpened

    private void btn7_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_7ActionPerformed
        if (btn7_1.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn7_7.setText(btnName);
        }
    }//GEN-LAST:event_btn7_7ActionPerformed

    private void btn7_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_2ActionPerformed
        if (btn7_1.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn7_2.setText(btnName);
        }
    }//GEN-LAST:event_btn7_2ActionPerformed

    private void btn7_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_9ActionPerformed
        if (btn7_1.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn7_9.setText(btnName);
        }
    }//GEN-LAST:event_btn7_9ActionPerformed

    private void btn8_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_7ActionPerformed
        if (btn8_1.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn8_7.setText(btnName);
        }
    }//GEN-LAST:event_btn8_7ActionPerformed

    private void btn8_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_2ActionPerformed
        if (btn8_1.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn8_2.setText(btnName);
        }
    }//GEN-LAST:event_btn8_2ActionPerformed

    private void btn8_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_3ActionPerformed
        if (btn8_1.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn8_3.setText(btnName);
        }
    }//GEN-LAST:event_btn8_3ActionPerformed

    private void btn9_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_6ActionPerformed
        if (btn9_1.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn9_6.setText(btnName);
        }
    }//GEN-LAST:event_btn9_6ActionPerformed

    private void btn9_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_8ActionPerformed
        if (btn9_1.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn9_8.setText(btnName);
        }
    }//GEN-LAST:event_btn9_8ActionPerformed

    private void btn8_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_6ActionPerformed
        if (btn8_1.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn8_6.setText(btnName);
        }
    }//GEN-LAST:event_btn8_6ActionPerformed

    private void btn8_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_8ActionPerformed
        if (btn8_1.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn8_8.setText(btnName);
        }
    }//GEN-LAST:event_btn8_8ActionPerformed

    private void btn7_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_5ActionPerformed
        if (btn7_1.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn7_5.setText(btnName);
        }
    }//GEN-LAST:event_btn7_5ActionPerformed

    private void btn8_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_1ActionPerformed
        if (btn8_2.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn1_1.getText().equalsIgnoreCase(btnName)
                || btn2_1.getText().equalsIgnoreCase(btnName)
                || btn3_1.getText().equalsIgnoreCase(btnName)
                || btn4_1.getText().equalsIgnoreCase(btnName)
                || btn5_1.getText().equalsIgnoreCase(btnName)
                || btn6_1.getText().equalsIgnoreCase(btnName)
                || btn7_1.getText().equalsIgnoreCase(btnName)
                || btn9_1.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn8_1.setText(btnName);
        }
    }//GEN-LAST:event_btn8_1ActionPerformed

    private void btn7_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_8ActionPerformed
        if (btn7_1.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn7_8.setText(btnName);
        }
    }//GEN-LAST:event_btn7_8ActionPerformed

    private void btn8_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_4ActionPerformed
        if (btn8_1.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn8_4.setText(btnName);
        }
    }//GEN-LAST:event_btn8_4ActionPerformed

    private void btn7_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_1ActionPerformed
        if (btn7_2.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn1_1.getText().equalsIgnoreCase(btnName)
                || btn2_1.getText().equalsIgnoreCase(btnName)
                || btn3_1.getText().equalsIgnoreCase(btnName)
                || btn4_1.getText().equalsIgnoreCase(btnName)
                || btn5_1.getText().equalsIgnoreCase(btnName)
                || btn6_1.getText().equalsIgnoreCase(btnName)
                || btn8_1.getText().equalsIgnoreCase(btnName)
                || btn9_1.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn7_1.setText(btnName);
        }
    }//GEN-LAST:event_btn7_1ActionPerformed

    private void btn8_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_9ActionPerformed
        if (btn8_1.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn8_9.setText(btnName);
        }
    }//GEN-LAST:event_btn8_9ActionPerformed

    private void btn7_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_4ActionPerformed
        if (btn7_1.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn7_4.setText(btnName);
        }
    }//GEN-LAST:event_btn7_4ActionPerformed

    private void btn7_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_3ActionPerformed
        if (btn7_1.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn7_3.setText(btnName);
        }
    }//GEN-LAST:event_btn7_3ActionPerformed

    private void btn8_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8_5ActionPerformed
        if (btn8_1.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn8_5.setText(btnName);
        }
    }//GEN-LAST:event_btn8_5ActionPerformed

    private void btn7_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7_6ActionPerformed
        if (btn7_1.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn7_6.setText(btnName);
        }
    }//GEN-LAST:event_btn7_6ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btnName = "";
        btnName = six;
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        int count = 0;
        for (int i = 0; i < 1; i++) {
            if (btn1_1.getText().isEmpty()) {
                btn1_1.setBackground(Color.red);
                count++;
            }
            if (btn1_2.getText().isEmpty()) {
                btn1_2.setBackground(Color.red);
                count++;
            }
            if (btn1_3.getText().isEmpty()) {
                btn1_3.setBackground(Color.red);
                count++;
            }
            if (btn1_4.getText().isEmpty()) {
                btn1_4.setBackground(Color.red);
                count++;
            }
            if (btn1_5.getText().isEmpty()) {
                btn1_5.setBackground(Color.red);
                count++;
            }
            if (btn1_6.getText().isEmpty()) {
                btn1_6.setBackground(Color.red);
                count++;
            }
            if (btn1_7.getText().isEmpty()) {
                btn1_7.setBackground(Color.red);
                count++;
            }
            if (btn1_8.getText().isEmpty()) {
                btn1_8.setBackground(Color.red);
                count++;
            }
            if (btn1_9.getText().isEmpty()) {
                btn1_9.setBackground(Color.red);
                count++;
            }
            if (btn2_1.getText().isEmpty()) {
                btn2_1.setBackground(Color.red);
                count++;
            }
            if (btn2_2.getText().isEmpty()) {
                btn2_2.setBackground(Color.red);
                count++;
            }
            if (btn2_3.getText().isEmpty()) {
                btn2_3.setBackground(Color.red);
                count++;
            }
            if (btn2_4.getText().isEmpty()) {
                btn2_4.setBackground(Color.red);
                count++;
            }
            if (btn2_5.getText().isEmpty()) {
                btn2_5.setBackground(Color.red);
                count++;
            }
            if (btn2_6.getText().isEmpty()) {
                btn2_6.setBackground(Color.red);
                count++;
            }
            if (btn2_7.getText().isEmpty()) {
                btn2_7.setBackground(Color.red);
                count++;
            }
            if (btn2_8.getText().isEmpty()) {
                btn2_8.setBackground(Color.red);
                count++;
            }
            if (btn2_9.getText().isEmpty()) {
                btn2_9.setBackground(Color.red);
                count++;
            }
            if (btn3_1.getText().isEmpty()) {
                btn3_1.setBackground(Color.red);
                count++;
            }
            if (btn3_2.getText().isEmpty()) {
                btn3_2.setBackground(Color.red);
                count++;
            }
            if (btn3_3.getText().isEmpty()) {
                btn3_3.setBackground(Color.red);
                count++;
            }
            if (btn3_4.getText().isEmpty()) {
                btn3_4.setBackground(Color.red);
                count++;
            }
            if (btn3_5.getText().isEmpty()) {
                btn3_5.setBackground(Color.red);
                count++;
            }
            if (btn3_6.getText().isEmpty()) {
                btn3_6.setBackground(Color.red);
                count++;
            }
            if (btn3_7.getText().isEmpty()) {
                btn3_7.setBackground(Color.red);
                count++;
            }
            if (btn3_8.getText().isEmpty()) {
                btn3_8.setBackground(Color.red);
                count++;
            }
            if (btn3_9.getText().isEmpty()) {
                btn3_9.setBackground(Color.red);
                count++;
            }
            if (btn4_1.getText().isEmpty()) {
                btn4_1.setBackground(Color.red);
                count++;
            }
            if (btn4_2.getText().isEmpty()) {
                btn4_2.setBackground(Color.red);
                count++;
            }
            if (btn4_3.getText().isEmpty()) {
                btn4_3.setBackground(Color.red);
                count++;
            }
            if (btn4_4.getText().isEmpty()) {
                btn4_4.setBackground(Color.red);
                count++;
            }
            if (btn4_5.getText().isEmpty()) {
                btn4_5.setBackground(Color.red);
                count++;
            }
            if (btn4_6.getText().isEmpty()) {
                btn4_6.setBackground(Color.red);
                count++;
            }
            if (btn4_7.getText().isEmpty()) {
                btn4_7.setBackground(Color.red);
                count++;
            }
            if (btn4_8.getText().isEmpty()) {
                btn4_8.setBackground(Color.red);
                count++;
            }
            if (btn4_9.getText().isEmpty()) {
                btn4_9.setBackground(Color.red);
                count++;
            }
            if (btn5_1.getText().isEmpty()) {
                btn5_1.setBackground(Color.red);
                count++;
            }
            if (btn5_2.getText().isEmpty()) {
                btn5_2.setBackground(Color.red);
                count++;
            }
            if (btn5_3.getText().isEmpty()) {
                btn5_3.setBackground(Color.red);
                count++;
            }
            if (btn5_4.getText().isEmpty()) {
                btn5_4.setBackground(Color.red);
                count++;
            }
            if (btn5_5.getText().isEmpty()) {
                btn5_5.setBackground(Color.red);
                count++;
            }
            if (btn5_6.getText().isEmpty()) {
                btn5_6.setBackground(Color.red);
                count++;
            }
            if (btn5_7.getText().isEmpty()) {
                btn5_7.setBackground(Color.red);
                count++;
            }
            if (btn5_8.getText().isEmpty()) {
                btn5_8.setBackground(Color.red);
                count++;
            }
            if (btn5_9.getText().isEmpty()) {
                btn5_9.setBackground(Color.red);
                count++;
            }
            if (btn6_1.getText().isEmpty()) {
                btn6_1.setBackground(Color.red);
                count++;
            }
            if (btn6_2.getText().isEmpty()) {
                btn6_2.setBackground(Color.red);
                count++;
            }
            if (btn6_3.getText().isEmpty()) {
                btn6_3.setBackground(Color.red);
                count++;
            }
            if (btn6_4.getText().isEmpty()) {
                btn6_4.setBackground(Color.red);
                count++;
            }
            if (btn6_5.getText().isEmpty()) {
                btn6_5.setBackground(Color.red);
                count++;
            }
            if (btn6_6.getText().isEmpty()) {
                btn6_6.setBackground(Color.red);
                count++;
            }
            if (btn6_7.getText().isEmpty()) {
                btn6_7.setBackground(Color.red);
                count++;
            }
            if (btn6_8.getText().isEmpty()) {
                btn6_8.setBackground(Color.red);
                count++;
            }
            if (btn6_9.getText().isEmpty()) {
                btn6_9.setBackground(Color.red);
                count++;
            }
            if (btn7_1.getText().isEmpty()) {
                btn7_1.setBackground(Color.red);
                count++;
            }
            if (btn7_2.getText().isEmpty()) {
                btn7_2.setBackground(Color.red);
                count++;
            }
            if (btn7_3.getText().isEmpty()) {
                btn7_3.setBackground(Color.red);
                count++;
            }
            if (btn7_4.getText().isEmpty()) {
                btn7_4.setBackground(Color.red);
                count++;
            }
            if (btn7_5.getText().isEmpty()) {
                btn7_5.setBackground(Color.red);
                count++;
            }
            if (btn7_6.getText().isEmpty()) {
                btn7_6.setBackground(Color.red);
                count++;
            }
            if (btn7_7.getText().isEmpty()) {
                btn7_7.setBackground(Color.red);
                count++;
            }
            if (btn7_8.getText().isEmpty()) {
                btn7_8.setBackground(Color.red);
                count++;
            }
            if (btn7_9.getText().isEmpty()) {
                btn7_9.setBackground(Color.red);
                count++;
            }
            if (btn8_1.getText().isEmpty()) {
                btn8_1.setBackground(Color.red);
                count++;
            }
            if (btn8_2.getText().isEmpty()) {
                btn8_2.setBackground(Color.red);
                count++;
            }
            if (btn8_3.getText().isEmpty()) {
                btn8_3.setBackground(Color.red);
                count++;
            }
            if (btn8_4.getText().isEmpty()) {
                btn8_4.setBackground(Color.red);
                count++;
            }
            if (btn8_5.getText().isEmpty()) {
                btn8_5.setBackground(Color.red);
                count++;
            }
            if (btn8_6.getText().isEmpty()) {
                btn8_6.setBackground(Color.red);
                count++;
            }
            if (btn8_7.getText().isEmpty()) {
                btn8_7.setBackground(Color.red);
                count++;
            }
            if (btn8_8.getText().isEmpty()) {
                btn8_8.setBackground(Color.red);
                count++;
            }
            if (btn8_9.getText().isEmpty()) {
                btn8_9.setBackground(Color.red);
                count++;
            }
            if (btn9_1.getText().isEmpty()) {
                btn9_1.setBackground(Color.red);
                count++;
            }
            if (btn9_2.getText().isEmpty()) {
                btn9_2.setBackground(Color.red);
                count++;
            }
            if (btn9_3.getText().isEmpty()) {
                btn9_3.setBackground(Color.red);
                count++;
            }
            if (btn9_4.getText().isEmpty()) {
                btn9_4.setBackground(Color.red);
                count++;
            }
            if (btn9_5.getText().isEmpty()) {
                btn9_5.setBackground(Color.red);
                count++;
            }
            if (btn9_6.getText().isEmpty()) {
                btn9_6.setBackground(Color.red);
                count++;
            }
            if (btn9_7.getText().isEmpty()) {
                btn9_7.setBackground(Color.red);
                count++;
            }
            if (btn9_8.getText().isEmpty()) {
                btn9_8.setBackground(Color.red);
                count++;
            }
            if (btn9_9.getText().isEmpty()) {
                btn9_9.setBackground(Color.red);
                count++;
            }
            if (count != 0) {
                JOptionPane.showMessageDialog(rootPane, "Siz  " + count + " - xananı boş buraxmısınız !!!");
            }
        }
        int coun = 0;
        for (int i = 0; i < 1; i++) {
            if (btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn9_1.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn9_1.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn9_1.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn9_1.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn9_1.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn9_1.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn9_1.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn9_1.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn8_1.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn9_2.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)
                    || btn1_1.getText().equalsIgnoreCase(btnName)
                    || btn2_1.getText().equalsIgnoreCase(btnName)
                    || btn3_1.getText().equalsIgnoreCase(btnName)
                    || btn4_1.getText().equalsIgnoreCase(btnName)
                    || btn5_1.getText().equalsIgnoreCase(btnName)
                    || btn6_1.getText().equalsIgnoreCase(btnName)
                    || btn7_1.getText().equalsIgnoreCase(btnName)
                    || btn8_1.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn9_1.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)
                    || btn1_2.getText().equalsIgnoreCase(btnName)
                    || btn2_2.getText().equalsIgnoreCase(btnName)
                    || btn3_2.getText().equalsIgnoreCase(btnName)
                    || btn4_2.getText().equalsIgnoreCase(btnName)
                    || btn5_2.getText().equalsIgnoreCase(btnName)
                    || btn6_2.getText().equalsIgnoreCase(btnName)
                    || btn7_2.getText().equalsIgnoreCase(btnName)
                    || btn8_2.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn9_1.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)
                    || btn1_3.getText().equalsIgnoreCase(btnName)
                    || btn2_3.getText().equalsIgnoreCase(btnName)
                    || btn3_3.getText().equalsIgnoreCase(btnName)
                    || btn4_3.getText().equalsIgnoreCase(btnName)
                    || btn5_3.getText().equalsIgnoreCase(btnName)
                    || btn6_3.getText().equalsIgnoreCase(btnName)
                    || btn7_3.getText().equalsIgnoreCase(btnName)
                    || btn8_3.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn9_1.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)
                    || btn1_4.getText().equalsIgnoreCase(btnName)
                    || btn2_4.getText().equalsIgnoreCase(btnName)
                    || btn3_4.getText().equalsIgnoreCase(btnName)
                    || btn4_4.getText().equalsIgnoreCase(btnName)
                    || btn5_4.getText().equalsIgnoreCase(btnName)
                    || btn6_4.getText().equalsIgnoreCase(btnName)
                    || btn7_4.getText().equalsIgnoreCase(btnName)
                    || btn8_4.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn9_1.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)
                    || btn1_5.getText().equalsIgnoreCase(btnName)
                    || btn2_5.getText().equalsIgnoreCase(btnName)
                    || btn3_5.getText().equalsIgnoreCase(btnName)
                    || btn4_5.getText().equalsIgnoreCase(btnName)
                    || btn5_5.getText().equalsIgnoreCase(btnName)
                    || btn6_5.getText().equalsIgnoreCase(btnName)
                    || btn7_5.getText().equalsIgnoreCase(btnName)
                    || btn8_5.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn9_1.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)
                    || btn1_6.getText().equalsIgnoreCase(btnName)
                    || btn2_6.getText().equalsIgnoreCase(btnName)
                    || btn3_6.getText().equalsIgnoreCase(btnName)
                    || btn4_6.getText().equalsIgnoreCase(btnName)
                    || btn5_6.getText().equalsIgnoreCase(btnName)
                    || btn6_6.getText().equalsIgnoreCase(btnName)
                    || btn7_6.getText().equalsIgnoreCase(btnName)
                    || btn8_6.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn9_1.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)
                    || btn1_7.getText().equalsIgnoreCase(btnName)
                    || btn2_7.getText().equalsIgnoreCase(btnName)
                    || btn3_7.getText().equalsIgnoreCase(btnName)
                    || btn4_7.getText().equalsIgnoreCase(btnName)
                    || btn5_7.getText().equalsIgnoreCase(btnName)
                    || btn6_7.getText().equalsIgnoreCase(btnName)
                    || btn7_7.getText().equalsIgnoreCase(btnName)
                    || btn8_7.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn9_1.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)
                    || btn9_9.getText().equalsIgnoreCase(btnName)
                    || btn1_8.getText().equalsIgnoreCase(btnName)
                    || btn2_8.getText().equalsIgnoreCase(btnName)
                    || btn3_8.getText().equalsIgnoreCase(btnName)
                    || btn4_8.getText().equalsIgnoreCase(btnName)
                    || btn5_8.getText().equalsIgnoreCase(btnName)
                    || btn6_8.getText().equalsIgnoreCase(btnName)
                    || btn7_8.getText().equalsIgnoreCase(btnName)
                    || btn8_8.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (btn9_1.getText().equalsIgnoreCase(btnName)
                    || btn9_2.getText().equalsIgnoreCase(btnName)
                    || btn9_3.getText().equalsIgnoreCase(btnName)
                    || btn9_4.getText().equalsIgnoreCase(btnName)
                    || btn9_5.getText().equalsIgnoreCase(btnName)
                    || btn9_6.getText().equalsIgnoreCase(btnName)
                    || btn9_7.getText().equalsIgnoreCase(btnName)
                    || btn9_8.getText().equalsIgnoreCase(btnName)
                    || btn1_9.getText().equalsIgnoreCase(btnName)
                    || btn2_9.getText().equalsIgnoreCase(btnName)
                    || btn3_9.getText().equalsIgnoreCase(btnName)
                    || btn4_9.getText().equalsIgnoreCase(btnName)
                    || btn5_9.getText().equalsIgnoreCase(btnName)
                    || btn6_9.getText().equalsIgnoreCase(btnName)
                    || btn7_9.getText().equalsIgnoreCase(btnName)
                    || btn8_9.getText().equalsIgnoreCase(btnName)) {
                coun++;
            }
            if (coun != 0) {
                JOptionPane.showMessageDialog(rootPane, "Sizin  " + coun + " - səhfiniz var !!!");
            }
        }
        if ((count == 0) && (coun == 0)) {
            JOptionPane.showMessageDialog(rootPane, "TƏBRİKLƏR!!! Siz bütün rəqəmləri doğru yerləşdirdiniz");
        }
    }//GEN-LAST:event_btnTestActionPerformed

    private void btn2_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_9ActionPerformed
        if (btn2_1.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn2_9.setText(btnName);
        }

    }//GEN-LAST:event_btn2_9ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btnName = "";
        btnName = five;
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btnName = "";
        btnName = four;
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btnName = "";
        btnName = seven;
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_2ActionPerformed
        if (btn2_1.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn2_2.setText(btnName);
        }
    }//GEN-LAST:event_btn2_2ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btnName = "";
        btnName = nine;
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_4ActionPerformed
        if (btn2_1.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn2_4.setText(btnName);
        }
    }//GEN-LAST:event_btn2_4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btnName = "";
        btnName = three;
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btnName = "";
        btnName = eigth;
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn2_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_8ActionPerformed
        if (btn2_1.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn2_8.setText(btnName);
        }
    }//GEN-LAST:event_btn2_8ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btnName = "";
        btnName = two;
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btnName = "";
        btnName = one;
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_7ActionPerformed
        if (btn2_1.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn2_7.setText(btnName);
        }
    }//GEN-LAST:event_btn2_7ActionPerformed

    private void btn1_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_7ActionPerformed
        if (btn1_1.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn1_7.setText(btnName);
        }
    }//GEN-LAST:event_btn1_7ActionPerformed

    private void btn2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_3ActionPerformed
        if (btn2_1.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn2_3.setText(btnName);
        }
    }//GEN-LAST:event_btn2_3ActionPerformed

    private void btn1_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_6ActionPerformed
        if (btn1_1.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn1_6.setText(btnName);
        }
    }//GEN-LAST:event_btn1_6ActionPerformed

    private void btn1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_2ActionPerformed
        if (btn1_1.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn1_2.setText(btnName);
        }
    }//GEN-LAST:event_btn1_2ActionPerformed

    private void btn1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_3ActionPerformed
        if (btn1_1.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn1_3.setText(btnName);
        }
    }//GEN-LAST:event_btn1_3ActionPerformed

    private void btn2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_5ActionPerformed
        if (btn2_1.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn2_5.setText(btnName);
        }
    }//GEN-LAST:event_btn2_5ActionPerformed

    private void btn1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_4ActionPerformed
        if (btn1_1.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn1_4.setText(btnName);
        }
    }//GEN-LAST:event_btn1_4ActionPerformed

    private void btn2_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_6ActionPerformed
        if (btn2_1.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn2_6.setText(btnName);
        }
    }//GEN-LAST:event_btn2_6ActionPerformed

    private void btn9_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_2ActionPerformed
        if (btn9_1.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn9_2.setText(btnName);
        }
    }//GEN-LAST:event_btn9_2ActionPerformed

    private void btn1_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_9ActionPerformed
        if (btn1_1.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn1_9.setText(btnName);
        }
    }//GEN-LAST:event_btn1_9ActionPerformed

    private void btn9_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_3ActionPerformed
        if (btn9_1.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn9_3.setText(btnName);
        }
    }//GEN-LAST:event_btn9_3ActionPerformed

    private void btn9_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_5ActionPerformed
        if (btn9_1.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn9_5.setText(btnName);
        }
    }//GEN-LAST:event_btn9_5ActionPerformed

    private void btn9_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_7ActionPerformed
        if (btn9_1.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn9_7.setText(btnName);
        }
    }//GEN-LAST:event_btn9_7ActionPerformed

    private void btn9_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_4ActionPerformed
        if (btn9_1.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn9_4.setText(btnName);
        }
    }//GEN-LAST:event_btn9_4ActionPerformed

    private void btn9_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_1ActionPerformed
        if (btn9_2.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)
                || btn1_1.getText().equalsIgnoreCase(btnName)
                || btn2_1.getText().equalsIgnoreCase(btnName)
                || btn3_1.getText().equalsIgnoreCase(btnName)
                || btn4_1.getText().equalsIgnoreCase(btnName)
                || btn5_1.getText().equalsIgnoreCase(btnName)
                || btn6_1.getText().equalsIgnoreCase(btnName)
                || btn7_1.getText().equalsIgnoreCase(btnName)
                || btn8_1.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn9_1.setText(btnName);
        }
    }//GEN-LAST:event_btn9_1ActionPerformed

    private void btn9_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9_9ActionPerformed
        if (btn9_1.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn9_9.setText(btnName);
        }
    }//GEN-LAST:event_btn9_9ActionPerformed

    private void btn3_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_4ActionPerformed
        if (btn3_1.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn3_4.setText(btnName);
        }
    }//GEN-LAST:event_btn3_4ActionPerformed

    private void btn3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_3ActionPerformed
        if (btn3_1.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn3_3.setText(btnName);
        }
    }//GEN-LAST:event_btn3_3ActionPerformed

    private void btn3_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_7ActionPerformed
        if (btn3_1.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn3_7.setText(btnName);
        }
    }//GEN-LAST:event_btn3_7ActionPerformed

    private void btn3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_2ActionPerformed
        if (btn3_1.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn3_2.setText(btnName);
        }
    }//GEN-LAST:event_btn3_2ActionPerformed

    private void btn3_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_6ActionPerformed
        if (btn3_1.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn3_6.setText(btnName);
        }
    }//GEN-LAST:event_btn3_6ActionPerformed

    private void btn4_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_5ActionPerformed
        if (btn4_1.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn4_5.setText(btnName);
        }
    }//GEN-LAST:event_btn4_5ActionPerformed

    private void btn3_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_9ActionPerformed
        if (btn3_1.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn3_9.setText(btnName);
        }
    }//GEN-LAST:event_btn3_9ActionPerformed

    private void btn4_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_7ActionPerformed
        if (btn4_1.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn4_7.setText(btnName);
        }
    }//GEN-LAST:event_btn4_7ActionPerformed

    private void btn4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_2ActionPerformed
        if (btn4_1.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn4_2.setText(btnName);
        }
    }//GEN-LAST:event_btn4_2ActionPerformed

    private void btn4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_3ActionPerformed
        if (btn4_1.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn4_3.setText(btnName);
        }
    }//GEN-LAST:event_btn4_3ActionPerformed

    private void btn1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_5ActionPerformed
        if (btn1_1.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn1_5.setText(btnName);
        }
    }//GEN-LAST:event_btn1_5ActionPerformed

    private void btn4_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_9ActionPerformed
        if (btn4_1.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn4_9.setText(btnName);
        }
    }//GEN-LAST:event_btn4_9ActionPerformed

    private void btn2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_1ActionPerformed
        if (btn2_2.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn1_1.getText().equalsIgnoreCase(btnName)
                || btn3_1.getText().equalsIgnoreCase(btnName)
                || btn4_1.getText().equalsIgnoreCase(btnName)
                || btn5_1.getText().equalsIgnoreCase(btnName)
                || btn6_1.getText().equalsIgnoreCase(btnName)
                || btn7_1.getText().equalsIgnoreCase(btnName)
                || btn8_1.getText().equalsIgnoreCase(btnName)
                || btn9_1.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn2_1.setText(btnName);
        }
    }//GEN-LAST:event_btn2_1ActionPerformed

    private void btn1_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_8ActionPerformed
        if (btn1_1.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn1_8.setText(btnName);
        }
    }//GEN-LAST:event_btn1_8ActionPerformed

    private void btn3_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_5ActionPerformed
        if (btn3_1.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn3_5.setText(btnName);
        }
    }//GEN-LAST:event_btn3_5ActionPerformed

    private void btn1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_1ActionPerformed

        if (btn1_2.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_1.getText().equalsIgnoreCase(btnName)
                || btn3_1.getText().equalsIgnoreCase(btnName)
                || btn4_1.getText().equalsIgnoreCase(btnName)
                || btn5_1.getText().equalsIgnoreCase(btnName)
                || btn6_1.getText().equalsIgnoreCase(btnName)
                || btn7_1.getText().equalsIgnoreCase(btnName)
                || btn8_1.getText().equalsIgnoreCase(btnName)
                || btn9_1.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn1_1.setText(btnName);
        }

    }//GEN-LAST:event_btn1_1ActionPerformed

    private void btn4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_1ActionPerformed

        if (btn4_2.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn1_1.getText().equalsIgnoreCase(btnName)
                || btn2_1.getText().equalsIgnoreCase(btnName)
                || btn3_1.getText().equalsIgnoreCase(btnName)
                || btn5_1.getText().equalsIgnoreCase(btnName)
                || btn6_1.getText().equalsIgnoreCase(btnName)
                || btn7_1.getText().equalsIgnoreCase(btnName)
                || btn8_1.getText().equalsIgnoreCase(btnName)
                || btn9_1.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn4_1.setText(btnName);
        }
    }//GEN-LAST:event_btn4_1ActionPerformed

    private void btn3_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_8ActionPerformed
        if (btn3_1.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn3_8.setText(btnName);
        }
    }//GEN-LAST:event_btn3_8ActionPerformed

    private void btn4_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_4ActionPerformed
        if (btn4_1.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn4_4.setText(btnName);
        }
    }//GEN-LAST:event_btn4_4ActionPerformed

    private void btn3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3_1ActionPerformed
        if (btn3_2.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn1_1.getText().equalsIgnoreCase(btnName)
                || btn2_1.getText().equalsIgnoreCase(btnName)
                || btn4_1.getText().equalsIgnoreCase(btnName)
                || btn5_1.getText().equalsIgnoreCase(btnName)
                || btn6_1.getText().equalsIgnoreCase(btnName)
                || btn7_1.getText().equalsIgnoreCase(btnName)
                || btn8_1.getText().equalsIgnoreCase(btnName)
                || btn9_1.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn3_1.setText(btnName);
        }
    }//GEN-LAST:event_btn3_1ActionPerformed

    private void btn5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_2ActionPerformed
        if (btn5_1.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn5_2.setText(btnName);
        }
    }//GEN-LAST:event_btn5_2ActionPerformed

    private void btn5_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_7ActionPerformed
        if (btn5_1.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn5_7.setText(btnName);
        }
    }//GEN-LAST:event_btn5_7ActionPerformed

    private void btn6_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_5ActionPerformed
        if (btn6_1.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn6_5.setText(btnName);
        }
    }//GEN-LAST:event_btn6_5ActionPerformed

    private void btn5_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_6ActionPerformed
        if (btn5_1.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn5_6.setText(btnName);
        }
    }//GEN-LAST:event_btn5_6ActionPerformed

    private void btn6_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_8ActionPerformed
        if (btn6_1.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn6_8.setText(btnName);
        }
    }//GEN-LAST:event_btn6_8ActionPerformed

    private void btn6_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_6ActionPerformed
        if (btn6_1.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn6_6.setText(btnName);
        }
    }//GEN-LAST:event_btn6_6ActionPerformed

    private void btn5_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_9ActionPerformed
        if (btn5_1.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn5_9.setText(btnName);
        }
    }//GEN-LAST:event_btn5_9ActionPerformed

    private void btn6_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_7ActionPerformed
        if (btn6_1.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn1_7.getText().equalsIgnoreCase(btnName)
                || btn2_7.getText().equalsIgnoreCase(btnName)
                || btn3_7.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn7_7.getText().equalsIgnoreCase(btnName)
                || btn8_7.getText().equalsIgnoreCase(btnName)
                || btn9_7.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn6_7.setText(btnName);
        }
    }//GEN-LAST:event_btn6_7ActionPerformed

    private void btn6_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_2ActionPerformed
        if (btn6_1.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn1_2.getText().equalsIgnoreCase(btnName)
                || btn2_2.getText().equalsIgnoreCase(btnName)
                || btn3_2.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn7_2.getText().equalsIgnoreCase(btnName)
                || btn8_2.getText().equalsIgnoreCase(btnName)
                || btn9_2.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn6_2.setText(btnName);
        }
    }//GEN-LAST:event_btn6_2ActionPerformed

    private void btn6_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_3ActionPerformed
        if (btn6_1.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn6_3.setText(btnName);
        }
    }//GEN-LAST:event_btn6_3ActionPerformed

    private void btn4_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_6ActionPerformed
        if (btn4_1.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn1_6.getText().equalsIgnoreCase(btnName)
                || btn2_6.getText().equalsIgnoreCase(btnName)
                || btn3_6.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn7_6.getText().equalsIgnoreCase(btnName)
                || btn8_6.getText().equalsIgnoreCase(btnName)
                || btn9_6.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn4_6.setText(btnName);
        }
    }//GEN-LAST:event_btn4_6ActionPerformed

    private void btn4_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4_8ActionPerformed
        if (btn4_1.getText().equalsIgnoreCase(btnName)
                || btn4_2.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn4_6.getText().equalsIgnoreCase(btnName)
                || btn4_7.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn4_8.setText(btnName);
        }
    }//GEN-LAST:event_btn4_8ActionPerformed

    private void btn5_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_5ActionPerformed
        if (btn5_1.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn1_5.getText().equalsIgnoreCase(btnName)
                || btn2_5.getText().equalsIgnoreCase(btnName)
                || btn3_5.getText().equalsIgnoreCase(btnName)
                || btn4_5.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn7_5.getText().equalsIgnoreCase(btnName)
                || btn8_5.getText().equalsIgnoreCase(btnName)
                || btn9_5.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn5_5.setText(btnName);
        }
    }//GEN-LAST:event_btn5_5ActionPerformed

    private void btn5_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_4ActionPerformed
        if (btn5_1.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn5_4.setText(btnName);
        }
    }//GEN-LAST:event_btn5_4ActionPerformed

    private void btn6_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_9ActionPerformed
        if (btn6_1.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn1_9.getText().equalsIgnoreCase(btnName)
                || btn2_9.getText().equalsIgnoreCase(btnName)
                || btn3_9.getText().equalsIgnoreCase(btnName)
                || btn4_9.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn7_9.getText().equalsIgnoreCase(btnName)
                || btn8_9.getText().equalsIgnoreCase(btnName)
                || btn9_9.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn6_9.setText(btnName);
        }
    }//GEN-LAST:event_btn6_9ActionPerformed

    private void btn5_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_3ActionPerformed
        if (btn5_1.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn1_3.getText().equalsIgnoreCase(btnName)
                || btn2_3.getText().equalsIgnoreCase(btnName)
                || btn3_3.getText().equalsIgnoreCase(btnName)
                || btn4_3.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn7_3.getText().equalsIgnoreCase(btnName)
                || btn8_3.getText().equalsIgnoreCase(btnName)
                || btn9_3.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn5_3.setText(btnName);
        }
    }//GEN-LAST:event_btn5_3ActionPerformed

    private void btn6_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_1ActionPerformed
        if (btn6_2.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn6_4.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn1_1.getText().equalsIgnoreCase(btnName)
                || btn2_1.getText().equalsIgnoreCase(btnName)
                || btn3_1.getText().equalsIgnoreCase(btnName)
                || btn4_1.getText().equalsIgnoreCase(btnName)
                || btn5_1.getText().equalsIgnoreCase(btnName)
                || btn7_1.getText().equalsIgnoreCase(btnName)
                || btn8_1.getText().equalsIgnoreCase(btnName)
                || btn9_1.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn6_1.setText(btnName);
        }
    }//GEN-LAST:event_btn6_1ActionPerformed

    private void btn5_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_8ActionPerformed
        if (btn5_1.getText().equalsIgnoreCase(btnName)
                || btn5_2.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn1_8.getText().equalsIgnoreCase(btnName)
                || btn2_8.getText().equalsIgnoreCase(btnName)
                || btn3_8.getText().equalsIgnoreCase(btnName)
                || btn4_8.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn7_8.getText().equalsIgnoreCase(btnName)
                || btn8_8.getText().equalsIgnoreCase(btnName)
                || btn9_8.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn5_8.setText(btnName);
        }
    }//GEN-LAST:event_btn5_8ActionPerformed

    private void btn6_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6_4ActionPerformed
        if (btn6_1.getText().equalsIgnoreCase(btnName)
                || btn6_2.getText().equalsIgnoreCase(btnName)
                || btn6_3.getText().equalsIgnoreCase(btnName)
                || btn6_5.getText().equalsIgnoreCase(btnName)
                || btn6_6.getText().equalsIgnoreCase(btnName)
                || btn6_7.getText().equalsIgnoreCase(btnName)
                || btn6_8.getText().equalsIgnoreCase(btnName)
                || btn6_9.getText().equalsIgnoreCase(btnName)
                || btn1_4.getText().equalsIgnoreCase(btnName)
                || btn2_4.getText().equalsIgnoreCase(btnName)
                || btn3_4.getText().equalsIgnoreCase(btnName)
                || btn4_4.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn7_4.getText().equalsIgnoreCase(btnName)
                || btn8_4.getText().equalsIgnoreCase(btnName)
                || btn9_4.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn6_4.setText(btnName);
        }
    }//GEN-LAST:event_btn6_4ActionPerformed

    private void btn5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5_1ActionPerformed
        if (btn5_2.getText().equalsIgnoreCase(btnName)
                || btn5_3.getText().equalsIgnoreCase(btnName)
                || btn5_4.getText().equalsIgnoreCase(btnName)
                || btn5_5.getText().equalsIgnoreCase(btnName)
                || btn5_6.getText().equalsIgnoreCase(btnName)
                || btn5_7.getText().equalsIgnoreCase(btnName)
                || btn5_8.getText().equalsIgnoreCase(btnName)
                || btn5_9.getText().equalsIgnoreCase(btnName)
                || btn1_1.getText().equalsIgnoreCase(btnName)
                || btn2_1.getText().equalsIgnoreCase(btnName)
                || btn3_1.getText().equalsIgnoreCase(btnName)
                || btn4_1.getText().equalsIgnoreCase(btnName)
                || btn6_1.getText().equalsIgnoreCase(btnName)
                || btn7_1.getText().equalsIgnoreCase(btnName)
                || btn8_1.getText().equalsIgnoreCase(btnName)
                || btn9_1.getText().equalsIgnoreCase(btnName)) {

        } else {
            btn5_1.setText(btnName);
        }
    }//GEN-LAST:event_btn5_1ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        
    }//GEN-LAST:event_btnNextActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScreenFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn1_1;
    private javax.swing.JButton btn1_2;
    private javax.swing.JButton btn1_3;
    private javax.swing.JButton btn1_4;
    private javax.swing.JButton btn1_5;
    private javax.swing.JButton btn1_6;
    private javax.swing.JButton btn1_7;
    private javax.swing.JButton btn1_8;
    private javax.swing.JButton btn1_9;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn2_1;
    private javax.swing.JButton btn2_2;
    private javax.swing.JButton btn2_3;
    private javax.swing.JButton btn2_4;
    private javax.swing.JButton btn2_5;
    private javax.swing.JButton btn2_6;
    private javax.swing.JButton btn2_7;
    private javax.swing.JButton btn2_8;
    private javax.swing.JButton btn2_9;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn3_1;
    private javax.swing.JButton btn3_2;
    private javax.swing.JButton btn3_3;
    private javax.swing.JButton btn3_4;
    private javax.swing.JButton btn3_5;
    private javax.swing.JButton btn3_6;
    private javax.swing.JButton btn3_7;
    private javax.swing.JButton btn3_8;
    private javax.swing.JButton btn3_9;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn4_1;
    private javax.swing.JButton btn4_2;
    private javax.swing.JButton btn4_3;
    private javax.swing.JButton btn4_4;
    private javax.swing.JButton btn4_5;
    private javax.swing.JButton btn4_6;
    private javax.swing.JButton btn4_7;
    private javax.swing.JButton btn4_8;
    private javax.swing.JButton btn4_9;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn5_1;
    private javax.swing.JButton btn5_2;
    private javax.swing.JButton btn5_3;
    private javax.swing.JButton btn5_4;
    private javax.swing.JButton btn5_5;
    private javax.swing.JButton btn5_6;
    private javax.swing.JButton btn5_7;
    private javax.swing.JButton btn5_8;
    private javax.swing.JButton btn5_9;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn6_1;
    private javax.swing.JButton btn6_2;
    private javax.swing.JButton btn6_3;
    private javax.swing.JButton btn6_4;
    private javax.swing.JButton btn6_5;
    private javax.swing.JButton btn6_6;
    private javax.swing.JButton btn6_7;
    private javax.swing.JButton btn6_8;
    private javax.swing.JButton btn6_9;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn7_1;
    private javax.swing.JButton btn7_2;
    private javax.swing.JButton btn7_3;
    private javax.swing.JButton btn7_4;
    private javax.swing.JButton btn7_5;
    private javax.swing.JButton btn7_6;
    private javax.swing.JButton btn7_7;
    private javax.swing.JButton btn7_8;
    private javax.swing.JButton btn7_9;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn8_1;
    private javax.swing.JButton btn8_2;
    private javax.swing.JButton btn8_3;
    private javax.swing.JButton btn8_4;
    private javax.swing.JButton btn8_5;
    private javax.swing.JButton btn8_6;
    private javax.swing.JButton btn8_7;
    private javax.swing.JButton btn8_8;
    private javax.swing.JButton btn8_9;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn9_1;
    private javax.swing.JButton btn9_2;
    private javax.swing.JButton btn9_3;
    private javax.swing.JButton btn9_4;
    private javax.swing.JButton btn9_5;
    private javax.swing.JButton btn9_6;
    private javax.swing.JButton btn9_7;
    private javax.swing.JButton btn9_8;
    private javax.swing.JButton btn9_9;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnTest;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
