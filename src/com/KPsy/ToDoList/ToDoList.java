package com.KPsy.ToDoList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ToDoList extends JPanel {

    // Variables
    JTextPane testTextPane = new JTextPane();
    JButton testButton = new JButton();
    GridBagConstraints c = new GridBagConstraints();

    // Constructor
    public ToDoList(){

        generateUI();
        loadToDoList();
        displayToDoList();


        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    saveTodoList();
            }
        });

    }

    private void generateUI() {

        testTextPane.setSize(200,100);

        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(testTextPane,c);
        c.gridx = 1;
        add(testButton,c);

    }

    private void loadToDoList(){

    }

    private void displayToDoList(){

    }

    private void saveTodoList(){
        String s = testTextPane.getText();
        System.out.println(s);
    }

}
