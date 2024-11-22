/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Image;
import javax.swing.ImageIcon;
import controller.*;
import javax.swing.JRadioButton;

public class VPassenger_Registration extends javax.swing.JFrame {

    public VPassenger_Registration() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
        this.setIconImage(icon);
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        btngGender = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassportNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("From");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Full Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 82, -1));

        txtFullName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 368, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Contact Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 114, -1));

        txtContactNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 368, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 50, 20));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setText(" ");
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 368, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Passport Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        txtPassportNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassportNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassportNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassportNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 368, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 82, -1));

        btnRegister.setBackground(new java.awt.Color(51, 97, 228));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Register");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 120, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 368, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Gender");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 60, -1));

        btngGender.add(rbMale);
        rbMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });
        getContentPane().add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 98, -1));

        btngGender.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 98, -1));

        jLabel2.setForeground(new java.awt.Color(51, 97, 228));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Background.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassportNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassportNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassportNumberActionPerformed

    private void txtContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumberActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed

    }//GEN-LAST:event_rbMaleActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String fullName;
        String contactNumber;
        String email;
        String gender;
        String passportNumber;
        String password;
        fullName=txtFullName.getText();
        contactNumber=txtContactNumber.getText();
        email=txtEmail.getText();
        gender = null;
        if(rbMale.isSelected()){
            gender="Male";
        }
        else if(rbFemale.isSelected()){
            gender="Female";
        }
        passportNumber=txtPassportNumber.getText();
        password = new String(txtPassword.getPassword());
        CPassenger_Registration passenger_reg = new CPassenger_Registration();
        passenger_reg.registerPassenger(fullName, contactNumber, email, gender, passportNumber, password);
    }//GEN-LAST:event_btnRegisterActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPassenger_Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup btngGender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPassportNumber;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
