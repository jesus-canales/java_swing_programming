package com.entrecodigosycafe.task;

import javax.swing.*;
import java.awt.*;

public class TaskInputPanel extends JPanel {

    private JTextField txtTaskName;
    private JButton btnAddTask;

    public TaskInputPanel() {

        setBackground(new Color(212, 235, 248));
        setLayout(new GridBagLayout());

        JLabel lblTaskName = new JLabel("Nombre de Tarea: ");
        txtTaskName = new JTextField(40);
        btnAddTask = new JButton("Agregar tarea");

        add(lblTaskName);
        add(txtTaskName);
        add(btnAddTask);

    }
}
