package com.shankara.day2;

public class Probability {
    private final double value;

    public Probability(double value) {
        this.value = Math.round(value * 100) / 100.0;
    }

    public Probability not() {
        return new Probability(1 - value);
    }

    public Probability and(Probability other) {
        return new Probability(value * other.value);
    }

    public Probability or(Probability other) {
        return new Probability(value + other.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.value, value) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }
}
