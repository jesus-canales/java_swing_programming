package com.entrecodigosycafe.form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormSubscription extends JPanel {

    // Declaramos atributos de la clase
    private JTextField txtName;
    private JTextField txtLastName;
    private JTextField txtAge;
    private JTextField txtEmail;

    public FormSubscription() {
        // Personalizamos el JPanel
        setBackground(new Color(217, 234, 253));
        setLayout(new GridBagLayout());

        // Establecemos tamaño de elementos
        Dimension sizeElements = new Dimension(150, 25);

        JLabel lblName = new JLabel("Nombres: ");
        lblName.setPreferredSize(sizeElements);

        txtName = new JTextField();
        txtName.setPreferredSize(sizeElements);

        JLabel lblLastName = new JLabel("Apellidos: ");
        lblLastName.setPreferredSize(sizeElements);

        txtLastName = new JTextField();
        txtLastName.setPreferredSize(sizeElements);

        JLabel lblAge = new JLabel("Edad: ");
        lblAge.setPreferredSize(sizeElements);

        txtAge = new JTextField();
        txtAge.setPreferredSize(sizeElements);

        JLabel lblEmail = new JLabel("Correo: ");
        lblEmail.setPreferredSize(sizeElements);

        txtEmail = new JTextField();
        txtEmail.setPreferredSize(sizeElements);

        JButton btnSubmit = new JButton("Enviar");
        btnSubmit.setPreferredSize(new Dimension(150, 40));
        btnSubmit.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                handleSubmit();
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

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
        add(lblLastName,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(txtLastName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(lblAge, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(txtAge, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_END;
        add(lblEmail, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        add(txtEmail, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnSubmit, gbc);
    }

    private void handleSubmit () {
        String nombres = txtName.getText();
        String apellidos = txtLastName.getText();
        String edad = txtAge.getText();
        String correo = txtEmail.getText();

        JOptionPane.showMessageDialog( this,
                "Nombre: " + nombres + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Edad: " + edad + "\n" +
                "Correo electrónico: " + correo,
                "Datos ingresados", JOptionPane.INFORMATION_MESSAGE);

        txtName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        txtEmail.setText("");
    }
}
