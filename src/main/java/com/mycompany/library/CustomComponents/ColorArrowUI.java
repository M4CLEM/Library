package com.mycompany.library.CustomComponents;

import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.Color;
import javax.swing.JComponent;

public class ColorArrowUI extends BasicComboBoxUI {
    private Color background = Color.gray;
    private Color arrow_color = Color.white;
    private Color margin_color = Color.white;

    public ColorArrowUI(final Color bg, final Color arrow_color, final Color margin_color) 
    {
        background = bg;
        this.arrow_color = arrow_color;
        this.margin_color = margin_color;
    }

    public static ComboBoxUI createUI(JComponent c) 
    {
        return new ColorArrowUI(null, null, null);
    }

    @Override 
    protected JButton createArrowButton() {
        return new BasicArrowButton(BasicArrowButton.SOUTH, background, null, arrow_color, margin_color);
    }
}