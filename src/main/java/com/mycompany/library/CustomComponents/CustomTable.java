package com.mycompany.library.CustomComponents;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import javax.swing.RowSorter;

import java.awt.Component;
import java.awt.FontMetrics;

public class CustomTable extends JTable {
    
    public CustomTable()
    {   
        super(new DefaultTableModel());
        super.setDefaultRenderer(Object.class, new MultiLineCellRenderer());
    }

    public CustomTable(int rows, int columns)
    {
        super(new DefaultTableModel(new Object[rows][columns], new String[columns]));
        super.setDefaultRenderer(Object.class, new MultiLineCellRenderer());
    }

    public CustomTable(Object[][] data, String[] headers)
    {
        super(new DefaultTableModel(data, headers));
        super.setDefaultRenderer(Object.class, new MultiLineCellRenderer());
    }

    @Override
    public void setModel(TableModel t)
    {
        super.setModel(t);
    }

    public static class MultiLineCellRenderer extends JTextArea implements TableCellRenderer {

        public MultiLineCellRenderer()
        {
            this.setLineWrap(true);
            this.setWrapStyleWord(true);
            this.setOpaque(true);
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
    }    

    public void clearTable()
    {
        for(int i = 0; i < this.getRowCount(); i++) {
            for(int j = 0; j < this.getColumnCount(); j++) {
                this.setValueAt(null, i, j);
            }
        }
    }

    public void updateRowHeight()
    {
        int base_row_height = getPreferredRowHeight(0, 0);
        for(int i = 0; i < getRowCount(); i++) {
            int highest = 0;
            boolean empty_row = false;
            boolean check = false;
            for(int j = 0; j < getColumnCount(); j++) {
                if(!check && (getValueAt(i, j) == null || getValueAt(i, j).toString().isEmpty()) && getRowHeight(i) == base_row_height) {
                    empty_row = true;
                    continue;
                }
                empty_row = false;
                check = true;
                if(base_row_height < getRowHeight(i)) {
                    setRowHeight(i, base_row_height);
                }
                int overflow = textOverflow(i, j);
                if(overflow > highest) {
                    highest = overflow;
                }
            }
            if(empty_row) {
                return;
            }
            int new_height = base_row_height + (base_row_height * highest);
            setRowHeight(i, new_height);
        }
    }

    public boolean isTextOverflowed(int row, int column) 
    {
        return textOverflow(row, column) > 0;
    }

    public int textOverflow(int row, int column)
    {
        String text = "";
        if(getValueAt(row, column) != null) {
            text = getValueAt(row, column).toString();
        }
        FontMetrics fontMetrics = getFontMetrics(getFont());
        int textWidth = fontMetrics.stringWidth(text);
        int cellWidth = getCellRect(row, column, false).width;
        int lines = (textWidth / cellWidth);
        
        return lines;
    }

    public int getPreferredRowHeight(int row, int column) 
    {
        FontMetrics fm = getFontMetrics(getFont());
        int fontHeight = fm.getHeight();
        String text = "";
        if(getValueAt(row, column) != null) {
            text = getValueAt(row, column).toString();
        }
        int textLength = text.length();
        int preferredHeight = fontHeight * ((textLength / 60) + 1);
        return preferredHeight;
    }

    public ArrayList<Integer> getSelectedRowsArray()
    {
        return new ArrayList<Integer>(Arrays.stream(super.getSelectedRows()).boxed().toList());
    }

    public void sortTable(final int column, final SortOrder order)
    {   
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(getModel());
        setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sort_keys = new ArrayList<>();
        sort_keys.add(new RowSorter.SortKey(column, order));
        sorter.setSortKeys(sort_keys);
        updateRowHeight();
    }
}
