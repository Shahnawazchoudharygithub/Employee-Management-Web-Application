/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Pay_salaryform.java
 *
 * Created on 4 Jun, 2014, 1:51:02 PM
 */

package employeeproject;
import javax.swing.*;
import java.sql.*;
import java.util.Date;
import java.text.*;


/**
 *
 * @author hpworld
 */
public class Paysalaryform extends javax.swing.JFrame {
    Statement stmt;

    /** Creates new form Pay_salaryform */
    public Paysalaryform() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtsno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtsdate = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txteno = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsalary = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtcno = new javax.swing.JTextField();
        txtdoj = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdept = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txttime = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtpost = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtmonth = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txteno1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtname1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtage1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtcno1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtpost1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txttime1 = new javax.swing.JTextField();
        txtaddress1 = new javax.swing.JTextField();
        txtdoj1 = new javax.swing.JTextField();
        txtdept1 = new javax.swing.JTextField();
        txtgender1 = new javax.swing.JTextField();
        txtsalary1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txttotal1 = new javax.swing.JTextField();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        txthra = new javax.swing.JTextField();
        txtda = new javax.swing.JTextField();
        txtta = new javax.swing.JTextField();
        op1 = new javax.swing.JRadioButton();
        txtpf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        ok2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(153, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("PAY EMPLOYEE SALARY");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(232, 20, 360, 35);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Pay salary No.");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(50, 80, 130, 22);

        txtsno.setEnabled(false);
        jPanel2.add(txtsno);
        txtsno.setBounds(170, 80, 160, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("Date of Pay Salary");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(400, 80, 180, 22);
        jPanel2.add(txtsdate);
        txtsdate.setBounds(570, 80, 240, 30);

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3));
        jPanel4.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 153, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Enter Employee No.");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(0, 0, 121, 17);

