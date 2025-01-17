package com.entrecodigosycafe.register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;

public class ButtonPanel extends JPanel {

    public ButtonPanel () {
        setBackground(new Color(236, 235, 222));

        JButton btnCalculate = new JButton("Calcular Monto");
        btnCalculate.setPreferredSize(new Dimension(150, 40));
        btnCalculate.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleCalculate();
            }
        });

        add(btnCalculate);
    }

    private void handleCalculate () {
        String producto = FormPanel.txtProduct.getText();
        String montoPrecio = FormPanel.txtPrice.getText();
        String categoria = ( String ) FormPanel.cmbCategory.getSelectedItem();
        String cantidadProducto = FormPanel.txtQuantity.getText();

        try {
            double precio = Double.parseDouble(montoPrecio);
            int cantidad = Integer.parseInt(cantidadProducto);
            double total = precio * cantidad;

            JOptionPane.showMessageDialog(this,
                    "Producto: " + producto + "\n" +
                    "Precio: " + precio + "\n" +
                    "Categoría: " + categoria + "\n" +
                    "Cantidad: " + cantidad + "\n" +
                    "Monto total: " + total,
                    "Detalle de Producto", JOptionPane.INFORMATION_MESSAGE);

            FormPanel.txtProduct.setText("");
            FormPanel.txtPrice.setText("");
            FormPanel.txtQuantity.setText("");
            FormPanel.cmbCategory.setSelectedIndex(0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, debe ingresar datos válidos.",
                    "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }


    }
}
