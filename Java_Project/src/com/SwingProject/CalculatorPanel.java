package com.SwingProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorPanel extends JPanel implements ActionListener {

    ArrayList<Double> submittedValues = new ArrayList<>();

    String inputValue;
    String prevOperator;
    String submittedOperator = "";

    Boolean opIsSubmitted = false;

    double result;

    JLabel calcScreen = new JLabel("");
    JLabel calcTitle = new JLabel("Calcatron 9000");
    JLabel buttonsContainer = new JLabel();

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
    JButton buttonClear = new JButton("C");

    CalculatorPanel(){
        this.setBounds(250, 100, 500, 750);
        this.setBackground(Color.gray);
        this.setLayout(null);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        calcScreen.setBounds(50, 50, 400, 200);
        calcScreen.setBackground(Color.white);
        calcScreen.setOpaque(true);
        calcScreen.setFont(new Font("Times New Roman", Font.PLAIN, 60));
        calcScreen.setHorizontalAlignment(JLabel.RIGHT);
        calcScreen.setBorder(BorderFactory.createLineBorder(Color.black, 4));

        calcTitle.setBounds(50, 300, 400, 50);
        calcTitle.setFont(new Font("MV Boli", Font.ITALIC, 48));
        calcTitle.setHorizontalAlignment(JLabel.CENTER);

        buttonsContainer.setLayout(null);
        buttonsContainer.setBounds(0, 400, 500, 350);
        buttonsContainer.setBackground(Color.darkGray);
        buttonsContainer.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        button1.setBounds(115, 50, 55, 55);
        button2.setBounds(215, 50, 55, 55);
        button3.setBounds(315, 50, 55, 55);
        button4.setBounds(115, 120, 55, 55);
        button5.setBounds(215, 120, 55, 55);
        button6.setBounds(315, 120, 55, 55);
        button7.setBounds(115, 190, 55, 55);
        button8.setBounds(215, 190, 55, 55);
        button9.setBounds(315, 190, 55, 55);
        button0.setBounds(215, 260, 55, 55);

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
        buttonClear.setFocusable(false);

        buttonPlus.setBounds(415, 10, 50, 50);
        buttonMinus.setBounds(415, 80, 50, 50);
        buttonMultiply.setBounds(415, 150, 50, 50);
        buttonDivide.setBounds(415, 220, 50, 50);
        buttonEquals.setBounds(415, 290, 50, 50);
        buttonClear.setBounds(15, 15, 50, 50);

        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonClear.addActionListener(this);

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
        buttonsContainer.add(buttonClear);


        this.add(calcScreen);
        this.add(calcTitle);
        this.add(buttonsContainer);

    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException{
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
        } else if(e.getSource() == buttonPlus){
            inputValue = "+";
        } else if(e.getSource() == buttonMinus){
            inputValue = "-";
        } else if(e.getSource() == buttonMultiply){
            inputValue = "*";
        } else if(e.getSource() == buttonDivide){
            inputValue = "/";
        } else if(e.getSource() == buttonClear){
            inputValue = "CLEAR";
        }

        if(inputValue.equals("CLEAR")){
            clearCalculator();
            return;
        }

        if(e.getSource() != buttonEquals){
            // sets up operator if value is not an integer
            try {
                Integer.parseInt(inputValue);
                if(opIsSubmitted){
                   calcScreen.setText("");
                   opIsSubmitted = false;
                }
            } catch(NumberFormatException value){
                prevOperator = submittedOperator;
                System.out.println(prevOperator);
                submittedOperator = inputValue;
                opIsSubmitted = true;

                System.out.println(submittedOperator);
            }

            if(!opIsSubmitted){
                    calcScreen.setText(calcScreen.getText().concat(inputValue));
            } else {
                submittedValues.add(Double.parseDouble(calcScreen.getText()));
                if(submittedValues.size() < 2){
                    calcScreen.setText(submittedOperator);
                } else {
                    if(prevOperator.equals("")) {
                        determineResult(submittedOperator);
                    } else {
                        determineResult(prevOperator);
                    }
                    submittedValues.clear();
                    submittedValues.add(result);
                    calcScreen.setText(Double.toString(result));
                }
            }
        } else if(e.getSource() == buttonEquals){
            submittedValues.add(Double.parseDouble(calcScreen.getText()));
            determineResult(submittedOperator);

            calcScreen.setText(Double.toString(result));

            disableButtons();
        }
    }
    private void determineResult(String operator) {
        switch(operator){
            case "+" -> result = (submittedValues.get(0) + submittedValues.get(1));
            case "-" -> result = (submittedValues.get(0) - submittedValues.get(1));
            case "*" -> result = (submittedValues.get(0) * submittedValues.get(1));
            case "/" -> result = (submittedValues.get(0) / submittedValues.get(1));
            default -> throw new Error("Something went wrong");
        }
    }
    private void disableButtons() {
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
        button0.setEnabled(false);

        buttonPlus.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonMultiply.setEnabled(false);
        buttonDivide.setEnabled(false);
        buttonEquals.setEnabled(false);
    }
    private void clearCalculator() {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button0.setEnabled(true);

        buttonPlus.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonMultiply.setEnabled(true);
        buttonDivide.setEnabled(true);
        buttonEquals.setEnabled(true);

        calcScreen.setText("");
        submittedValues.clear();
        submittedOperator = "";
        prevOperator = "";
        submittedOperator = "";
        opIsSubmitted = false;
        inputValue = null;

    }
}
