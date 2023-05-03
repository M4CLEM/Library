package com.mycompany.library.models;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableCellRenderer;

import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;

public class MultiLineCell extends JTextArea implements TableCellRenderer {
    private static int base_row_height = 0;

    public MultiLineCell(int row_height)
    {
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setOpaque(true);
        this.setForeground(Color.white);
        this.setBackground(new java.awt.Color(11, 50, 69));
        this.setFont(new java.awt.Font("Segoe UI", 0, 12));
        this.base_row_height = row_height;
        System.out.println("Constructor invoked");
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
        boolean hasFocus, int row, int column)
    {
        if(value == null) {
            setText("");
            return this;
        }
        setText(value.toString());
        return this;
    }
    
    public static void resizeToFitText(JTable table)
    {
        int overflow = 0;
        for(int i = 0; i < table.getRowCount(); i++) {
            int highest = 0;
            for(int j = 0; j < table.getColumnCount(); j++) {
                overflow = textOverflow(table, i, j);
                if(overflow > highest) {
                    highest = overflow;
                }
            }
            table.setRowHeight(i, base_row_height + (base_row_height * highest));
        }
    }

    public static boolean isTextOverflowed(JTable table, int row, int column) 
    {
        String text = "";
        if(table.getValueAt(row, column) != null) {
            text = table.getValueAt(row, column).toString();
        }
        FontMetrics fontMetrics = table.getFontMetrics(table.getFont());
        int textWidth = fontMetrics.stringWidth(text);
        int cellWidth = table.getCellRect(row, column, false).width;
        return textWidth > cellWidth;
    }

    public static int textOverflow(JTable table, int row, int column)
    {
        String text = "";
        if(table.getValueAt(row, column) != null) {
            text = table.getValueAt(row, column).toString();
        }
        FontMetrics fontMetrics = table.getFontMetrics(table.getFont());
        int textWidth = fontMetrics.stringWidth(text);
        int cellWidth = table.getCellRect(row, column, false).width;
        int lines = (textWidth / cellWidth)-1;
        if(textWidth < cellWidth && textWidth != 0) {
            lines = (cellWidth / textWidth)-1;
            lines *= -1;
        }
        
        return lines;
    }
}
