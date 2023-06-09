package com.mycompany.library.CustomComponents;

import javax.swing.JTextField;
import javax.swing.text.DocumentFilter;
import javax.swing.text.AbstractDocument;
import java.awt.event.FocusListener;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public void setFilter(DocumentFilter filter)
    {
        ((AbstractDocument)this.getDocument()).setDocumentFilter(filter);
    }

    public boolean matches(final String pattern)
    {
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(getText());
        return match.matches();
    }

    public boolean contains(final String pattern)
    {
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(getText());
        return match.find();
    }
}
