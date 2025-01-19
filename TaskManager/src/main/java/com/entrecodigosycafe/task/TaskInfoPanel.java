package com.entrecodigosycafe.task;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskInfoPanel extends JPanel {
    private static JLabel lblInfo;

    public TaskInfoPanel() {
        setLayout(new BorderLayout());

        lblInfo = new JLabel("Gestiona tareas de manera eficiente");
        lblInfo.setBorder(new EmptyBorder(15, 0, 15,0));
        lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblInfo.setHorizontalAlignment(SwingConstants.CENTER);

        add(lblInfo, BorderLayout.CENTER);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarInfo();
            }
        });
        timer.start();
        actualizarInfo();
    }

    public static void actualizarInfo () {
        int totalTasks = TaskListPanel.getTaskCount();
        int completedTasks = TaskListPanel.getCompletedTaskCount();
        lblInfo.setText( "Total de tareas asignadas: " + totalTasks + "." + " Tareas completadas: " + completedTasks );
    }

}
