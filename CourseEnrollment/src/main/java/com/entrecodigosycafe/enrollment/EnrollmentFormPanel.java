package com.entrecodigosycafe.enrollment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnrollmentFormPanel extends JPanel {
    private JTextField txtName;
    private JTextField txtLastName;
    private JCheckBox chkJava, chkPython, chkJavaScript, chkCPlusPlus;
    private JRadioButton rbtPresencial, rbtVirtual;
    private JButton btnSubmit;

    public EnrollmentFormPanel() {
        Color fondoColor = new Color(255, 251, 218);

        setLayout(new GridBagLayout());
        setBackground(fondoColor);

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
        coursePanel.setBackground(fondoColor);
        chkJava = new JCheckBox("Java");
        chkJava.setBackground(fondoColor);
        chkPython = new JCheckBox("Python");
        chkPython.setBackground(fondoColor);
        chkJavaScript = new JCheckBox("JavaScript");
        chkJavaScript.setBackground(fondoColor);
        chkCPlusPlus = new JCheckBox("C++");
        chkCPlusPlus.setBackground(fondoColor);
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
        modalidadPanel.setBackground(fondoColor);
        rbtPresencial = new JRadioButton("Presencial");
        rbtPresencial.setBackground(fondoColor);
        rbtVirtual = new JRadioButton("Virtual");
        rbtVirtual.setBackground(fondoColor);
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

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handEnrollment();
            }
        });

    }

    private void handEnrollment() {
        String nombres = txtName.getText();
        String apellidos = txtLastName.getText();
        String cursos = "";
        if (chkJava.isSelected()) cursos += "Java ";
        if (chkPython.isSelected()) cursos += "Python ";
        if (chkJavaScript.isSelected()) cursos += "JavaScript ";
        if (chkCPlusPlus.isSelected()) cursos += "C++ ";
        String modalidad = "";
        if (rbtPresencial.isSelected()) modalidad = "Presencial";
        else if (rbtVirtual.isSelected()) modalidad = "Virtual";

        if (nombres.isEmpty() || apellidos.isEmpty() || cursos.isEmpty() || modalidad.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, complete todos los campos.",
                    "Error de validación", JOptionPane.ERROR_MESSAGE);
        } else {
            String resumen = "Nombres: " + nombres + "\n" +
                             "Apellidos: " + apellidos + "\n" +
                             "Cursos: " + cursos + "\n" +
                             "Modalidad: " + modalidad;
            JOptionPane.showMessageDialog(this, resumen, "Error", JOptionPane.INFORMATION_MESSAGE);
            clearForm();
        }
    }

    private void clearForm () {
        txtName.setText("");
        txtLastName.setText("");
        chkJava.setSelected(false);
        chkPython.setSelected(false);
        chkJavaScript.setSelected(false);
        chkCPlusPlus.setSelected(false);
        rbtPresencial.setSelected(false);
        rbtVirtual.setSelected(false);
    }
}
