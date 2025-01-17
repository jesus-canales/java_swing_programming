package com.entrecodigosycafe.register;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    public ButtonPanel () {
        setBackground(new Color(236, 235, 222));

        JButton btnCalculate = new JButton("Calcular Monto");
        btnCalculate.setPreferredSize(new Dimension(150, 40));

        add(btnCalculate);
    }
}
