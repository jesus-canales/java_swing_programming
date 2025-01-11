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

        GridBagConstraints gbcv = new GridBagConstraints();

        JPanel verticalBar = new JPanel();
        verticalBar.setBackground(Color.white);
        verticalBar.setPreferredSize(new Dimension(150,400));
        gbcv.gridx = 1;
        gbcv.gridy = 0;
        gbcv.gridwidth = 1;
        gbcv.gridheight = 3;
        gbcv.weightx = 1;
        gbcv.weighty = 1;
        gbcv.anchor = GridBagConstraints.CENTER;
        gbcv.fill = GridBagConstraints.NONE;

        GridBagConstraints gbch = new GridBagConstraints();

        JPanel horizontalBar = new JPanel();
        horizontalBar.setBackground(Color.white);
        horizontalBar.setPreferredSize(new Dimension(400, 150));
        gbch.gridx = 0;
        gbch.gridy = 1;
        gbch.gridwidth = 3;
        gbch.gridheight = 1;
        gbch.weightx = 1;
        gbch.weighty = 1;
        gbch.anchor = GridBagConstraints.CENTER;
        gbch.fill = GridBagConstraints.NONE;


        pnlPrincipal.add(verticalBar, gbcv);
        pnlPrincipal.add(horizontalBar, gbch);
        return pnlPrincipal;
    }
}
