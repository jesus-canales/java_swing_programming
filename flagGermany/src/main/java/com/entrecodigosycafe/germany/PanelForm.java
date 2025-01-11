package com.entrecodigosycafe.germany;

import javax.swing.*;
import java.awt.*;

public class PanelForm extends JFrame {

    public PanelForm () {
        this.setTitle("Flag Germany");
        this.setSize(700,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.add(containerPrincipal());
        this.setVisible(true);
    }

    private JPanel containerPrincipal () {
        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(new BoxLayout(pnlPrincipal, BoxLayout.Y_AXIS));

        JPanel pnlBlack = new JPanel();
        pnlBlack.setBackground(Color.black);
        pnlBlack.setPreferredSize(new Dimension(700,200));

        JPanel pnlRed = new JPanel();
        pnlRed.setBackground(Color.red);
        pnlRed.setPreferredSize(new Dimension(700, 200));

        JPanel pnlYellow = new JPanel();
        pnlYellow.setBackground(Color.yellow);
        pnlYellow.setPreferredSize(new Dimension(700,200));

        pnlPrincipal.add(pnlBlack);
        pnlPrincipal.add(pnlRed);
        pnlPrincipal.add(pnlYellow);
        return pnlPrincipal;
    }
}
