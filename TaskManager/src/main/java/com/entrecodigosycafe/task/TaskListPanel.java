package com.entrecodigosycafe.task;

import javax.swing.*;
import java.awt.*;

public class TaskListPanel extends JPanel {
    private static DefaultListModel taskListModel;
    private JList taskList;
    private JButton btnEditTask;
    private JButton btnDeleteTask;
    private JButton btnMarkComplete;

    public TaskListPanel() {
        setBackground(new Color(255, 251, 202));
        setLayout(new BorderLayout());

        taskListModel = new DefaultListModel<>();
        taskList = new JList<>();
        taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        btnEditTask = new JButton("Editar");
        btnDeleteTask = new JButton("Eliminar");
        btnMarkComplete = new JButton("Completada");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnEditTask);
        buttonPanel.add(btnDeleteTask);
        buttonPanel.add(btnMarkComplete);

        add(new JScrollPane(taskList), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

}
