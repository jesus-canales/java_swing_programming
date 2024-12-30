package com.entrecodigosycafe.view;

import javax.swing.*;
import java.awt.*;

public class PanelForm extends JFrame {

    public PanelForm () {
        this.setTitle("App de Paneles");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.add(containerPrincipal());
        this.setVisible(true);

    }

    private JPanel containerPrincipal () {

        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(new BoxLayout(pnlPrincipal, BoxLayout.X_AXIS));

        JPanel panelRed = new JPanel();
        panelRed.setBackground(Color.red);
        panelRed.setPreferredSize(new Dimension(250,300));

        JPanel panelBlue = new JPanel();
        panelBlue.setBackground(Color.blue);
        panelBlue.setPreferredSize(new Dimension(250,300));

        pnlPrincipal.add(panelRed);
        pnlPrincipal.add(panelBlue);

        return pnlPrincipal;

    }
}
