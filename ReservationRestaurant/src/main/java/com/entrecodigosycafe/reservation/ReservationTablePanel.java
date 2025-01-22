package com.entrecodigosycafe.reservation;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ReservationTablePanel extends JPanel {

    public static DefaultTableModel tableModel;

    public ReservationTablePanel() {
        setLayout(new BorderLayout());

        String[] columnNames = {"Nombre", "Teléfono", "Fecha", "Hora"};
        tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);

        add(new JScrollPane(table), BorderLayout.CENTER);
    }


}
