package com.mycompany.library.CustomComponents;

import javax.swing.text.DocumentFilter;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class TextFilters {

    public static class IntegerOnly extends DocumentFilter {
        private String exclude = "";

        public IntegerOnly(final String exclude)
        {
            this.exclude = exclude;
        }

        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
            if (currentText.equals(exclude)) {
                currentText = "";
            }
            if (string == null) {
                return;
            }
            try {
                Integer.parseInt(string);
                super.insertString(fb, offset, string, attr);
            } catch (NumberFormatException e) {
                // not a number, ignore this insert
            }
        }
    
        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
            if (currentText.equals(exclude)) {
                currentText = "";
            }
            if (text == null) {
                return;
            }
            try {
                Integer.parseInt(text);
                super.replace(fb, offset, length, text, attrs);
            } catch (NumberFormatException e) {
                // not a number, ignore this replace
            }
        }
    }
}
