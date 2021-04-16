package com.SwingProject;

import javax.swing.*;

public class AppFrame extends JFrame {

    CalculatorPanel cPanel;

    AppFrame(){

        cPanel = new CalculatorPanel();

        this.add(cPanel);
        this.setTitle("Java Swing Title");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);
    }
}
