package com.entrecodigosycafe.task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskInputPanel extends JPanel {

    private JTextField txtTaskName;
    private JButton btnAddTask;

    public TaskInputPanel() {

        setBackground(new Color(212, 235, 248));
        setLayout(new GridBagLayout());

        JLabel lblTaskName = new JLabel("Nombre de Tarea: ");
        txtTaskName = new JTextField(25);
        txtTaskName.setPreferredSize(new Dimension(250, 25));

        btnAddTask = new JButton("Agregar...");
        btnAddTask.setPreferredSize(new Dimension(120, 30));
        btnAddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String taskName = txtTaskName.getText();
                if ( !taskName.isEmpty() ) {
                    TaskListPanel.addTask( new Task(taskName));
                    txtTaskName.setText("");
                } else {
                    JOptionPane.showMessageDialog( null,
                            "Por favor ingrese una tarea",
                            "Error de validación",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 5, 10, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblTaskName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txtTaskName, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        add(btnAddTask, gbc);

    }
}
