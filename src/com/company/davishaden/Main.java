/*
Name: Davis Haden
Date: 9/16/2021
Desc: a text field panel that describes how many characters there are, how many words, and the average characters per word in the text entered.
 */
package com.company.davishaden;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    JFrame frame = new JFrame("TextField");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    TextFieldPanel panel = new TextFieldPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
