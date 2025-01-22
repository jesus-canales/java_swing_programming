package com.entrecodigosycafe.reservation;

import org.jdatepicker.impl.DateComponentFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateLabelFormatter extends DateComponentFormatter {

    private static final String DATE_PATTERN = "dd/MM/yyyy";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_PATTERN);

    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }

    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }
        return "";
    }
}
