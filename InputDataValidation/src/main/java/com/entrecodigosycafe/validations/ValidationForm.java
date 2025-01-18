package com.entrecodigosycafe.validations;

import javax.swing.*;
import java.awt.*;

public class ValidationForm extends JFrame {

    public ValidationForm() {
        setTitle("Formulario de Validación de Datos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(new BorderLayout());
        add(new FormPanel(), BorderLayout.CENTER);
        add(new ButtonPanel(), BorderLayout.SOUTH);
        setVisible(true);
    }

}
