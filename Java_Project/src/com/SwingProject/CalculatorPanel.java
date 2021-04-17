package com.SwingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorPanel extends JPanel implements ActionListener {

    JLabel calcScreen = new JLabel();
    JLabel buttonsContainer = new JLabel();

    String inputValue;
    ArrayList<Integer> submittedValues = new ArrayList<>();
    String submittedOperator = "";
    int result;

    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");

    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMultiply = new JButton("x");
    JButton buttonDivide = new JButton("/");
    JButton buttonEquals = new JButton("=");

    CalculatorPanel(){

        this.setBounds(250, 100, 500, 750);
        this.setBackground(Color.gray);
        this.setLayout(null);

        calcScreen.setBounds(50, 50, 400, 200);
        calcScreen.setBackground(Color.white);
        calcScreen.setOpaque(true);
        calcScreen.setFont(new Font("Times New Roman", Font.PLAIN, 60));
        calcScreen.setHorizontalAlignment(JLabel.RIGHT);

        buttonsContainer.setLayout(null);
        buttonsContainer.setBounds(0, 400, 500, 350);
        buttonsContainer.setBackground(Color.darkGray);
        buttonsContainer.setOpaque(true);

        button1.setBounds(115, 25, 55, 55);
        button2.setBounds(215, 25, 55, 55);
        button3.setBounds(315, 25, 55, 55);
        button4.setBounds(115, 95, 55, 55);
        button5.setBounds(215, 95, 55, 55);
        button6.setBounds(315, 95, 55, 55);
        button7.setBounds(115, 165, 55, 55);
        button8.setBounds(215, 165, 55, 55);
        button9.setBounds(315, 165, 55, 55);
        button0.setBounds(215, 235, 55, 55);

        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        button7.setFocusable(false);
        button8.setFocusable(false);
        button9.setFocusable(false);
        button0.setFocusable(false);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);

        buttonPlus.setFocusable(false);
        buttonMinus.setFocusable(false);
        buttonMultiply.setFocusable(false);
        buttonDivide.setFocusable(false);
        buttonEquals.setFocusable(false);

        buttonPlus.setBounds(415, 5, 50, 50);
        buttonMinus.setBounds(415, 75, 50, 50);
        buttonMultiply.setBounds(415, 145, 50, 50);
        buttonDivide.setBounds(415, 215, 50, 50);
        buttonEquals.setBounds(415, 285, 50, 50);

        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);

        buttonsContainer.add(button1);
        buttonsContainer.add(button2);
        buttonsContainer.add(button3);
        buttonsContainer.add(button4);
        buttonsContainer.add(button5);
        buttonsContainer.add(button6);
        buttonsContainer.add(button7);
        buttonsContainer.add(button8);
        buttonsContainer.add(button9);
        buttonsContainer.add(button0);

        buttonsContainer.add(buttonPlus);
        buttonsContainer.add(buttonMinus);
        buttonsContainer.add(buttonMultiply);
        buttonsContainer.add(buttonDivide);
        buttonsContainer.add(buttonEquals);

        this.add(calcScreen);
        this.add(buttonsContainer);

    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {
        // on button click, updates inputValue variable
        if(e.getSource() == button1){
            inputValue = "1";
        } else if(e.getSource() == button2 ){
            inputValue = "2";
        } else if(e.getSource() == button3 ){
            inputValue = "3";
        } else if(e.getSource() == button4 ){
            inputValue = "4";
        } else if(e.getSource() == button5 ){
            inputValue = "5";
        } else if(e.getSource() == button6 ){
            inputValue = "6";
        } else if(e.getSource() == button7 ){
            inputValue = "7";
        } else if(e.getSource() == button8 ){
            inputValue = "8";
        } else if(e.getSource() == button9 ){
            inputValue = "9";
        } else if(e.getSource() == button0 ){
            inputValue = "0";
        }
        // output of buttonEquals will not be inputValue
        if(e.getSource() != buttonEquals){
            // after determining inputValue, adds number to "screen" as String
            if(calcScreen.getText().equals("")){
                calcScreen.setText(inputValue);

            } else {
                if(e.getSource() == buttonPlus){
                    submittedValues.add(Integer.parseInt(calcScreen.getText()));
                    calcScreen.setText(buttonPlus.getText());
                    submittedOperator = buttonPlus.getText();
                    if(submittedValues.size() == 2){
                        result = ( submittedValues.get(0) + submittedValues.get(1) );
                        submittedValues.clear();
                        submittedValues.add(result);
                        System.out.println(submittedValues);
                        calcScreen.setText(Integer.toString(result));
                        submittedOperator = null;
                    }
                } else if(e.getSource() == buttonMinus){
                    submittedValues.add(Integer.parseInt(calcScreen.getText()));
                    calcScreen.setText(buttonMinus.getText());
                    submittedOperator = buttonMinus.getText();
                } else if(e.getSource() == buttonMultiply){
                    submittedValues.add(Integer.parseInt(calcScreen.getText()));
                    calcScreen.setText(buttonMultiply.getText());
                    submittedOperator = buttonMultiply.getText();
                } else if(e.getSource() == buttonDivide){
                    calcScreen.setText(buttonDivide.getText());
                    submittedOperator = buttonDivide.getText();
                } else if(calcScreen.getText().equals("+")
                        || calcScreen.getText().equals("-")
                        || calcScreen.getText().equals("x")
                        || calcScreen.getText().equals("/")) {

                    calcScreen.setText("");
                    calcScreen.setText(inputValue);

                } else {
                    if(submittedOperator == null){
                        calcScreen.setText(inputValue);
                        submittedOperator = "";
                    } else {
                        calcScreen.setText(calcScreen.getText().concat(inputValue));
                    }

                }
            }
        } else {
            submittedValues.add(Integer.parseInt(calcScreen.getText()));
            if(submittedOperator.equals("+")){
                result += ( submittedValues.get(0) + submittedValues.get(1) );
                calcScreen.setText(Integer.toString(result));
                submittedValues.clear();
                submittedOperator = "";
            }
        }
    }
}
