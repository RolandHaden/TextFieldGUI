package com.company.davishaden;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldPanel extends JPanel {
    private final JLabel numChar;
    private final JLabel numWords;
    private final JLabel avgLength;
    private final JTextField textField;
    public TextFieldPanel(){
        textField = new JTextField(20);
        textField.setBackground(Color.black);
        textField.setForeground(Color.pink);
        textField.addActionListener(new TempListener());
        add(textField);
        numChar = new JLabel("Number of Characters: " + textField.getText().replaceAll("\\s", "").length());
        numWords = new JLabel("Number of Words: 0");
        avgLength = new JLabel("Average Length of Words: 0");
        add(numChar);
        add(numWords);
        add(avgLength);
        setBackground(Color.pink);
        setPreferredSize(new Dimension(280,130));
    }
    private class TempListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(textField.getText().length() > 0){
                numChar.setText("Number of Characters: " + textField.getText().replaceAll("\\s", "").length());
                numWords.setText("Number of Words: " + countWords(textField.getText()));
                avgLength.setText("Average Length of Words: " + averageWordLength(textField.getText()));
            }else{
                numChar.setText("Number of Characters: 0");
                numWords.setText("Number of Words: 0");
                avgLength.setText("Average Length of Words: 0");
            }
        }

    }
    public int countWords(String s){
        int numWords = 0;
        s = s.trim();
        if(!(s.isEmpty())){
            numWords = 1;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' ' && s.toUpperCase().charAt(i+1) >= 65 && s.toUpperCase().charAt(i+1) <= 90){
                    numWords++;
                }
            }
        }

        return numWords;
    }

    public double averageWordLength(String s){
        int charInWords = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.toUpperCase().charAt(i) >= 65 && s.toUpperCase().charAt(i) <= 90){
                charInWords++;
            }
        }
        return (double) charInWords / (countWords(textField.getText()));
    }
}
