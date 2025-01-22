package com.entrecodigosycafe.reservation;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    public MainPanel () {
        setLayout(new BorderLayout());

        add(new ReservationFormPanel(), BorderLayout.NORTH);
    }
}
