package com.entrecodigosycafe.task;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TaskInfoPanel extends JPanel {
    private static JLabel lblInfo;

    public TaskInfoPanel() {
        setLayout(new BorderLayout());

        lblInfo = new JLabel("Gestiona tareas de manera eficiente");
        lblInfo.setBorder(new EmptyBorder(15, 0, 15,0));
        lblInfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblInfo.setHorizontalAlignment(SwingConstants.CENTER);

        add(lblInfo, BorderLayout.CENTER);

    }
}
