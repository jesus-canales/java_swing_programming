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

        add(lblName);
        add(txtName);
        add(lblAge);
        add(txtAge);
        add(lblCountry);
        add(cmbCountry);
    }
}
