package com.entrecodigosycafe.reservation;

import javax.swing.*;

public class ReservationApp extends JFrame {

    public ReservationApp() {
        setTitle("Aplicación de Reservas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        add(new MainPanel());
        setVisible(true);
    }
}
