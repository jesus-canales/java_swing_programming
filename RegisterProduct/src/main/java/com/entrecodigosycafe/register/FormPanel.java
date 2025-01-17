package com.entrecodigosycafe.register;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {

    public static JTextField txtProduct;
    public static JTextField txtPrice;
    public static JComboBox<String> cmbCategory;
    public static JTextField txtQuantity;

    public FormPanel () {
        setBackground(new Color(236, 235, 222));
        setLayout(new GridBagLayout());

        Dimension sizeElements = new Dimension(150,25);

        JLabel lblProduct = new JLabel("Producto: ");
        lblProduct.setPreferredSize(sizeElements);

        txtProduct = new JTextField();
        txtProduct.setPreferredSize(sizeElements);

        JLabel lblPrice = new JLabel("Precio: ");
        lblPrice.setPreferredSize(sizeElements);

        txtPrice = new JTextField();
        txtPrice.setPreferredSize(sizeElements);

        JLabel lblCategory = new JLabel("Categoria: ");
        lblCategory.setPreferredSize(sizeElements);

        cmbCategory = new JComboBox<>();
        cmbCategory.addItem("Selecciona");
        cmbCategory.addItem("Electrónica");
        cmbCategory.addItem("Alimentos");
        cmbCategory.addItem("Ropa");
        cmbCategory.setPreferredSize(sizeElements);

        JLabel lblQuantity = new JLabel("Cantidad: ");
        lblQuantity.setPreferredSize(sizeElements);

        txtQuantity = new JTextField();
        txtQuantity.setPreferredSize(sizeElements);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(lblProduct, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(txtProduct, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(lblPrice, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(txtPrice, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(lblCategory, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(cmbCategory, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(lblQuantity, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(txtQuantity, gbc);
    }
}