        txteno.setBackground(new java.awt.Color(204, 255, 204));
        txteno.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txteno.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txteno);
        txteno.setBounds(0, 0, 6, 20);

        ok.setBackground(new java.awt.Color(0, 204, 204));
        ok.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel4.add(ok);
        ok.setBounds(0, 0, 49, 23);

        jLabel6.setBackground(new java.awt.Color(255, 153, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Name");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(0, 0, 35, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Salary");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(0, 0, 35, 14);

        txtsalary.setBackground(new java.awt.Color(204, 255, 204));
        txtsalary.setForeground(new java.awt.Color(255, 102, 0));
        txtsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalaryActionPerformed(evt);
            }
        });
        jPanel4.add(txtsalary);
        txtsalary.setBounds(0, 0, 6, 20);

        txtname.setBackground(new java.awt.Color(204, 255, 204));
        txtname.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 102, 0));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel4.add(txtname);
        txtname.setBounds(0, 0, 6, 20);

        txtcno.setBackground(new java.awt.Color(204, 255, 204));
        txtcno.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txtcno);
        txtcno.setBounds(0, 0, 6, 20);

        txtdoj.setBackground(new java.awt.Color(204, 255, 204));
        txtdoj.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txtdoj);
        txtdoj.setBounds(0, 0, 6, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("Date of joining");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(0, 0, 79, 14);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Contact No.");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, 0, 62, 14);

        jLabel7.setBackground(new java.awt.Color(255, 153, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 204));
        jLabel7.setText("Age");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 24, 17);

        txtage.setBackground(new java.awt.Color(204, 255, 204));
        txtage.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtage.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txtage);
        txtage.setBounds(0, 0, 6, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 204));
        jLabel9.setText("Gender");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(0, 0, 39, 14);

        txtgender.setBackground(new java.awt.Color(204, 255, 204));
        txtgender.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txtgender);
        txtgender.setBounds(0, 0, 6, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 204));
        jLabel11.setText("Department");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(0, 0, 63, 14);

        txtdept.setBackground(new java.awt.Color(204, 255, 204));
        txtdept.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txtdept);
        txtdept.setBounds(0, 0, 6, 20);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setText("Timing");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(0, 0, 39, 14);

        txttime.setBackground(new java.awt.Color(204, 255, 204));
        txttime.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txttime);
        txttime.setBounds(0, 0, 6, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 204));
        jLabel14.setText("Address");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(0, 0, 41, 14);

        txtaddress.setBackground(new java.awt.Color(204, 255, 204));
        txtaddress.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txtaddress);
        txtaddress.setBounds(0, 0, 6, 20);

        txtpost.setBackground(new java.awt.Color(204, 255, 204));
        txtpost.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txtpost);
        txtpost.setBounds(0, 0, 6, 20);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 204));
        jLabel18.setText("Post");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(0, 0, 22, 14);

        txtmonth.setBackground(new java.awt.Color(204, 255, 204));
        txtmonth.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txtmonth);
        txtmonth.setBounds(0, 0, 6, 20);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 204));
        jLabel20.setText("No.of month");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(0, 0, 65, 14);

        calculate.setBackground(new java.awt.Color(0, 153, 153));
        calculate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        jPanel4.add(calculate);
        calculate.setBounds(0, 0, 97, 25);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 204));
        jLabel19.setText("Total salary");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(0, 0, 63, 14);

        txttotal.setBackground(new java.awt.Color(204, 255, 204));
        txttotal.setForeground(new java.awt.Color(255, 102, 0));
        jPanel4.add(txttotal);
        txttotal.setBounds(0, 0, 6, 20);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(738, 105, 0, 0);

        jLabel15.setBackground(new java.awt.Color(102, 51, 0));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Employee no.");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(50, 160, 120, 22);
        jPanel2.add(txteno1);
        txteno1.setBounds(170, 150, 170, 30);

        jLabel21.setBackground(new java.awt.Color(102, 51, 0));
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setText("Name");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(60, 230, 100, 22);
        jPanel2.add(txtname1);
        txtname1.setBounds(170, 230, 170, 30);

        jLabel22.setBackground(new java.awt.Color(102, 51, 0));
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText("Age");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(60, 270, 90, 22);
        jPanel2.add(txtage1);
        txtage1.setBounds(170, 270, 170, 30);

        jLabel23.setBackground(new java.awt.Color(102, 51, 0));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 102));
        jLabel23.setText("Contactno.");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(60, 320, 100, 22);
        jPanel2.add(txtcno1);
        txtcno1.setBounds(170, 310, 170, 30);

        jLabel24.setBackground(new java.awt.Color(102, 51, 0));
        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 102));
        jLabel24.setText("Post");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(60, 350, 90, 22);

        txtpost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpost1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtpost1);
        txtpost1.setBounds(170, 350, 170, 30);

        jLabel25.setBackground(new java.awt.Color(102, 51, 0));
        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 102));
        jLabel25.setText("Timing");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(60, 390, 90, 22);
        jPanel2.add(txttime1);
        txttime1.setBounds(170, 390, 170, 30);
        jPanel2.add(txtaddress1);
        txtaddress1.setBounds(530, 390, 270, 30);
        jPanel2.add(txtdoj1);
        txtdoj1.setBounds(530, 350, 180, 30);

        txtdept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdept1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtdept1);
        txtdept1.setBounds(530, 310, 180, 30);
        jPanel2.add(txtgender1);
        txtgender1.setBounds(530, 270, 180, 30);
        jPanel2.add(txtsalary1);
        txtsalary1.setBounds(530, 230, 180, 30);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel26.setBackground(new java.awt.Color(102, 51, 0));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 102));
        jLabel26.setText("Total Salary");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(350, 90, 110, 22);
        jPanel1.add(txttotal1);
        txttotal1.setBounds(490, 90, 160, 30);

        c1.setBackground(new java.awt.Color(204, 204, 204));
        c1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 0, 102));
        c1.setText("HRA");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1);
        c1.setBounds(20, 20, 70, 31);

        c2.setBackground(new java.awt.Color(204, 204, 204));
        c2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c2.setForeground(new java.awt.Color(0, 0, 102));
        c2.setText("DA");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        jPanel1.add(c2);
        c2.setBounds(20, 60, 60, 31);

        c3.setBackground(new java.awt.Color(204, 204, 204));
        c3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        c3.setForeground(new java.awt.Color(0, 0, 102));
        c3.setText("TA");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        jPanel1.add(c3);
        c3.setBounds(20, 100, 60, 31);
        jPanel1.add(txthra);
        txthra.setBounds(90, 20, 210, 30);
        jPanel1.add(txtda);
        txtda.setBounds(90, 60, 210, 30);
        jPanel1.add(txtta);
        txtta.setBounds(90, 100, 210, 30);

        op1.setBackground(new java.awt.Color(204, 204, 204));
        op1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        op1.setForeground(new java.awt.Color(0, 0, 102));
        op1.setText("PF");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });
        jPanel1.add(op1);
        op1.setBounds(340, 10, 60, 31);
        jPanel1.add(txtpf);
        txtpf.setBounds(490, 10, 160, 30);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("CALCULATION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(360, 50, 140, 30);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update.setText("Pay");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(660, 10, 120, 124);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(40, 440, 790, 150);

        ok2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ok2.setText("OK");
        ok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok2ActionPerformed(evt);
            }
        });
        jPanel2.add(ok2);
        ok2.setBounds(360, 140, 450, 40);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jLabel27.setBackground(new java.awt.Color(102, 51, 0));
        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 102));
        jLabel27.setText("Address");
        jPanel5.add(jLabel27);
        jLabel27.setBounds(330, 180, 120, 22);

        jLabel28.setBackground(new java.awt.Color(102, 51, 0));
        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 102));
        jLabel28.setText("Date of joining");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(330, 140, 160, 22);

        jLabel29.setBackground(new java.awt.Color(102, 51, 0));
        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 102));
        jLabel29.setText("Department");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(330, 110, 140, 22);

        jLabel30.setBackground(new java.awt.Color(102, 51, 0));
        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 102));
        jLabel30.setText("Gender");
        jPanel5.add(jLabel30);
        jLabel30.setBounds(330, 60, 110, 22);

        jLabel31.setBackground(new java.awt.Color(102, 51, 0));
        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 102));
        jLabel31.setText("Salary");
        jPanel5.add(jLabel31);
        jLabel31.setBounds(330, 20, 100, 22);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(40, 210, 790, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int eno,age,sno,hra,da,ta,pf;
        long salary;
        String name,gender,dept,post,address,cno,time,doj,sdate,total;
        
        total=txttotal1.getText();
        sno=Integer.parseInt(txtsno.getText());
        sdate=txtdoj1.getText();
        eno=Integer.parseInt(txteno1.getText());
        age=Integer.parseInt(txtage1.getText());
        salary=Long.parseLong(txtsalary1.getText());
        name=txtname1.getText();
        address=txtaddress1.getText();
        gender=txtgender1.getText();
        dept=txtdept1.getText();
        post=txtpost1.getText();
        cno=txtcno1.getText();
        time=txttime1.getText();
        doj=txtdoj1.getText();
        hra=Integer.parseInt(txthra.getText());
        da=Integer.parseInt(txtda.getText());
        ta=Integer.parseInt(txtta.getText());
        pf=Integer.parseInt(txtpf.getText());
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:employee");
            Statement stmt=con.createStatement();
            String query;
            query="insert into salarytable values("+sno+",'"+sdate+"',"+eno+",'"+name+"',"+salary+","+age+",'"+gender+"','"+cno+"','"+dept+"','"+post+"','"+doj+"','"+time+"','"+address+"',"+hra+","+da+","+ta+","+pf+",'"+total+"')";
            stmt.executeUpdate(query);
           
            txtdoj1.setText("");
            txteno1.setText("");
            txtname1.setText("");
            txtsalary1.setText("");
            txtaddress1.setText("");
            txtage1.setText("");
            txtgender1.setText("");
            txtcno1.setText("");
            txtdept1.setText("");
            txttime1.setText("");
            txtdoj1.setText("");
            txtpost1.setText("");
            txthra.setText("");
            txtda.setText("");
            txtta.setText("");
            txtpf.setText("");
            txttotal1.setText("");



        } catch(Exception e) {
        }
         String mode="p";

        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:employee");
             stmt=con.createStatement();
            String query;
            query="update etable set paymode='"+mode+"'where eno="+eno+"";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "successfully saved");
        }
        catch(Exception e2)
        {}
}//GEN-LAST:event_updateActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.hide();
}//GEN-LAST:event_exitActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
       
}//GEN-LAST:event_okActionPerformed

    private void txtsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalaryActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtsalaryActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtnameActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
     
}//GEN-LAST:event_calculateActionPerformed

    private void txtpost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpost1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtpost1ActionPerformed

    private void txtdept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdept1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtdept1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        txtda.setText("");
       txtda.requestFocus();
}//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
         txtta.setText("");
       txtta.requestFocus();
}//GEN-LAST:event_c3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int bs=0,hra=0,ta=0,da=0,pf=0;
        long ts;
        bs=Integer.parseInt(txtsalary1.getText());
        if(c1.isSelected())
        {
        hra=Integer.parseInt(txthra.getText());
        hra=bs*hra/100;
        }
        if(c2.isSelected())
        {
        da=Integer.parseInt(txtda.getText());
        da=bs*da/100;
        }
        if(c3.isSelected())
        {
        ta=Integer.parseInt(txtta.getText());
        ta=bs*ta/100;
        }
        ts=hra+da+ta+bs;
        txttotal1.setText(String.valueOf(ts));
        if(op1.isSelected())
        {
            pf=Integer.parseInt(txtpf.getText());
            pf=bs*pf/100;
        }
            ts=(bs+hra+da+ta)-pf;
            txttotal1.setText(String.valueOf(ts));
        
            }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
  
    }//GEN-LAST:event_formWindowOpened

    private void ok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok2ActionPerformed
        int eno;
        eno=Integer.parseInt(txteno1.getText());
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:employee");
            Statement stmt=con.createStatement();
            String query;
            query="select * from etable where eno="+eno+"";
            ResultSet res=stmt.executeQuery(query);
            DateFormat df= new SimpleDateFormat("dd-MMM-yyyy");


            if(res.next()) {
                txtname1.setText((res.getString("name")));
                txtsalary1.setText((res.getString("salary")));
               txtdept1.setText((res.getString("dept")));
                txtpost1.setText((res.getString("post")));

                txttime1.setText((res.getString("timing")));
                txtage1.setText((res.getString("age")));
                txtcno1.setText((res.getString("contactno")));
                txtaddress1.setText((res.getString("address")));
                txtgender1.setText((res.getString("gender")));
                txtdoj1.setText(df.format(res.getDate("doj")));
            } else
                JOptionPane.showMessageDialog(null, "Not found");

        } catch(Exception e) {
        }
        

}//GEN-LAST:event_ok2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        int n=0;
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection c=DriverManager.getConnection("jdbc:odbc:employee");
            Statement state=c.createStatement();
            ResultSet res=state.executeQuery("select * from salarytable");
            while(res.next())
            {
                n=res.getInt("sno");

            }
            txtsno.setText(String.valueOf(n+1));
            DateFormat df=new SimpleDateFormat("dd-MMM-yyyy");
            Date  d=new Date();
            txtsdate.setText(df.format(d));

        }catch(Exception e)
        {}
        txtsdate.enable();
        txthra.setText(String.valueOf(0));
         txtda.setText(String.valueOf(0));
          txtta.setText(String.valueOf(0));
           txtpf.setText(String.valueOf(0));
    }//GEN-LAST:event_formWindowActivated

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
       txthra.setText("");
       txthra.requestFocus();
    }//GEN-LAST:event_c1ActionPerformed

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        txtpf.setText("");
       txtpf.requestFocus();
    }//GEN-LAST:event_op1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paysalaryform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JButton calculate;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton ok;
    private javax.swing.JButton ok2;
    private javax.swing.JRadioButton op1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtaddress1;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtage1;
    private javax.swing.JTextField txtcno;
    private javax.swing.JTextField txtcno1;
    private javax.swing.JTextField txtda;
    private javax.swing.JTextField txtdept;
    private javax.swing.JTextField txtdept1;
    private javax.swing.JTextField txtdoj;
    private javax.swing.JTextField txtdoj1;
    private javax.swing.JTextField txteno;
    private javax.swing.JTextField txteno1;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtgender1;
    private javax.swing.JTextField txthra;
    private javax.swing.JTextField txtmonth;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtpf;
    private javax.swing.JTextField txtpost;
    private javax.swing.JTextField txtpost1;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTextField txtsalary1;
    private javax.swing.JTextField txtsdate;
    private javax.swing.JTextField txtsno;
    private javax.swing.JTextField txtta;
    private javax.swing.JTextField txttime;
    private javax.swing.JTextField txttime1;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttotal1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
