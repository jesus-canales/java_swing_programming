package com.entrecodigosycafe.form;

import javax.swing.*;

public class PanelForm extends JFrame {

    public PanelForm() {
        // Define la personalización de la ventana
        setTitle("Formulario de Suscripción");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(false);

        // LLamamamos al JPanel FormSuscription
        add(new FormSubscription());

        // Permite visualizar la ventana al ejecutar
        setVisible(true);
    }

}
