package com.KPsy.ToDoList;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame{

    // Variables




    // Constructor

    public App(){
        initUI();
    }


    // Methods

    private void initUI() {
        add(new ToDoList());

        setResizable(true);
        pack();

        setTitle("To Do List");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {

            var ex = new App();
            ex.setVisible(true);
        });
    }

}
