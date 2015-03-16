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
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < db.length;
            }

            @Override
            public String next() {
                String country = db[index];
                index += 2;
                return country;
            }
        };
    }

    public String capitalOf(String country) {
        for (int i = 0; i < db.length; i += 2) {
            String dbCountry = db[i];
            if (dbCountry.equals(country)) return db[i + 1];
        }
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
