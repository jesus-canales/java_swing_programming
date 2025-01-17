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
        txtProduct.setPreferredSize(sizeElements);

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

        add(lblProduct);
        add(txtProduct);
        add(lblPrice);
        add(txtPrice);
        add(lblCategory);
        add(cmbCategory);
        add(lblQuantity);
        add(txtQuantity);
    }
}
