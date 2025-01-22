package com.entrecodigosycafe.reservation;

import com.github.lgooddatepicker.components.TimePicker;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;

public class ReservationFormPanel extends JPanel {

    private JTextField txtName;
    private JTextField txtPhone;
    private JDatePickerImpl datePicker;
    private TimePicker timePicker;
    private JButton btnSubmit;

    public ReservationFormPanel() {
        setBackground(new Color(249, 230, 207));
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblName = new JLabel("Nombre: ");
        txtName = new JTextField(20);

        JLabel lblPhone = new JLabel("Telefono: ");
        txtPhone = new JTextField(20);

        JLabel lblDate = new JLabel("Fecha: ");

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text. today", "Hoy");
        p.put("text. month", "Mes");
        p.put("text. year", "Año");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

        JLabel lblTime = new JLabel("Hora: ");
        timePicker = new TimePicker();

        btnSubmit = new JButton("Reservar");

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txtName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblPhone, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(txtPhone, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lblDate, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(datePicker, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(lblTime, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(timePicker, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(btnSubmit, gbc);
    }
}
