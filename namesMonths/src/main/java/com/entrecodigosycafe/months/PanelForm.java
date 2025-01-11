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

        JButton btnEnero = new JButton("Enero");
        JButton btnFebrero = new JButton("Febrero");
        JButton btnMarzo = new JButton("Marzo");
        JButton btnAbril = new JButton("Abril");

        pnlPrincipal.add(btnEnero);
        pnlPrincipal.add(btnFebrero);
        pnlPrincipal.add(btnMarzo);
        pnlPrincipal.add(btnAbril);
        return pnlPrincipal;

    }
}
