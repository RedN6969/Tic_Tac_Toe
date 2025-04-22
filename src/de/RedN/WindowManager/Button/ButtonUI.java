package de.RedN.WindowManager.Button;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonUI extends BasicButtonUI {

    private Color pressedColor;
    private Color defaultColor;

    public ButtonUI(Color defaultColor, Color pressedColor) {
        this.defaultColor = defaultColor;
        this.pressedColor = pressedColor;
    }

    @Override
    public void installUI(JComponent c) {
        super.installUI(c);
        JButton button = (JButton) c;
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button.setBackground(pressedColor);
                button.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button.setBackground(defaultColor);
                button.repaint();
            }
        });
    }
}