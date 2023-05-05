package com.mycompany.library.CustomComponents;

import javax.swing.JTextField;
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

    public String getRealText()
    {
        if(isPlaceholderDisplayed()) {
            return "";
        }
        return getText();
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

    public void setPlaceholderText(final String new_text)
    {
        if(text_color != getForeground()) {
            text_color = getForeground();
        }
        placeholder = new_text;
        if(getText().isBlank()) {
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
        if(getText().isBlank()) {
            setText(placeholder);
            setForeground(placeholder_color);
        }
    }

    public boolean isPlaceholderDisplayed()
    {
        return getText().equals(placeholder) && getForeground() == placeholder_color;
    }

    public void clearText()
    {
        setText(placeholder);
        setForeground(placeholder_color);
    }
}
