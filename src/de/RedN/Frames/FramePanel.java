package de.RedN.Frames;

import de.RedN.WindowManager.Button.ButtonUI;
import de.RedN.WindowManager.Button.RButton;

import javax.swing.*;
import java.awt.*;

public class FramePanel extends JPanel {

    static JLabel Text;

    public static int clicks = 0;
    public static boolean end = false;

    private static Dimension Size = null;

    static RButton Button_A1 = new RButton("");
    static RButton Button_A2 = new RButton("");
    static RButton Button_B1 = new RButton("");
    static RButton Button_A3 = new RButton("");
    static RButton Button_B2 = new RButton("");
    static RButton Button_B3 = new RButton("");
    static RButton Button_C1 = new RButton("");
    static RButton Button_C2 = new RButton("");
    static RButton Button_C3 = new RButton("");

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

    private static void setText(String text) {

        Text.setText(text);
        Text.setBounds(
                (Size.width - Text.getPreferredSize().width) / 2,
                0,
                Text.getPreferredSize().width,
                Text.getPreferredSize().height
        );

    }

    public static void WinCheck() {

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
}