package com.SwingProject;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    CalculatorPanel cPanel;

    AppFrame(){

        cPanel = new CalculatorPanel();

        this.setTitle("Calculator App");
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.darkGray.darker());
        this.setVisible(true);
        this.add(cPanel);
    }
}
