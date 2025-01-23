package com.entrecodigosycafe.enrollment;

import javax.swing.*;

public class CourseEnrollment extends JFrame {

    public CourseEnrollment() {
        setTitle("Inscripción a Cursos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        add(new EnrollmentFormPanel());
        setVisible(true);
    }
}
