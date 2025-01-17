package com.entrecodigosycafe.form;

import javax.swing.*;
import java.awt.*;

public class FormSubscription extends JPanel {

    public FormSubscription() {
        // Personalizamos el JPanel
        setBackground(new Color(217, 234, 253));
        setLayout(new GridBagLayout());

        // Establecemos tamaño de elementos
        Dimension sizeElements = new Dimension(150, 25);

        JLabel lblName = new JLabel("Nombres: ");
        lblName.setPreferredSize(sizeElements);

        JTextField txtName = new JTextField();
        txtName.setPreferredSize(sizeElements);

        JLabel lblLastName = new JLabel("Apellidos: ");
        lblLastName.setPreferredSize(sizeElements);

        JTextField txtLastName = new JTextField();
        txtLastName.setPreferredSize(sizeElements);

        JLabel lblAge = new JLabel("Edad: ");
        lblAge.setPreferredSize(sizeElements);

        JTextField txtAge = new JTextField();
        txtAge.setPreferredSize(sizeElements);

        JLabel lblEmail = new JLabel("Correo: ");
        lblEmail.setPreferredSize(sizeElements);

        JTextField txtEmail = new JTextField();
        txtEmail.setPreferredSize(sizeElements);

        JButton btnSubmit = new JButton("Enviar");
        btnSubmit.setPreferredSize(new Dimension(150, 40));

        add(lblName);
        add(txtName);
        add(lblLastName);
        add(txtLastName);
        add(lblAge);
        add(txtAge);
        add(lblEmail);
        add(txtEmail);
        add(btnSubmit);
    }
}
