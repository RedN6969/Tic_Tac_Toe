package de.RedN.Frames;

import de.RedN.WindowManager.Button.ButtonUI;

import javax.swing.*;
import java.awt.*;

public class FramePanel extends JPanel {

    JLabel Text;

    private final Font Button_Font = new Font("Arial", Font.BOLD, 130);

    int clicks = 0;
    boolean end = false;

    JButton Button_A1 = new JButton("");
    JButton Button_A2 = new JButton("");
    JButton Button_B1 = new JButton("");
    JButton Button_A3 = new JButton("");
    JButton Button_B2 = new JButton("");
    JButton Button_B3 = new JButton("");
    JButton Button_C1 = new JButton("");
    JButton Button_C2 = new JButton("");
    JButton Button_C3 = new JButton("");

    public FramePanel() {

        this.setPreferredSize(new Dimension(
                600,
                700
        ));

        Text = new JLabel("Tic Tac Toe");
        Text.setFont(new Font("Arial", Font.PLAIN, 100));
        Text.setForeground(Color.red);
        Text.setBounds(
                (this.getPreferredSize().width - Text.getPreferredSize().width) / 2,
                0,
                Text.getPreferredSize().width,
                Text.getPreferredSize().height
        );

        ButtonBounds();

        ButtonFonts();

        ButtonColors();

        ButtonListeners();

        this.setBackground(Color.black);

        this.setLayout(null);
        this.add(Button_A1);
        this.add(Button_A2);
        this.add(Button_A3);
        this.add(Button_B1);
        this.add(Button_B2);
        this.add(Button_B3);
        this.add(Button_C1);
        this.add(Button_C2);
        this.add(Button_C3);
        this.add(Text);

    }

    private void setText(String text) {

        Text.setText(text);
        Text.setBounds(
                (this.getPreferredSize().width - Text.getPreferredSize().width) / 2,
                0,
                Text.getPreferredSize().width,
                Text.getPreferredSize().height
        );

    }

    private void WinCheck() {

        if(
                Button_A1.getText() == "X"
                &&Button_A2.getText() == "X"
                &&Button_A3.getText() == "X"
        ) {
            end = true;
            setText("X wins");
        }

        else if(
                Button_A1.getText() == "O"
                        &&Button_A2.getText() == "O"
                        &&Button_A3.getText() == "O"
        ) {
            end = true;
            setText("O wins");
        }

        else if(
                Button_B1.getText() == "X"
                        &&Button_B2.getText() == "X"
                        &&Button_B3.getText() == "X"
        ) {
            end = true;
            setText("X wins");
        }

        else if(
                Button_B1.getText() == "O"
                        &&Button_B2.getText() == "O"
                        &&Button_B3.getText() == "O"
        ) {
            end = true;
            setText("O wins");
        }

        else if(
                Button_C1.getText() == "X"
                        &&Button_C2.getText() == "X"
                        &&Button_C3.getText() == "X"
        ) {
            end = true;
            setText("X wins");
        }

        else if(
                Button_C1.getText() == "O"
                        &&Button_C2.getText() == "O"
                        &&Button_C3.getText() == "O"
        ) {
            end = true;
            setText("O wins");
        }

        else if(
                Button_A1.getText() == "X"
                        &&Button_B2.getText() == "X"
                        &&Button_C3.getText() == "X"
        ) {
            end = true;
            setText("X wins");
        }

        else if(
                Button_A1.getText() == "X"
                        &&Button_B1.getText() == "X"
                        &&Button_C1.getText() == "X"
        ) {
            end = true;
            setText("X wins");
        }

        else if(
                Button_A1.getText() == "O"
                        &&Button_B1.getText() == "O"
                        &&Button_C1.getText() == "O"
        ) {
            end = true;
            setText("O wins");
        }

        else if(
                Button_A2.getText() == "X"
                        &&Button_B2.getText() == "X"
                        &&Button_C2.getText() == "X"
        ) {
            end = true;
            setText("X wins");
        }

        else if(
                Button_A2.getText() == "O"
                        &&Button_B2.getText() == "O"
                        &&Button_C2.getText() == "O"
        ) {
            end = true;
            setText("O wins");
        }

        else if(
                Button_A3.getText() == "X"
                        &&Button_B3.getText() == "X"
                        &&Button_C3.getText() == "X"
        ) {
            end = true;
            setText("X wins");
        }

        else if(
                Button_A3.getText() == "O"
                        &&Button_B3.getText() == "O"
                        &&Button_C3.getText() == "O"
        ) {
            end = true;
            setText("O wins");
        }

        else if(
                Button_A1.getText() == "O"
                        &&Button_B2.getText() == "O"
                        &&Button_C3.getText() == "O"
        ) {
            end = true;
            setText("O wins");
        }

        else if(
                Button_C1.getText() == "X"
                        &&Button_B2.getText() == "X"
                        &&Button_A3.getText() == "X"
        ) {
            end = true;
            setText("X wins");
        }

        else if(
                Button_C1.getText() == "O"
                        &&Button_B2.getText() == "O"
                        &&Button_A3.getText() == "O"
        ) {
            end = true;
            setText("O wins");
        }

        else if(
                !Button_A1.getText().isBlank()
                &&!Button_A2.getText().isBlank()
                &&!Button_A3.getText().isBlank()
                &&!Button_B1.getText().isBlank()
                &&!Button_B2.getText().isBlank()
                &&!Button_B3.getText().isBlank()
                &&!Button_C1.getText().isBlank()
                &&!Button_C2.getText().isBlank()
                &&!Button_C3.getText().isBlank()
        ) {
            end = true;
            setText("Tie");
        }

    }

