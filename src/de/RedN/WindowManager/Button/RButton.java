package de.RedN.WindowManager.Button;

import de.RedN.Frames.FramePanel;

import javax.swing.*;
import java.awt.*;

public class RButton extends JButton {
    public RButton(String text) {

        this.setText(text);

        this.setFont(new Font("Arial", Font.BOLD, 130));

        this.setForeground(Color.red);
        this.setBackground(Color.darkGray);
        this.setUI(new ButtonUI(Color.darkGray, Color.gray));
        this.setBorderPainted(false);
        this.setFocusPainted(false);

        this.addActionListener(e -> {
            if(this.getText().isBlank() && !FramePanel.end) {
                FramePanel.clicks++;
                if(FramePanel.clicks % 2 == 0) {
                    this.setText("O");
                } else {
                    this.setText("X");
                }
                FramePanel.WinCheck();
            }
        });

    }
}