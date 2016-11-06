package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        run(new YearSelection(), 300, 300);
    }

    public static void run(JApplet applet, int width, int height) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(applet);
        frame.setSize(width, height);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}


