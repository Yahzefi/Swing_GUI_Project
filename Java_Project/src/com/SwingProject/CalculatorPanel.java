package com.SwingProject;

import javax.swing.*;
import java.awt.*;

public class CalculatorPanel extends JPanel {

    JLabel label;
    JButton buttonOne;

    CalculatorPanel(){
        label = new JLabel();
        label.setPreferredSize(new Dimension(100, 100));
        label.setBackground(Color.red);
        label.setOpaque(true);

        buttonOne = new JButton("1");
        buttonOne.setFocusable(false);
        buttonOne.setBounds(0, 25, 100, 50);
        label.add(buttonOne);

        this.add(label);


    }
}
