package com.entrecodigosycafe.months;

import javax.swing.*;
import java.awt.*;

public class PanelForm extends JFrame {

    public PanelForm() {
        this.setTitle("Meses del año");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.add(containerPrincipal());
        this.setVisible(true);
    }

    private JPanel containerPrincipal () {

        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setBackground(new Color(192, 235, 166));
        pnlPrincipal.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);

        JButton btnEnero = new JButton("Enero");
        gbc.gridx = 0;
        gbc.gridy = 0;
        pnlPrincipal.add(btnEnero, gbc);

        JButton btnFebrero = new JButton("Febrero");
        gbc.gridx = 1;
        gbc.gridy = 0;
        pnlPrincipal.add(btnFebrero, gbc);

        JButton btnMarzo = new JButton("Marzo");
        gbc.gridx = 0;
        gbc.gridy = 1;
        pnlPrincipal.add(btnMarzo, gbc);

        JButton btnAbril = new JButton("Abril");
        gbc.gridx = 1;
        gbc.gridy = 1;
        pnlPrincipal.add(btnAbril, gbc);

        return pnlPrincipal;
    }
}