    private void ButtonListeners() {

        Button_A1.addActionListener(e -> {

            if(Button_A1.getText().isBlank() && !end) {
                clicks++;
                if(clicks % 2 == 1) {
                    Button_A1.setText("O");
                } else {
                    Button_A1.setText("X");
                }
                WinCheck();
            }

        });

        Button_A2.addActionListener(e -> {

            if(Button_A2.getText().isBlank() && !end) {
                clicks++;
                if(clicks % 2 == 1) {
                    Button_A2.setText("O");
                } else {
                    Button_A2.setText("X");
                }
                WinCheck();
            }

        });

        Button_A3.addActionListener(e -> {

            if(Button_A3.getText().isBlank() && !end) {
                clicks++;
                if(clicks % 2 == 1) {
                    Button_A3.setText("O");
                } else {
                    Button_A3.setText("X");
                }
                WinCheck();
            }

        });

        Button_B1.addActionListener(e -> {

            if(Button_B1.getText().isBlank() && !end) {
                clicks++;
                if(clicks % 2 == 1) {
                    Button_B1.setText("O");
                } else {
                    Button_B1.setText("X");
                }
                WinCheck();
            }

        });

        Button_B2.addActionListener(e -> {

            if(Button_B2.getText().isBlank() && !end) {
                clicks++;
                if(clicks % 2 == 1) {
                    Button_B2.setText("O");
                } else {
                    Button_B2.setText("X");
                }
                WinCheck();
            }

        });

        Button_B3.addActionListener(e -> {

            if(Button_B3.getText().isBlank() && !end) {
                clicks++;
                if(clicks % 2 == 1) {
                    Button_B3.setText("O");
                } else {
                    Button_B3.setText("X");
                }
                WinCheck();
            }

        });

        Button_C1.addActionListener(e -> {

            if(Button_C1.getText().isBlank() && !end) {
                clicks++;
                if(clicks % 2 == 1) {
                    Button_C1.setText("O");
                } else {
                    Button_C1.setText("X");
                }
                WinCheck();
            }

        });

        Button_C2.addActionListener(e -> {

            if(Button_C2.getText().isBlank() && !end) {
                clicks++;
                if(clicks % 2 == 1) {
                    Button_C2.setText("O");
                } else {
                    Button_C2.setText("X");
                }
                WinCheck();
            }

        });

        Button_C3.addActionListener(e -> {

            if(Button_C3.getText().isBlank() && !end) {
                clicks++;
                if(clicks % 2 == 1) {
                    Button_C3.setText("O");
                } else {
                    Button_C3.setText("X");
                }
                WinCheck();
            }

        });

    }

