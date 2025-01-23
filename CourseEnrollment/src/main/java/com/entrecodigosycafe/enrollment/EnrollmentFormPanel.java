package com.entrecodigosycafe.enrollment;

import javax.swing.*;
import java.awt.*;

public class EnrollmentFormPanel extends JPanel {
    private JTextField txtName;
    private JTextField txtLastName;
    private JCheckBox chkJava;
    private JCheckBox chkPython;
    private JCheckBox chkJavaScript;
    private JCheckBox chkDart;
    private JRadioButton rbtMorning;
    private JRadioButton rbtAfternoon;
    private JRadioButton rbtEvening;
    private JButton btnSubmit;

    public EnrollmentFormPanel() {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblName = new JLabel("Nombres:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblName, gbc);
        txtName = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txtName, gbc);

        JLabel lblLastName = new JLabel("Apellidos:");
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(lblLastName, gbc);
        txtLastName = new JTextField(20);
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(txtLastName, gbc);

        JLabel lblCourses = new JLabel("Cursos:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblCourses, gbc);

        chkJava = new JCheckBox("Java");
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(chkJava, gbc);
        chkPython = new JCheckBox("Python");
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(chkPython, gbc);
        chkJavaScript = new JCheckBox("JavaScript");
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(chkJavaScript, gbc);
        chkDart = new JCheckBox("Dart");
        gbc.gridx = 4;
        gbc.gridy = 1;
        add(chkDart, gbc);

        JLabel lblFrecuency = new JLabel("Frecuencia:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lblFrecuency, gbc);
        rbtMorning = new JRadioButton("Mañana");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(rbtMorning, gbc);
        rbtAfternoon = new JRadioButton("Tarde");
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(rbtAfternoon, gbc);
        rbtEvening = new JRadioButton("Noche");
        gbc.gridx = 3;
        gbc.gridy = 2;
        add(rbtEvening, gbc);

        ButtonGroup frecuenciaGrupo = new ButtonGroup();
        frecuenciaGrupo.add(rbtMorning);
        frecuenciaGrupo.add(rbtAfternoon);
        frecuenciaGrupo.add(rbtEvening);

        btnSubmit = new JButton("Inscribirse");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(btnSubmit, gbc);



    }
}
