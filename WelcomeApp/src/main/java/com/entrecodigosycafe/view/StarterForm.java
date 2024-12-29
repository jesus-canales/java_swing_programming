package com.entrecodigosycafe.view;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class StarterForm extends JFrame {

    // Constructor de StarterForm
    public StarterForm() {
        // Configurar la ventana
        this.setTitle("Entre Códigos y Café");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        // Agregamos un ícono a la ventana
        URL iconURL = StarterForm.class.getClassLoader().getResource("images/codigocafe.png");
        if (iconURL != null) {
            ImageIcon image = new ImageIcon(iconURL);
            this.setIconImage(image.getImage());
        } else {
            System.out.println("La imagen no ha sido encontrada");
        }

        // Agregamos el panel a la ventana
        this.add(createMainPanel());

        // Establecemos la visibilidad de la ventana
        this.setVisible(true);
    }

    private JPanel createMainPanel () {
        // Crear y configurar etiqueta JLabel
        JLabel lblGreeting = new JLabel("¡No te pierdas ni una línea!");
        lblGreeting.setHorizontalAlignment(SwingConstants.CENTER);
        lblGreeting.setVerticalAlignment(SwingConstants.CENTER);
        lblGreeting.setFont(new Font("Arial", Font.BOLD, 24));
        lblGreeting.setForeground(new Color(140, 0, 0));

        // Crear, configurar el JPanel y agregar JLabel
        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(new GridLayout(1,1));
        pnlPrincipal.setBackground(new Color(243, 255, 144));
        pnlPrincipal.add(lblGreeting);

        return pnlPrincipal;
    }
}