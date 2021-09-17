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
