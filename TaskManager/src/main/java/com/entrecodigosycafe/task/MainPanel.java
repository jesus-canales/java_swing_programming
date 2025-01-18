package com.entrecodigosycafe.task;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel () {
        setLayout(new BorderLayout());

        add(new TaskInputPanel(), BorderLayout.NORTH);
        add(new TaskListPanel(), BorderLayout.CENTER);
        add(new TaskInfoPanel(), BorderLayout.SOUTH);
    }
}