    private void ButtonBounds() {

        Button_A1.setBounds(
                0,
                100,
                200,
                200
        );
        Button_A2.setBounds(
                200,
                100,
                200,
                200
        );
        Button_A3.setBounds(
                400,
                100,
                200,
                200
        );
        Button_B1.setBounds(
                0,
                300,
                200,
                200
        );
        Button_B2.setBounds(
                200,
                300,
                200,
                200
        );
        Button_B3.setBounds(
                400,
                300,
                200,
                200
        );
        Button_C1.setBounds(
                0,
                500,
                200,
                200
        );
        Button_C2.setBounds(
                200,
                500,
                200,
                200
        );
        Button_C3.setBounds(
                400,
                500,
                200,
                200
        );

    }

    private void ButtonFonts() {

        Button_A1.setFont(Button_Font);
        Button_A2.setFont(Button_Font);
        Button_A3.setFont(Button_Font);
        Button_B1.setFont(Button_Font);
        Button_B2.setFont(Button_Font);
        Button_B3.setFont(Button_Font);
        Button_C1.setFont(Button_Font);
        Button_C2.setFont(Button_Font);
        Button_C3.setFont(Button_Font);

    }

    private void ButtonColors() {

        Button_A1.setForeground(Color.red);
        Button_A1.setBackground(Color.darkGray);
        Button_A1.setUI(new ButtonUI(Color.darkGray, Color.GRAY));
        Button_A1.setBorderPainted(false);
        Button_A1.setFocusPainted(false);

        Button_A2.setForeground(Color.red);
        Button_A2.setBackground(Color.darkGray);
        Button_A2.setUI(new ButtonUI(Color.darkGray, Color.GRAY));
        Button_A2.setBorderPainted(false);
        Button_A2.setFocusPainted(false);

        Button_A3.setForeground(Color.red);
        Button_A3.setBackground(Color.darkGray);
        Button_A3.setUI(new ButtonUI(Color.darkGray, Color.GRAY));
        Button_A3.setBorderPainted(false);
        Button_A3.setFocusPainted(false);


        Button_B1.setForeground(Color.red);
        Button_B1.setBackground(Color.darkGray);
        Button_B1.setUI(new ButtonUI(Color.darkGray, Color.GRAY));
        Button_B1.setBorderPainted(false);
        Button_B1.setFocusPainted(false);

        Button_B2.setForeground(Color.red);
        Button_B2.setBackground(Color.darkGray);
        Button_B2.setUI(new ButtonUI(Color.darkGray, Color.GRAY));
        Button_B2.setBorderPainted(false);
        Button_B2.setFocusPainted(false);

        Button_B3.setForeground(Color.red);
        Button_B3.setBackground(Color.darkGray);
        Button_B3.setUI(new ButtonUI(Color.darkGray, Color.GRAY));
        Button_B3.setBorderPainted(false);
        Button_B3.setFocusPainted(false);


        Button_C1.setForeground(Color.red);
        Button_C1.setBackground(Color.darkGray);
        Button_C1.setUI(new ButtonUI(Color.darkGray, Color.GRAY));
        Button_C1.setBorderPainted(false);
        Button_C1.setFocusPainted(false);

        Button_C2.setForeground(Color.red);
        Button_C2.setBackground(Color.darkGray);
        Button_C2.setUI(new ButtonUI(Color.darkGray, Color.GRAY));
        Button_C2.setBorderPainted(false);
        Button_C2.setFocusPainted(false);

        Button_C3.setForeground(Color.red);
        Button_C3.setBackground(Color.darkGray);
        Button_C3.setUI(new ButtonUI(Color.darkGray, Color.GRAY));
        Button_C3.setBorderPainted(false);
        Button_C3.setFocusPainted(false);

    }
}