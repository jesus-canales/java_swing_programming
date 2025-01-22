package com.entrecodigosycafe.reservation;

public class Reservation {
    private String name;
    private String phone;
    private String date;
    private String time;

    public Reservation(String name, String phone, String date, String time) {
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
