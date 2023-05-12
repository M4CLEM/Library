package com.mycompany.library.CustomComponents;

import javax.swing.JTextField;
import javax.swing.text.DocumentFilter;
// import javax.swing.text.PlainDocument;
import javax.swing.text.AbstractDocument;
// import javax.swing.text.AttributeSet;
import java.awt.event.FocusListener;
import java.awt.Color;
import java.awt.event.FocusEvent;

public class CustomTextField extends JTextField implements FocusListener {
    private String placeholder = "";
    private Color text_color = Color.WHITE;
    private Color placeholder_color = Color.GRAY;

    public CustomTextField()
    {
        setText("");
        setForeground(text_color);
        addFocusListener(this);
    }
    
    public CustomTextField(String placeholder)
    {
        this.placeholder = placeholder;
        setText(this.placeholder);
        setForeground(placeholder_color);
        addFocusListener(this);
    }

    public CustomTextField(String placeholder, Color placeholder_color)
    {
        this.placeholder = placeholder;
        this.placeholder_color = placeholder_color;
        setText(this.placeholder);
        setForeground(placeholder_color);
        addFocusListener(this);
    }

    @Override
    public String getText()
    {
        if(isPlaceholderDisplayed()) {
            return "";
        }
        return super.getText();
    }

    public String getPlaceholderText()
    {
        return placeholder;
    }

    public Color getTextColor()
    {
        return text_color;
    }

    public Color getPlaceholderColor()
    {
        return placeholder_color;
    }

    @Override
    public void setText(final String text)
    {
        super.setText(text);
        setForeground(text_color);
    }

    public void setPlaceholderText(final String placeholder)
    {
        if(text_color != getForeground()) {
            text_color = getForeground();
        }
        this.placeholder = placeholder;
        if(super.getText().isBlank()) {
            setText(placeholder);
            setForeground(placeholder_color);
        }
    }
    
    public void setTextColor(Color c)
    {
        if(!isPlaceholderDisplayed()) {
            setForeground(c);
        }
        text_color = c;
    }

    public void setPlaceholderColor(Color c)
    {
        if(isPlaceholderDisplayed()) {
            setForeground(c);
        }
        placeholder_color = c;
    }

    @Override
    public void focusGained(FocusEvent e)
    {
        if(isPlaceholderDisplayed()) {
            setText("");
            setForeground(text_color);
        }
    }

    @Override
    public void focusLost(FocusEvent e)
    {
        if(super.getText().isBlank()) {
            setText(placeholder);
            setForeground(placeholder_color);
        }
    }

    public boolean isPlaceholderDisplayed()
    {
        return super.getText().equals(placeholder) && getForeground() == placeholder_color;
    }

    public void clearText()
    {
        setText(placeholder);
        setForeground(placeholder_color);
    }

    // public static class NumberOnlyFilter extends DocumentFilter {
    //     @Override
    //     public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
    //         System.out.println("Text: " + string);
    //         if (string == null) {
    //             return;
    //         }
    //         try {
    //             Integer.parseInt(string);
    //             super.insertString(fb, offset, string, attr);
    //         } catch (NumberFormatException e) {
    //             // not a number, ignore this insert
    //         }
    //     }

    //     @Override
    //     public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
    //         System.out.println("Text: " + text);
    //         if (text == null) {
    //             return;
    //         }
    //         try {
    //             Integer.parseInt(text);
    //             super.replace(fb, offset, length, text, attrs);
    //         } catch (NumberFormatException e) {
    //             // not a number, ignore this replace
    //         }
    //     }
    // }

    public void setFilter(DocumentFilter filter)
    {
        ((AbstractDocument)this.getDocument()).setDocumentFilter(filter);
    }
}
