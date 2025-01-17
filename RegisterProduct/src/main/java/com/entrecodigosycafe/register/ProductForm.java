package com.entrecodigosycafe.register;

import javax.swing.*;
import java.awt.*;

public class ProductForm extends JFrame {

    public ProductForm () {
        setTitle("Formulario de Producto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        this.setLayout(new BorderLayout());
        add(new FormPanel(), BorderLayout.CENTER);
        add(new ButtonPanel(), BorderLayout.SOUTH);
        setVisible(true);
    }
}
