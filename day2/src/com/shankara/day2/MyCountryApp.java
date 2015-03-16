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

        // part 2
        Iterator<CountryDb.CountryCapital> iterator1 = countryDb.countryCapitalIterator();
        while (iterator1.hasNext()) {
            CountryDb.CountryCapital item = iterator1.next();
            System.out.println("Country " + item.country + " capital is " + item.capital);
        }
    }
}
