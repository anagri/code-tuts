package com.shankara.day2;

import java.util.Iterator;

public class CountryDb {
    private final String[] db;

    public CountryDb() {
        db = new String[]{
                "India", "New Delhi",
                "Nepal", "Kathmandu",
                "Bhutan", "Thimpu",
                "Myanmar", "Naypidaw",
                "Sri Lanka", "Colombo",
                "Pakistan", "Islamabad",
                "Afghanistan", "Kabul"
        };
    }

    public Iterator<String> countries() {
        return null;
    }

    public String capitalOf(String country) {
        return null;
    }
}
