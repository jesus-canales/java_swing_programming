package com.entrecodigosycafe.validations;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {

    public static JTextField txtName;
    public static JTextField txtAge;
    public static JComboBox<String> cmbCountry;

    public FormPanel () {
        setBackground(new Color(212, 235, 248));
        setLayout(new GridBagLayout());
        
        Dimension sizeElements = new Dimension(150,25);

        JLabel lblName = new JLabel("Nombre: ");
        lblName.setPreferredSize(sizeElements);

        txtName = new JTextField();
        txtName.setPreferredSize(sizeElements);

        JLabel lblAge = new JLabel("Edad: ");
        lblAge.setPreferredSize(sizeElements);

        txtAge = new JTextField();
        txtAge.setPreferredSize(sizeElements);

        JLabel lblCountry = new JLabel("País: ");
        lblCountry.setPreferredSize(sizeElements);

        cmbCountry = new JComboBox<>();
        cmbCountry.addItem("Seleccione");
        cmbCountry.addItem("Perú");
        cmbCountry.addItem("México");
        cmbCountry.addItem("España");
        cmbCountry.setPreferredSize(sizeElements);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(lblName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(txtName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(lblAge, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(txtAge, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(lblCountry, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(cmbCountry, gbc);
    }
}