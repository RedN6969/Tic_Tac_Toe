package de.RedN.Frames;

import de.RedN.WindowManager.Button.ButtonUI;
import de.RedN.WindowManager.Button.RButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Objects;

public class FramePanel extends JPanel {

    static JLabel Text;

    public static int clicks = 0;
    public static boolean end = false;

    private static Dimension Size = null;

    static final RButton Button_A1 = new RButton("");
    static final RButton Button_A2 = new RButton("");
    static final RButton Button_B1 = new RButton("");
    static final RButton Button_A3 = new RButton("");
    static final RButton Button_B2 = new RButton("");
    static final RButton Button_B3 = new RButton("");
    static final RButton Button_C1 = new RButton("");
    static final RButton Button_C2 = new RButton("");
    static final RButton Button_C3 = new RButton("");

    final JButton Restart_Button = new JButton();

    static final ArrayList<RButton> Buttons = new ArrayList<>();

    public FramePanel() {

        this.setPreferredSize(new Dimension(
                600,
                700
        ));

        Size = this.getPreferredSize();

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

        RestartButton_Setup();

        this.setBackground(Color.black);

        Buttons.add(Button_A1);
        Buttons.add(Button_A2);
        Buttons.add(Button_A3);
        Buttons.add(Button_B1);
        Buttons.add(Button_B2);
        Buttons.add(Button_B3);
        Buttons.add(Button_C1);
        Buttons.add(Button_C2);
        Buttons.add(Button_C3);

        for(RButton button : Buttons) {

            button.addActionListener(e -> {
                if(button.getText().isBlank() && !end) {
                    clicks++;
                    if(clicks % 2 == 0) {
                        button.setText("O");
                    } else {
                        button.setText("X");
                    }
                    WinCheck();
                }
            });

        }

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

    private void win(String text) {

        Text.setText(text);
        Text.setBounds(
                (Size.width - Text.getPreferredSize().width) / 2,
                0,
                Text.getPreferredSize().width,
                Text.getPreferredSize().height
        );

        this.add(Restart_Button);

    }

    public void WinCheck() {

        if(
                Objects.equals(Button_A1.getText(), "X")
                        && Objects.equals(Button_A2.getText(), "X")
                        && Objects.equals(Button_A3.getText(), "X")
        ) {
            end = true;
            win("X wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_A1.setForeground(Color.green);
            Button_A2.setForeground(Color.green);
            Button_A3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_A1.getText(), "O")
                        && Objects.equals(Button_A2.getText(), "O")
                        && Objects.equals(Button_A3.getText(), "O")
        ) {
            end = true;
            win("O wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_A1.setForeground(Color.green);
            Button_A2.setForeground(Color.green);
            Button_A3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_B1.getText(), "X")
                        && Objects.equals(Button_B2.getText(), "X")
                        && Objects.equals(Button_B3.getText(), "X")
        ) {
            end = true;
            win("X wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_B1.setForeground(Color.green);
            Button_B2.setForeground(Color.green);
            Button_B3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_B1.getText(), "O")
                        && Objects.equals(Button_B2.getText(), "O")
                        && Objects.equals(Button_B3.getText(), "O")
        ) {
            end = true;
            win("O wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_B1.setForeground(Color.green);
            Button_B2.setForeground(Color.green);
            Button_B3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_C1.getText(), "X")
                        && Objects.equals(Button_C2.getText(), "X")
                        && Objects.equals(Button_C3.getText(), "X")
        ) {
            end = true;
            win("X wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_C1.setForeground(Color.green);
            Button_C2.setForeground(Color.green);
            Button_C3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_C1.getText(), "O")
                        && Objects.equals(Button_C2.getText(), "O")
                        && Objects.equals(Button_C3.getText(), "O")
        ) {
            end = true;
            win("O wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_C1.setForeground(Color.green);
            Button_C2.setForeground(Color.green);
            Button_C3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_A1.getText(), "X")
                        && Objects.equals(Button_B2.getText(), "X")
                        && Objects.equals(Button_C3.getText(), "X")
        ) {
            end = true;
            win("X wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_A1.setForeground(Color.green);
            Button_B2.setForeground(Color.green);
            Button_C3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_A1.getText(), "X")
                        && Objects.equals(Button_B1.getText(), "X")
                        && Objects.equals(Button_C1.getText(), "X")
        ) {
            end = true;
            win("X wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_A1.setForeground(Color.green);
            Button_B1.setForeground(Color.green);
            Button_C1.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_A1.getText(), "O")
                        && Objects.equals(Button_B1.getText(), "O")
                        && Objects.equals(Button_C1.getText(), "O")
        ) {
            end = true;
            win("O wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_A1.setForeground(Color.green);
            Button_B1.setForeground(Color.green);
            Button_C1.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_A2.getText(), "X")
                        && Objects.equals(Button_B2.getText(), "X")
                        && Objects.equals(Button_C2.getText(), "X")
        ) {
            end = true;
            win("X wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_A2.setForeground(Color.green);
            Button_B2.setForeground(Color.green);
            Button_C2.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_A2.getText(), "O")
                        && Objects.equals(Button_B2.getText(), "O")
                        && Objects.equals(Button_C2.getText(), "O")
        ) {
            end = true;
            win("O wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_A2.setForeground(Color.green);
            Button_B2.setForeground(Color.green);
            Button_C2.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_A3.getText(), "X")
                        && Objects.equals(Button_B3.getText(), "X")
                        && Objects.equals(Button_C3.getText(), "X")
        ) {
            end = true;
            win("X wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_A3.setForeground(Color.green);
            Button_B3.setForeground(Color.green);
            Button_C3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_A3.getText(), "O")
                        && Objects.equals(Button_B3.getText(), "O")
                        && Objects.equals(Button_C3.getText(), "O")
        ) {
            end = true;
            win("O wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_A3.setForeground(Color.green);
            Button_B3.setForeground(Color.green);
            Button_C3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_A1.getText(), "O")
                        && Objects.equals(Button_B2.getText(), "O")
                        && Objects.equals(Button_C3.getText(), "O")
        ) {
            end = true;
            win("O wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_A1.setForeground(Color.green);
            Button_B2.setForeground(Color.green);
            Button_C3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_C1.getText(), "X")
                        && Objects.equals(Button_B2.getText(), "X")
                        && Objects.equals(Button_A3.getText(), "X")
        ) {
            end = true;
            win("X wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_C1.setForeground(Color.green);
            Button_B2.setForeground(Color.green);
            Button_A3.setForeground(Color.green);
        }

        else if(
                Objects.equals(Button_C1.getText(), "O")
                        && Objects.equals(Button_B2.getText(), "O")
                        && Objects.equals(Button_A3.getText(), "O")
        ) {
            end = true;
            win("O wins");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }

            Button_C1.setForeground(Color.green);
            Button_B2.setForeground(Color.green);
            Button_A3.setForeground(Color.green);
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
            win("Tie");

            for(RButton button : Buttons) {
                button.setForeground(Color.gray);
            }
        }

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

    private void RestartButton_Setup() {

        Restart_Button.setText("Restart");
        Restart_Button.setFont(new Font("Arial", Font.PLAIN, 30));

        Restart_Button.setBounds(
                (this.getPreferredSize().width - Restart_Button.getPreferredSize().width),
                100 - Restart_Button.getPreferredSize().height,
                Restart_Button.getPreferredSize().width,
                Restart_Button.getPreferredSize().height
        );

        Restart_Button.setForeground(Color.gray);
        Restart_Button.setBackground(Color.darkGray);
        Restart_Button.setUI(new ButtonUI(Color.darkGray, Color.gray));
        Restart_Button.setBorderPainted(false);
        Restart_Button.setFocusPainted(false);

        Restart_Button.addActionListener(e -> {

            for(RButton button : Buttons) {

                button.setForeground(Color.red);
                button.setText("");
                clicks = 0;

            }

            end = false;
            win("Tic Tac Toe");

            this.remove(Restart_Button);

        });

    }
}