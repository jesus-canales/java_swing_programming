package com.entrecodigosycafe.input;

import javax.swing.*;
import java.awt.*;

public class PanelForm extends JFrame {
    public PanelForm() {
        this.setTitle("Entrada de datos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.add(containerPrincipal());
        this.setVisible(true);
    }

    private JPanel containerPrincipal () {

        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setBackground(new Color(242, 107, 15));
        pnlPrincipal.setLayout(new GridBagLayout());

        JLabel lblName = new JLabel("Ingresa tu nombre:");
        lblName.setPreferredSize(new Dimension(110, 25));

        JTextField txtName = new JTextField();
        txtName.setPreferredSize(new Dimension(150, 25));

        JButton btnMessaje = new JButton("Enviar");
        btnMessaje.setPreferredSize(new Dimension(150, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        pnlPrincipal.add(lblName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        pnlPrincipal.add(txtName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        pnlPrincipal.add(btnMessaje, gbc);

        return pnlPrincipal;
    }
}
