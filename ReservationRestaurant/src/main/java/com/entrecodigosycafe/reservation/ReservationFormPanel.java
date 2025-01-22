package com.entrecodigosycafe.reservation;

import com.github.lgooddatepicker.components.TimePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        JLabel lblPhone = new JLabel("Teléfono: ");
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

        gbc.gridx = 2;
        gbc.gridy = 0;
        add(lblPhone, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        add(txtPhone, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblDate, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(datePicker, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        add(lblTime, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        add(timePicker, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        add(btnSubmit, gbc);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleReservation();
            }
        });
    }

    public void handleReservation() {
        String name = txtName.getText();
        String phone = txtPhone.getText();
        String date = datePicker.getJFormattedTextField().getText();
        String time = timePicker.getText();

        if (name.isEmpty() || phone.isEmpty() || date.isEmpty() || time.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor complete todos los campos",
                    "Error de validación", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ReservationTablePanel.addReservation(new Reservation(name, phone, date, time));
            JOptionPane.showMessageDialog(this,
                    "Reserva registrada exitosamente",
                    "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            clearForm();
        }
    }

    private void clearForm () {
        txtName.setText("");
        txtPhone.setText("");
        datePicker.getJFormattedTextField().setText("");
        timePicker.setText("");
    }
}
