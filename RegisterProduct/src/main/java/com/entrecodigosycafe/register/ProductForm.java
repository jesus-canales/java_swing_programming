package com.entrecodigosycafe.register;

import javax.swing.*;

public class ProductForm extends JFrame {

    public ProductForm () {
        setTitle("Formulario de Producto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        add(new FormPanel());
        setVisible(true);
    }
}
