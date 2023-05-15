/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library.jFrame;

import com.mycompany.library.Database;
import com.mycompany.library.CustomComponents.*;
import com.mycompany.library.utilities.LibraryUtil;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Clemence
 */
public class Returns extends javax.swing.JFrame {

    /**
     * Creates new form Tracker
     */
    public Returns() {
        initComponents();
        btnBack.addActionListener(new ComponentAction());
        txtSearch.addActionListener(new ComponentAction());
        cmbSortBy.addActionListener(new ComponentAction());
        cmbSortOrder.addActionListener(new ComponentAction());
        setTableValues("", cmbSortBy.getSelectedIndex(), cmbSortOrder.getSelectedIndex());
        setVisible(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturns = new CustomTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtSearch = new CustomTextField();
        cmbSortBy = new javax.swing.JComboBox<>();
        cmbSortOrder = new javax.swing.JComboBox<>();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 53, 86));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        tblReturns.setBackground(new java.awt.Color(11, 50, 69));
        tblReturns.setForeground(new java.awt.Color(255, 255, 255));
        tblReturns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Return ID", "User ID", "Book ID", "Reservation Start", "Reservation End"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblReturns.setShowGrid(true);
        jScrollPane1.setViewportView(tblReturns);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Returns Tracker");

        btnBack.setBackground(new java.awt.Color(11, 50, 69));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtSearch.setBackground(new java.awt.Color(11, 50, 69));
        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setPlaceholderText("Search");

        cmbSortBy.setBackground(new java.awt.Color(11, 50, 69));
        cmbSortBy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbSortBy.setForeground(new java.awt.Color(255, 255, 255));
        cmbSortBy.setUI(new ColorArrowUI(new java.awt.Color(11, 50, 69), java.awt.Color.white, java.awt.Color.white));
        cmbSortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Return ID", "User ID", "Book ID", "Reservation Start", "Reservation End" }));

        cmbSortOrder.setBackground(new java.awt.Color(11, 50, 69));
        cmbSortOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbSortOrder.setForeground(new java.awt.Color(255, 255, 255));
        cmbSortOrder.setUI(new ColorArrowUI(new java.awt.Color(11, 50, 69), java.awt.Color.white, java.awt.Color.white));
        cmbSortOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ascending", "Descending"}));

        btnDelete.setBackground(new java.awt.Color(11, 50, 69));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 435, Short.MAX_VALUE)
                        .addComponent(cmbSortOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSortOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnBack))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private class ComponentAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnBack) { // back
                dispose();
                new Administrator();
            } else if(e.getSource() == txtSearch || e.getSource() == cmbSortBy || e.getSource() == cmbSortOrder) {
                setTableValues(txtSearch.getText(), cmbSortBy.getSelectedIndex(), cmbSortOrder.getSelectedIndex());
            }
        }
    }

    private void setTableValues(final String search, final int index, final int order)
    {
        tblReturns.clearTable();
        boolean empty_search = search.isEmpty();
        ArrayList<String> order_by = new ArrayList<String>();
        ArrayList<String> sort_by = new ArrayList<String>();
        order_by.addAll(List.of("return_id", "user_id", "book_id", "reservation_end", "return_date"));
        sort_by.addAll(List.of("ASC", "DESC"));
        String query = "";
        if(empty_search) {
            query = "SELECT * FROM returns ORDER BY " + order_by.get(index) + " " + sort_by.get(order);
        } else {
            query = "SELECT * FROM returns WHERE return_id = ? OR user_id = ? " + 
            "OR book_id = ? ORDER BY " + order_by.get(index) + " " + sort_by.get(order);
        }
        try {
            Connection con = DriverManager.getConnection(Database.getUrl(), Database.getUsername(), Database.getPassword());
            PreparedStatement stat = con.prepareStatement(query);
            ResultSet result = null;
            if(!empty_search) {
                int id = Integer.parseInt(search);
                stat.setInt(1, id);
                stat.setInt(2, id);
                stat.setString(3, search);
                result = stat.executeQuery();
            } else {
                result = stat.executeQuery();
            }
            int i = 0;
            while(result.next()) {
                for(int j = 0; j < tblReturns.getColumnCount(); j++) {
                    tblReturns.setValueAt(result.getString(j+1), i, j); 
                }
                i++;
            }
            result.close();
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        tblReturns.updateRowHeight();
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Returns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> cmbSortOrder;
    private javax.swing.JComboBox<String> cmbSortBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private CustomTable tblReturns;
    private CustomTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
