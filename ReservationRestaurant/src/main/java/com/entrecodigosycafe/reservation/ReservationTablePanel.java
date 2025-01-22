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

    public static void addReservation(Reservation reservation) {
        Object[] row = {reservation.getName(), reservation.getPhone(), reservation.getDate(), reservation.getTime()};
        tableModel.addRow(row);
    }


}
