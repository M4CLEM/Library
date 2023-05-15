/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library.jFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.SortOrder;

import com.mycompany.library.Database;
import com.mycompany.library.CustomComponents.*;
import com.mycompany.library.utilities.LibraryUtil;
import com.mysql.cj.jdbc.Driver;

/**
 *
 * @author Clemence
 */
public class Records extends javax.swing.JFrame {

    /**
     * Creates new form Records
     */
    public Records() {
        initComponents();
        btnBack.addActionListener(new ComponentAction());
        btnReturn.addActionListener(new ComponentAction());
        txtSearch.addActionListener(new ComponentAction());
        cmbSortBy.addActionListener(new ComponentAction());
        cmbSortOrder.addActionListener(new ComponentAction());
        btnEdit.setVisible(false);
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
        btnBack = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecords = new CustomTable();
        txtSearch = new CustomTextField();
        cmbSortBy = new javax.swing.JComboBox<>();
        cmbSortOrder = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 53, 86));

        btnBack.setBackground(new java.awt.Color(11, 50, 69));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(11, 50, 69));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");

        btnReturn.setBackground(new java.awt.Color(11, 50, 69));
        btnReturn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Register");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Reservation Records");

        tblRecords.setBackground(new java.awt.Color(11, 50, 69));
        tblRecords.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblRecords.setForeground(new java.awt.Color(255, 255, 255));
        tblRecords.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Reservation ID", "User ID", "Book ID", "Reservation Start", "Reservation End"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblRecords.setGridColor(new java.awt.Color(255, 255, 255));
        tblRecords.setShowGrid(true);
        jScrollPane1.setViewportView(tblRecords);

        txtSearch.setBackground(new java.awt.Color(11, 50, 69));
        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setPlaceholderText("Search");

        cmbSortBy.setBackground(new java.awt.Color(11, 50, 69));
        cmbSortBy.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbSortBy.setForeground(new java.awt.Color(255, 255, 255));
        cmbSortBy.setUI(new ColorArrowUI(new java.awt.Color(11, 50, 69), java.awt.Color.white, java.awt.Color.white));
        cmbSortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reservation ID", "User ID", "Book ID", "Reservation Start", "Reservation End" }));

        cmbSortOrder.setBackground(new java.awt.Color(11, 50, 69));
        cmbSortOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbSortOrder.setForeground(new java.awt.Color(255, 255, 255));
        cmbSortOrder.setUI(new ColorArrowUI(new java.awt.Color(11, 50, 69), java.awt.Color.white, java.awt.Color.white));
        cmbSortOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(60, 60, 60)
                        .addComponent(btnReturn)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cmbSortOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmbSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSortOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnReturn)
                    .addComponent(btnEdit))
                .addGap(16, 16, 16))
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
            if(e.getSource() == btnBack) {
                dispose();
                new Administrator();
            } else if(e.getSource() == txtSearch || e.getSource() == cmbSortOrder || e.getSource() == cmbSortBy) {
                setTableValues(txtSearch.getText(), cmbSortBy.getSelectedIndex(), cmbSortOrder.getSelectedIndex());
            } else if(e.getSource() == btnReturn) {
                addToReturns();
            }
        }
    }

    private void setTableValues(String search, final int index, final int order)
    {
        tblRecords.clearTable();
        boolean empty_search = search.isEmpty();
        ArrayList<String> order_by = new ArrayList<String>();
        ArrayList<String> sort_by = new ArrayList<String>();
        order_by.addAll(List.of("reservation_id", "user_id", "book_id", "reservation_start", "reservation_end"));
        sort_by.addAll(List.of("ASC", "DESC"));
        String query = "";
        if(empty_search) {
            query = "SELECT * FROM reservations ORDER BY " + order_by.get(index) + " " + sort_by.get(order);
        } else {
            query = "SELECT * FROM reservations WHERE reservation_id = ? OR user_id = ? " + 
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
                for(int j = 0; j < tblRecords.getColumnCount(); j++) {
                    tblRecords.setValueAt(result.getString(j+1), i, j); 
                }
                i++;
            }
            result.close();
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        tblRecords.updateRowHeight();
    }

    private void addToReturns()
    {
        ArrayList<Integer> selected = tblRecords.getSelectedRowsArray();
        if(!selected.isEmpty()) {
            try {
                Connection con = DriverManager.getConnection(Database.getUrl(), Database.getUsername(), Database.getPassword());
                PreparedStatement stat = con.prepareStatement("INSERT INTO returns (user_id, book_id, reservation_end, return_date) " +
                "VALUES (?, ?, ?, ?)");
                for(int i = 0; i < selected.size(); i++) {
                    int row = selected.get(i);
                    stat.setInt(1, Integer.parseInt(tblRecords.getValueAt(row, 1).toString()));
                    stat.setString(2, tblRecords.getValueAt(row, 2).toString());
                    stat.setTimestamp(3, java.sql.Timestamp.valueOf(tblRecords.getValueAt(row, 4).toString()));
                    stat.setTimestamp(4, java.sql.Timestamp.valueOf(LibraryUtil.getDatetimeNow()));
                    int user_id = Integer.parseInt(tblRecords.getValueAt(row, 1).toString());
                    String book_id = tblRecords.getValueAt(row, 2).toString();
                    String reservation_end = tblRecords.getValueAt(row, 4).toString();
                    String return_date = LibraryUtil.getDatetimeNow();
                    stat.executeUpdate();
                }
                stat = con.prepareStatement("DELETE FROM reservations WHERE reservation_id = ?");
                for(int i = 0; i < selected.size(); i++) {
                    int row = selected.get(i);
                    stat.setInt(1, Integer.parseInt(tblRecords.getValueAt(row, 0).toString()));
                    stat.executeUpdate();
                }
                stat.close();
                con.close();
                setTableValues("", cmbSortBy.getSelectedIndex(), cmbSortOrder.getSelectedIndex());
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
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
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cmbSortOrder;
    private javax.swing.JComboBox<String> cmbSortBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private CustomTable tblRecords;
    private CustomTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
