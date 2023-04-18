/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library.jFrame;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import com.mycompany.library.User;

/**
 *
 * @author Clemence
 */
public class Log_In extends javax.swing.JFrame {

    /**
     * Creates new form Log_In
     */
    public Log_In() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnLogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Clemence\\Desktop\\LMSImages\\Icons\\background.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 450);

        jPanel2.setBackground(new java.awt.Color(27, 53, 86));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Clemence\\Desktop\\LMSImages\\Icons\\logo.jpg")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 0, 5, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 430, 100);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 130, 80, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 190, 110, 32);

        txtAdmin.setBackground(new java.awt.Color(11, 50, 69));
        txtAdmin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAdmin.setForeground(new java.awt.Color(255, 255, 255));
        txtAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdminActionPerformed(evt);
            }
        });
        jPanel2.add(txtAdmin);
        txtAdmin.setBounds(130, 130, 260, 38);

        txtPassword.setBackground(new java.awt.Color(11, 50, 69));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtPassword);
        txtPassword.setBounds(130, 190, 260, 38);

        btnLogin.setBackground(new java.awt.Color(11, 50, 69));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Guest");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
<<<<<<< HEAD
                User user = btnLoginActionPerformed(evt);
                if(user.isAdmin() || user.isValidUser()) {
                    dispose(); // dispose login window
                    new Reservation(user); // proceed to reservation window
                } else {
                    JLabel login_fail = new JLabel();
                    login_fail.setText("Incorrect Username or Password");
                    login_fail.setForeground(Color.yellow);
                    jPanel2.add(login_fail);
                    jPanel2.revalidate(); // revalidate the container
                    jPanel2.repaint(); // repaint the container
                }
=======
                btnLoginActionPerformed(evt);
>>>>>>> a4b89a795a381456d391ed065c7cdf5106a70402
            }
        });
        jPanel2.add(btnLogin);
        btnLogin.setBounds(130, 270, 100, 39);

        btnLogin1.setBackground(new java.awt.Color(11, 50, 69));
        btnLogin1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin1.setText("Login");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin1);
        btnLogin1.setBounds(290, 270, 100, 39);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdminActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private User btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        return new User(txtAdmin.getText(), txtPassword.getText());
    }

    /**
     * @param args the command line arguments
     */

    // public static void main() {
    //     /* Set the Nimbus look and feel */
    //     //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //     /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //      * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //      */
    //     try {
    //         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //             if ("Nimbus".equals(info.getName())) {
    //                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                 break;
    //             }
    //         }
    //     } catch (ClassNotFoundException ex) {
    //         java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new Log_In().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
