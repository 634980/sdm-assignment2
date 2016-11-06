package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by shwetha on 10/25/2016.
 */
public class YearSelection extends JApplet {
    private String[] year = {"Fall 2015", "Spring 2015", "Fall 2016", "Spring 2016"};
    //private String[] courses= {""}
    private JTextField t = new JTextField(15);

    private JComboBox c = new JComboBox();

    private JButton b = new JButton("Submit"); //need a button with actionListener to perform a function

    private int count = 0;

    public void init() {
        for (int i = 0; i < 4; i++)
            c.addItem(year[count++]);  //adds different semesters into the combobox
        t.setEditable(false);   //this makes the text field uneditable
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText((String) c.getSelectedItem());
                Courses course=new Courses();
                switch(c.getSelectedIndex())
                {
                    case 1: course.Fall15();
                        break;

                }

            }
        });
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(t);
        cp.add(c);

    }
}
