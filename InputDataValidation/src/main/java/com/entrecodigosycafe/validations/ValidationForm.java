package com.entrecodigosycafe.validations;

import javax.swing.*;

public class ValidationForm extends JFrame {

    public ValidationForm() {
        setTitle("Formulario de Validación de Datos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        add(new FormPanel());
        setVisible(true);
    }

}
