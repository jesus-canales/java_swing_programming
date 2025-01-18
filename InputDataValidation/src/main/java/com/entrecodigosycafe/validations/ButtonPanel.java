package com.entrecodigosycafe.validations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    public ButtonPanel () {
        setBackground(new Color(212, 235, 248));

        JButton btnSubmit = new JButton("Enviar");
        btnSubmit.setPreferredSize(new Dimension(150, 40));
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleSubmit();
            }
        });
        add(btnSubmit);
    }

    private void handleSubmit () {
        String nombre = FormPanel.txtName.getText();
        String cadenaEdad = FormPanel.txtAge.getText();
        String pais = ( String ) FormPanel.cmbCountry.getSelectedItem();

        if (nombre.isEmpty() || cadenaEdad.isEmpty() || pais.equals("Seleccione")) {
            JOptionPane.showMessageDialog(this,
                    "Por favor complete todos los datos",
                    "Error de Validación",
                    JOptionPane.ERROR_MESSAGE);
            limpiarCampos();
            return;
        }

        try {
            int edad = Integer.parseInt(cadenaEdad);
            if ( edad <= 0 ) {
                throw new NumberFormatException();
            }

            JOptionPane.showMessageDialog(this,
                    "Nombre: " + nombre + "\n" +
                    "Edad: " + edad + "\n" +
                    "País: " + pais,
                    "Datos Ingresados",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch ( NumberFormatException e ) {
            JOptionPane.showMessageDialog(this,
                    "Por favor ingrese una edad válida mayor a 0",
                    "Error de Validacion",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            limpiarCampos();
        }
    }

    private  void limpiarCampos() {
        FormPanel.txtName.setText("");
        FormPanel.txtAge.setText("");
        FormPanel.cmbCountry.setSelectedIndex(0);
    }
}
