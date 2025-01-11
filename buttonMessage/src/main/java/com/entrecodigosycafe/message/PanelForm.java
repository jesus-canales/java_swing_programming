package com.entrecodigosycafe.message;

import javax.swing.*;
import java.awt.*;

public class PanelForm extends JFrame {

    public PanelForm () {
        this.setTitle("Mostrar mensaje");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.add(containerPrincipal());
        this.setVisible(true);
    }

    private JPanel containerPrincipal () {

        JButton btnMessage = new JButton("Mensaje");

        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setBackground(new Color(8, 194, 255));
        pnlPrincipal.setLayout(new BoxLayout(pnlPrincipal, BoxLayout.Y_AXIS));

        pnlPrincipal.add(btnMessage);
        return pnlPrincipal;
    }
}
