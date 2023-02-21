package calculator;

import java.awt.*;
import javax.swing.*;

public class Calculator {

    private JFrame frame;
    private JTextField display;
    private JButton button0, button1, button2, button3, button4, button5,
            button6, button7, button8, button9, buttonAdd, buttonSubtract,
            buttonMultiply, buttonDivide, buttonClear, buttonEquals, buttonDot;

    public Calculator() {
        createUI();
    }

    private void createUI() {
        frame = new JFrame("Calculator");

        display = new JTextField(20);
        display.setEditable(false);
        JPanel displayPanel = new JPanel(new BorderLayout());
        display = new JTextField(20);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        displayPanel.add(display, BorderLayout.CENTER);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonClear = new JButton("C");
        buttonEquals = new JButton("=");
        buttonDot = new JButton(".");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        buttonPanel.add(button7, c);
        c.gridx = 1;
        c.gridy = 0;
        buttonPanel.add(button8, c);
        c.gridx = 2;
        c.gridy = 0;
        buttonPanel.add(button9, c);
        c.gridx = 3;
        c.gridy = 0;
        buttonPanel.add(buttonDivide, c);
        c.gridx = 0;
        c.gridy = 1;
        buttonPanel.add(button4, c);
        c.gridx = 1;
        c.gridy = 1;
        buttonPanel.add(button5, c);
        c.gridx = 2;
        c.gridy = 1;
        buttonPanel.add(button6, c);
        c.gridx = 3;
        c.gridy = 1;
        buttonPanel.add(buttonMultiply, c);
        c.gridx = 0;
        c.gridy = 2;
        buttonPanel.add(button1, c);
        c.gridx = 1;
        c.gridy = 2;
        buttonPanel.add(button2, c);
        c.gridx = 2;
        c.gridy = 2;
        buttonPanel.add(button3, c);
        c.gridx = 3;
        c.gridy = 2;
        buttonPanel.add(buttonSubtract, c);
        c.gridx = 0;
        c.gridy = 3;
        buttonPanel.add(button0, c);
        c.gridx = 1;
        c.gridy = 3;
        buttonPanel.add(buttonDot, c);
        c.gridx = 2;
        c.gridy = 3;
        buttonPanel.add(buttonEquals, c);
        c.gridx = 3;
        c.gridy = 3;
        buttonPanel.add(buttonAdd, c);
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 4;
        buttonPanel.add(buttonClear, c);

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(display, BorderLayout.NORTH);
        frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}