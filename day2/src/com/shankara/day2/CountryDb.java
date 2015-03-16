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

//    public Iterator<CountryCapital> countryCapitalIterator() {
//        return null;
//    }
//
//    public static class CountryCapital {
//        public final String country;
//        public final String capital;
//
//        public CountryCapital(String country, String capital) {
//            this.country = country;
//            this.capital = capital;
//        }
//    }
}
