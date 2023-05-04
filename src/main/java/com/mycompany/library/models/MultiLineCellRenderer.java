package com.mycompany.library.models;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

import java.awt.Component;
import java.awt.FontMetrics;

public class MultiLineCellRenderer extends JTextArea implements TableCellRenderer {

    public MultiLineCellRenderer()
    {
        this.setLineWrap(true);
        this.setWrapStyleWord(true);
        this.setOpaque(true);
        // this.setForeground(Color.white);
        // this.setBackground(new java.awt.Color(11, 50, 69));
        // this.setFont(new java.awt.Font("Segoe UI", 0, 12));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
        boolean hasFocus, int row, int column)
    {
        setFont(table.getFont());

        if(isSelected) {
            setBackground(table.getSelectionBackground());
            setForeground(table.getSelectionForeground());
        } else {
            setBackground(table.getBackground());
            setForeground(table.getForeground());
        }

        setText((value == null) ? "" : value.toString());

        return this;
    }
    
    public static void resizeToFitText(JTable table)
    {
        int overflow = 0;
        int base_row_height = getPreferredHeight(table, 0, 0);
        for(int i = 0; i < table.getRowCount(); i++) {
            int highest = 0;
            for(int j = 0; j < table.getColumnCount(); j++) {
                if(base_row_height < table.getRowHeight(i)) {
                    table.setRowHeight(i, base_row_height);
                }
                overflow = textOverflow(table, i, j);
                if(overflow > highest) {
                    highest = overflow;
                }
            }
            int new_height = base_row_height + (base_row_height * highest);
            table.setRowHeight(i, new_height);
        }
    }

    public static boolean isTextOverflowed(JTable table, int row, int column) 
    {
        return textOverflow(table, row, column) > 0;
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
        int lines = (textWidth / cellWidth);
        
        return lines;
    }

    public static int getPreferredHeight(JTable table, int row, int column) 
    {
        FontMetrics fm = table.getFontMetrics(table.getFont());
        int fontHeight = fm.getHeight();
        String text = "";
        if(table.getValueAt(row, column) != null) {
            text = table.getValueAt(row, column).toString();
        }
        int textLength = text.length();
        int preferredHeight = fontHeight * ((textLength / 60) + 1);
        return preferredHeight;
    }
    
}
