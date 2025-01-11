package com.entrecodigosycafe.message;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setBackground(new Color(8, 194, 255));
        pnlPrincipal.setLayout(new GridBagLayout());

        JButton btnMessage = new JButton();
        btnMessage.setText("Haz click aquí");

        btnMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Botón clickeado!");
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;

        pnlPrincipal.add(btnMessage, gbc);
        return pnlPrincipal;
    }
}