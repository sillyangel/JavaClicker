package com.sillyangel.javaclicker;

// awt

import java.awt.BorderLayout;
import java.awt.GridLayout;

// swing gui

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class GUI implements ActionListener{

    int count = 0;

    public GUI() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);

        JLabel label = new JLabel("Number of clicks: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(button);

        frame.add(panel, BorderFactory.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Java Clicker - v1");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}