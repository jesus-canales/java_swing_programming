package com.entrecodigosycafe.task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        btnEditTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if ( selectedIndex != -1 ) {
                    Task task = taskListModel.get(selectedIndex);
                    String newName = JOptionPane.showInputDialog(null,
                            "Edite la tarea seleccionada",
                            task.getName());
                    if ( newName != null && !newName.isEmpty() ) {
                        task.setName( newName );
                        taskListModel.setElementAt(task, selectedIndex);
                    }
                }
            }
        });

        btnDeleteTask.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if ( selectedIndex != -1 ) {
                    taskListModel.removeElementAt(selectedIndex);
                }
            }
        });

        btnMarkComplete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if ( selectedIndex != -1 ) {
                    Task task = taskListModel.getElementAt(selectedIndex);
                    task.setCompleted(true);
                }
            }
        });

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

    public static int getTaskCount () {
        return taskListModel.size();
    }

    public static int getCompletedTaskCount() {
        int count = 0;
        for ( int i = 0; i < taskListModel.size(); i++ ) {
            if ( taskListModel.get(i).isCompleted() ) {
                count++;
            }
        }
        return count;
    }

}
