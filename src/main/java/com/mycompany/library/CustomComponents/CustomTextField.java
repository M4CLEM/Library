package com.mycompany.library.CustomComponents;

import javax.swing.JTextField;
import java.awt.event.FocusListener;
import java.awt.Color;
import java.awt.event.FocusEvent;

public class CustomTextField extends JTextField implements FocusListener {
    private String placeholder = "";
    private Color text_color = null;
    private Color placeholder_color = Color.GRAY;

    public CustomTextField()
    {
        setText("");
        text_color = getForeground();
        addFocusListener(this);
    }
    
    public CustomTextField(String placeholder)
    {
        this.placeholder = placeholder;
        text_color = getForeground();
        setForeground(Color.gray);
        setText(this.placeholder);
        addFocusListener(this);
    }

    public CustomTextField(String placeholder, Color placeholder_color)
    {
        this.placeholder = placeholder;
        text_color = getForeground();
        this.placeholder_color = placeholder_color;
        setForeground(placeholder_color);
        setText(this.placeholder);
        addFocusListener(this);
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
}