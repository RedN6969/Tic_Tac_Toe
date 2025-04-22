package de.RedN.Frames;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {

        this.setTitle("Tic Tac Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new FramePanel());
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}