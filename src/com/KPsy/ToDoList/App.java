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

        GridBagLayout gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);
        setResizable(true);
        pack();

        setTitle("To Do List");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        setLocation(50,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {

            var ex = new App();
            ex.setSize(new Dimension(800,600));
            ex.setVisible(true);
        });
    }

}
