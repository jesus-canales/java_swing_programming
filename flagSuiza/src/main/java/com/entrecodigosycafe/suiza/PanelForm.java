package com.entrecodigosycafe.suiza;

import javax.swing.*;
import java.awt.*;

public class PanelForm extends JFrame {

    public PanelForm () {
        this.setTitle("Bandera Suiza");
        this.setSize(700, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.add(containerPrincipal());
        this.setVisible(true);
    }

    private JPanel containerPrincipal () {
        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setBackground(Color.red);
        pnlPrincipal.setLayout(new GridBagLayout());

        JPanel verticalBar = new JPanel();
        verticalBar.setBackground(Color.white);
        verticalBar.setPreferredSize(new Dimension(100,300));

        JPanel horizontalBar = new JPanel();
        horizontalBar.setBackground(Color.white);
        horizontalBar.setPreferredSize(new Dimension(300, 100));

        pnlPrincipal.add(verticalBar, new GridBagConstraints());
        pnlPrincipal.add(horizontalBar, new GridBagConstraints());
        return pnlPrincipal;
    }
}
