package com.entrecodigosycafe.enrollment;

import javax.swing.*;
import java.awt.*;

public class EnrollmentFormPanel extends JPanel {
    private JTextField txtName;
    private JTextField txtLastName;
    private JCheckBox chkJava, chkPython, chkJavaScript, chkCPlusPlus;
    private JRadioButton rbtPresencial, rbtVirtual;
    private JButton btnSubmit;

    public EnrollmentFormPanel() {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblName = new JLabel("Nombres:");
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        add(lblName, gbc);
        txtName = new JTextField();
        txtName.setPreferredSize(new Dimension(150,25));
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        add(txtName, gbc);

        JLabel lblLastName = new JLabel("Apellidos:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(lblLastName, gbc);
        txtLastName = new JTextField();
        txtLastName.setPreferredSize(new Dimension(150,25));
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        add(txtLastName, gbc);

        JLabel lblCourses = new JLabel("Cursos:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(lblCourses, gbc);
        JPanel coursePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        chkJava = new JCheckBox("Java");
        chkPython = new JCheckBox("Python");
        chkJavaScript = new JCheckBox("JavaScript");
        chkCPlusPlus = new JCheckBox("C++");
        coursePanel.add(chkJava);
        coursePanel.add(chkPython);
        coursePanel.add(chkJavaScript);
        coursePanel.add(chkCPlusPlus);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(coursePanel, gbc);

        JLabel lblModalidad = new JLabel("Modalidad:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(lblModalidad, gbc);
        JPanel modalidadPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rbtPresencial = new JRadioButton("Presencial");
        rbtVirtual = new JRadioButton("Virtual");
        ButtonGroup modalidadGrupo = new ButtonGroup();
        modalidadGrupo.add(rbtPresencial);
        modalidadGrupo.add(rbtVirtual);
        modalidadPanel.add(rbtPresencial);
        modalidadPanel.add(rbtVirtual);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(modalidadPanel, gbc);

        btnSubmit = new JButton("Inscribirse");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnSubmit, gbc);

    }
}
