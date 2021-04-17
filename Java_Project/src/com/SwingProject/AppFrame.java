package com.SwingProject;

import javax.swing.*;

public class AppFrame extends JFrame {

    CalculatorPanel cPanel;

    AppFrame(){
        
        cPanel = new CalculatorPanel();

        this.setTitle("Java Swing Title");
        this.setSize(1000, 1000);
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);

        this.add(cPanel);
    }
}
