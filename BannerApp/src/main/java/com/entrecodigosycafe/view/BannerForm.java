package com.entrecodigosycafe.view;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class BannerForm extends JFrame {

    public BannerForm () {
        this.setTitle("Entre Códigos y Café");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);

        URL iconURL = BannerForm.class.getClassLoader().getResource("images/codigocafe.png");
        if (iconURL != null) {
            ImageIcon image = new ImageIcon(iconURL);
            this.setIconImage(image.getImage());
        } else {
            System.out.println("El logo no ha sido encontrado...");
        }

        this.setContentPane(createContainerPanel());

        this.setVisible(true);
    }

    private JPanel createContainerPanel() {
        JPanel containerPanel = new JPanel(new GridBagLayout());
        containerPanel.setBackground(new Color(251, 251, 251));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        containerPanel.add(mainPanel());
        return containerPanel;
    }

    private JPanel mainPanel () {

        // Componentes
        JLabel lblWith = new JLabel();
        lblWith.setText("entre");
        lblWith.setFont(new Font("Comfortaa", Font.BOLD, 32));
        lblWith.setForeground(new Color(38, 53, 93));

        URL imageUrl = BannerForm.class.getClassLoader().getResource("images/codigocafe.png");
        if ( imageUrl != null ) {
            ImageIcon icon = new ImageIcon(imageUrl);
            Image img = icon.getImage();
            int newWidth = 60;
            int newHeight = 60;
            Image resizeImg = img.getScaledInstance(newWidth,newHeight, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizeImg);
            lblWith.setIcon(resizedIcon);
        } else {
            System.out.println("Imagen no encontrada...");
        }

        JLabel lblBrand = new JLabel();
        lblBrand.setText("códigos y café");
        lblBrand.setFont(new Font("Comfortaa", Font.BOLD, 50));
        lblBrand.setForeground(new Color(38, 53, 93));

        JLabel lblPhrase = new JLabel();
        lblPhrase.setText("¡No te pierdas ni una línea!");
        lblPhrase.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblPhrase.setForeground(new Color(190, 0, 0));


        // Panel contenedor de componentes
        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(new BoxLayout(pnlPrincipal, BoxLayout.Y_AXIS));
        pnlPrincipal.setBackground(new Color(251, 251, 251));
        pnlPrincipal.add(Box.createVerticalGlue());
        pnlPrincipal.add(lblWith);
        pnlPrincipal.add(Box.createVerticalStrut(10));
        pnlPrincipal.add(lblBrand);
        pnlPrincipal.add(Box.createVerticalStrut(10));
        pnlPrincipal.add(lblPhrase);
        pnlPrincipal.add(Box.createVerticalGlue());

        return pnlPrincipal;
    }
}