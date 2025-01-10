package com.entrecodigosycafe.flag;

import javax.swing.*;
import java.awt.*;

public class PanelForm extends JFrame {
    public PanelForm () {
        this.setTitle("Flag Peru");
        this.setSize(700,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.add(containerPrincipal());
        this.setVisible(true);
    }

    private JPanel containerPrincipal () {

        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(new BoxLayout(pnlPrincipal, BoxLayout.X_AXIS));

        JPanel pnlRedOne = new JPanel();
        pnlRedOne.setBackground(Color.red);
        pnlRedOne.setPreferredSize(new Dimension(250,200));

        JPanel pnlWhiteTwo = new JPanel();
        pnlWhiteTwo.setBackground(Color.white);
        pnlWhiteTwo.setPreferredSize(new Dimension(250, 200));

        JPanel pnlRedThree = new JPanel();
        pnlRedThree.setBackground(Color.red);
        pnlRedThree.setPreferredSize(new Dimension(250,200));

        pnlPrincipal.add(pnlRedOne);
        pnlPrincipal.add(pnlWhiteTwo);
        pnlPrincipal.add(pnlRedThree);

        return pnlPrincipal;
    }
}
