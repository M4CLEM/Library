/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.library.jFrame;
import com.mycompany.library.Database;
import com.mycompany.library.CustomComponents.CustomTable;
import com.mycompany.library.CustomComponents.CustomTextField;
import com.mycompany.library.utilities.LibraryUtil;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author Clemence
 */
public class add_Books extends javax.swing.JFrame {
    

    /**
     * Creates new form add_Books
     */
    public add_Books() {
        initComponents();
        jButton1.addActionListener(new ComponentAction());
        jButton2.addActionListener(new ComponentAction());
        txtSearch.addActionListener(new ComponentAction());
        btnDelete.addActionListener(new ComponentAction());
        btnEdit.addActionListener(new ComponentAction());
        btnBack.addActionListener(new ComponentAction());
        setBooksInTable("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBookID = new CustomTextField();
        txtBookTitle = new CustomTextField();
        txtAuthor = new CustomTextField();
        txtPublisher = new CustomTextField();
        txtPublishDate = new CustomTextField();
        txtSubjectHeading = new CustomTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtAvailability = new CustomTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooks = new CustomTable();
        txtSearch = new CustomTextField();
        jLabel9 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 53, 86));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Clemence\\Desktop\\Library Management System\\resources\\images\\logo.jpg")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Registration");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Title:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Author:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Publisher:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Publish Date:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Subject Heading:");

        txtBookID.setBackground(new java.awt.Color(11, 50, 69));
        txtBookID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBookID.setForeground(new java.awt.Color(255, 255, 255));
        txtBookID.setPlaceholderText("13-digits");

        txtBookTitle.setBackground(new java.awt.Color(11, 50, 69));
        txtBookTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBookTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtBookTitle.setPlaceholderText("Book Title");

        txtAuthor.setBackground(new java.awt.Color(11, 50, 69));
        txtAuthor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAuthor.setForeground(new java.awt.Color(255, 255, 255));
        txtAuthor.setPlaceholderText("Author");

        txtPublisher.setBackground(new java.awt.Color(11, 50, 69));
        txtPublisher.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPublisher.setForeground(new java.awt.Color(255, 255, 255));
        txtPublisher.setPlaceholderText("Publisher");

        txtPublishDate.setBackground(new java.awt.Color(11, 50, 69));
        txtPublishDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPublishDate.setForeground(new java.awt.Color(255, 255, 255));
        txtPublishDate.setPlaceholderText("YYYY-MM-DD");

        txtSubjectHeading.setBackground(new java.awt.Color(11, 50, 69));
        txtSubjectHeading.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSubjectHeading.setForeground(new java.awt.Color(255, 255, 255));
        txtSubjectHeading.setPlaceholderText("Heading 1, Heading 2, Heading 3,...");

        jButton1.setBackground(new java.awt.Color(11, 50, 69));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reset");

        jButton2.setBackground(new java.awt.Color(11, 50, 69));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");

        btnBack.setBackground(new java.awt.Color(11, 50, 69));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new ComponentAction());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Availability:");

        txtAvailability.setBackground(new java.awt.Color(11, 50, 69));
        txtAvailability.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtAvailability.setForeground(new java.awt.Color(255, 255, 255));
        txtAvailability.setPlaceholderText("Availability");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(btnBack)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSubjectHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(txtPublishDate, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(txtPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(txtAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(txtBookTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(txtBookID, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(txtAvailability)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jButton2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPublishDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSubjectHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(27, 53, 86));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jScrollPane1.setBackground(new java.awt.Color(11, 50, 69));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblBooks.setBackground(new java.awt.Color(11, 50, 69));
        tblBooks.setForeground(new java.awt.Color(255, 255, 255));
        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Author", "Publisher", "Publish Date", "Subject Heading", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, int.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBooks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblBooks.setShowGrid(true);
        jScrollPane1.setViewportView(tblBooks);

        txtSearch.setBackground(new java.awt.Color(11, 50, 69));
        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setPlaceholderText("Search...");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search:");

        btnEdit.setBackground(new java.awt.Color(11, 50, 69));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");

        btnDelete.setBackground(new java.awt.Color(11, 50, 69));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addGap(10, 10, 10)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private class ComponentAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == jButton1) { // Reset
                clearForm();
            } else if(e.getSource() == jButton2) { // Register
                registerBook();
            } else if(e.getSource() == txtSearch) {
                setBooksInTable(txtSearch.getText());
            } else if(e.getSource() == btnDelete) {
                deleteBook();
            } else if(e.getSource() == btnEdit) {
                editBook();
            } else if(e.getSource() == btnBack) {
                dispose();
                new Administrator();
            }
        }
    }

    private void clearForm()
    {
        txtBookID.clearText();
        txtBookTitle.setText("");
        txtAuthor.setText("");
        txtPublisher.setText("");
        txtPublishDate.clearText();
        txtSubjectHeading.clearText();
    }

    private void registerBook()
    {
        if(txtBookID.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Book ID cannot be blank", "Register Failed", JOptionPane.ERROR_MESSAGE);
        } else if(!LibraryUtil.isValidBookIdFormat(txtBookID.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid Book ID Format", "Register Failed", JOptionPane.ERROR_MESSAGE);
        } else if(txtBookTitle.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Book Title cannot be blank", "Register Failed", JOptionPane.ERROR_MESSAGE);
        } else if(!LibraryUtil.isValidPublishDateFormat(txtPublishDate.getText())) {
            JOptionPane.showMessageDialog(null, "Invalid Publish Date Format", "Register Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            int stock = 0;
            try {
                stock = Integer.parseInt(txtAvailability.getText());
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Availability needs to be an integer", "Register Failed", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                Connection con = DriverManager.getConnection(Database.getUrl(), Database.getUsername(), Database.getPassword());
                PreparedStatement stat = null;
                if(!LibraryUtil.bookIdExists(txtBookID.getText())) {
                    stat = con.prepareStatement("INSERT INTO books (book_id, title, author, publisher, publish_date, subject_heading, availability)" + 
                        "VALUES (?, ?, ?, ?, ?, ?, ?)");
                    stat.setString(1, txtBookID.getText());
                    stat.setString(2, txtBookTitle.getText());
                    stat.setString(3, txtAuthor.getText());
                    stat.setString(4, txtPublisher.getText());
                    stat.setString(5, txtPublishDate.getText());
                    stat.setString(6, txtSubjectHeading.getText());
                    stat.setInt(7, stock);
                } else {
                    stat = con.prepareStatement("UPDATE books SET title = ?, author = ?, publisher = ?, publish_date = ?, " +
                    "subject_heading = ?, availability = ? WHERE book_id = ?");
                    stat.setString(1, txtBookTitle.getText());
                    stat.setString(2, txtAuthor.getText());
                    stat.setString(3, txtPublisher.getText());
                    stat.setString(4, txtPublishDate.getText());
                    stat.setString(5, txtSubjectHeading.getText());
                    stat.setInt(6, stock);
                    stat.setString(7, txtBookID.getText());
                }
                stat.executeUpdate();
                stat.close();
                con.close();
                System.out.println("Registration Successful!");
                setBooksInTable(txtSearch.getText());
            } catch(SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Something Went Wrong", "Register Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void setBooksInTable(final String search_text)
    {
        tblBooks.clearTable();
        String query = "";
        String search = "%" + search_text + "%";
        if(search_text.isEmpty()) {
            query = "SELECT * FROM books";
        } else {
            query = "SELECT * FROM books WHERE LOWER(title) LIKE ? OR LOWER(author) LIKE ? OR LOWER(publisher) LIKE ? OR LOWER(subject_heading) LIKE ?";
        }
        try {
            Connection con = DriverManager.getConnection(Database.getUrl(), Database.getUsername(), Database.getPassword());
            PreparedStatement stat = con.prepareStatement(query);
            if(!search_text.isEmpty()) {
                stat.setString(1, search);
                stat.setString(2, search);
                stat.setString(3, search);
                stat.setString(4, search);
            }
            ResultSet result = stat.executeQuery();
            int i = 0;
            while(result.next()) {
                for(int j = 0; j < tblBooks.getColumnCount(); j++) {
                    tblBooks.setValueAt(result.getString(j+1), i, j); 
                }
                i++;
            }
            result.close();
            stat.close();
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
        tblBooks.updateRowHeight();
    }

    private void deleteBook()
    {
        ArrayList<Integer> selected = tblBooks.getSelectedRowsArray();
        try {
            Connection con = DriverManager.getConnection(Database.getUrl(), Database.getUsername(), Database.getPassword());
            PreparedStatement stat = con.prepareStatement("DELETE FROM books WHERE book_id = ?");
            for(int i = 0; i < selected.size(); i++) {
                String id = "";
                Object val = tblBooks.getValueAt(selected.get(i), 0);
                if(val != null) {
                    id = val.toString();
                    stat.setString(1, id);
                    stat.executeUpdate();
                }
            }
            stat.close();
            con.close();
            setBooksInTable(txtSearch.getText());
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    private void editBook()
    {
        int row = tblBooks.getSelectedRow();
        for(int i = 0; i < tblBooks.getColumnCount(); i++) {
            String str = "";
            if(tblBooks.getValueAt(row, i) != null) {
                str = tblBooks.getValueAt(row, i).toString();
            }
            if(i == 0) {
                txtBookID.setText(str);
            } else if(i == 1) {
                txtBookTitle.setText(str);
            } else if(i == 2) {
                txtAuthor.setText(str);
            } else if(i == 3) {
                txtPublisher.setText(str);
            } else if(i == 4) {
                txtPublishDate.setText(str);
            } else if(i == 5) {
                txtSubjectHeading.setText(str);
            } else if(i == 6) {
                txtAvailability.setText(str);
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
            java.util.logging.Logger.getLogger(add_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private CustomTable tblBooks;
    private CustomTextField txtAuthor;
    private CustomTextField txtAvailability;
    private CustomTextField txtBookID;
    private CustomTextField txtBookTitle;
    private CustomTextField txtPublishDate;
    private CustomTextField txtPublisher;
    private CustomTextField txtSearch;
    private CustomTextField txtSubjectHeading;
    // End of variables declaration//GEN-END:variables
}
