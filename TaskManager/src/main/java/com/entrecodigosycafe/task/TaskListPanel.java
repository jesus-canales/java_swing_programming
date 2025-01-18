package com.entrecodigosycafe.task;

import javax.swing.*;
import java.awt.*;

public class TaskListPanel extends JPanel {
    private static DefaultListModel<Task> taskListModel;
    private JList<Task> taskList;
    private JButton btnEditTask;
    private JButton btnDeleteTask;
    private JButton btnMarkComplete;

    public TaskListPanel() {
        setBackground(new Color(255, 251, 202));
        setLayout(new BorderLayout());

        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
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

    public static void addTask(Task task) {
        taskListModel.addElement(task);
    }

}
