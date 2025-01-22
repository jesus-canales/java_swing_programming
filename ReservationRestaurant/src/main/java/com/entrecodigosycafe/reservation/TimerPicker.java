package com.entrecodigosycafe.reservation;

import javax.swing.*;
import java.awt.*;

public class TimerPicker extends JPanel {
    private JComboBox<Integer> hours;
    private JComboBox<Integer> minutes;

    public TimerPicker() {
        setLayout(new FlowLayout());

        Integer[] hourOptions = generateNumberArray(24);
        Integer[] minuteOptions = generateNumberArray(60);

        hours = new JComboBox<>(hourOptions);
        minutes = new JComboBox<>(minuteOptions);

        add(hours);
        add(new JLabel(":"));
        add(minutes);

    }

    private Integer[] generateNumberArray (int size) {
        Integer[] numbers = new Integer[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i;
        }
        return numbers;
    }

    public String getSelectedTime () {
        int selectedHour = (int) hours.getSelectedItem();
        int selectedMinute = (int) minutes.getSelectedItem();
        return String.format("%02d:%02d", selectedHour, selectedMinute);
    }

    public void clear () {
        hours.setSelectedIndex(0);
        minutes.setSelectedIndex(0);
    }
}
