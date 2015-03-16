package com.shankara.day2;

import java.util.Iterator;

public class MyCountryApp {
    public static void main(String[] args) {
        CountryDb countryDb = new CountryDb();

        Iterator<String> iterator = countryDb.countries();
        while (iterator.hasNext()) {
            String country = iterator.next();
            System.out.println("Country " + country + " capital is " + countryDb.capitalOf(country));
        }
    }
}
