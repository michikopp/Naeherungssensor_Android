package com.example.kopp.naeherungssensor;

import java.util.Objects;

public class Helligkeit {

    private double helligkeit;
    private double aenderungsquotienten;
    private double kleinsteAenderung;
    private double groessteAenderung;

    public Helligkeit() {
        kleinsteAenderung = 0;
        groessteAenderung = 0;
    }


    public double getHelligkeit() {
        return helligkeit;
    }

    public void setHelligkeit(double helligkeit) {
        this.helligkeit = helligkeit;
    }

    public double getAenderungsquotienten() {
        return aenderungsquotienten;
    }

    public void setAenderungsquotienten(double aenderungsquotienten) {
        this.aenderungsquotienten = aenderungsquotienten;
    }

    public double getKleinsteAenderung() {
        return kleinsteAenderung;
    }

    public void setKleinsteAenderung(double kleinsteAenderung) {
        this.kleinsteAenderung = kleinsteAenderung;
    }

    public double getGroessteAenderung() {
        return groessteAenderung;
    }

    public void setGroessteAenderung(double groessteAenderung) {
        this.groessteAenderung = groessteAenderung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helligkeit that = (Helligkeit) o;
        return Double.compare(that.helligkeit, helligkeit) == 0 &&
                Double.compare(that.aenderungsquotienten, aenderungsquotienten) == 0 &&
                Double.compare(that.kleinsteAenderung, kleinsteAenderung) == 0 &&
                Double.compare(that.groessteAenderung, groessteAenderung) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(helligkeit, aenderungsquotienten, kleinsteAenderung, groessteAenderung);
    }

    @Override
    public String toString() {
        return "Helligkeit{" +
                "helligkeit=" + helligkeit +
                ", aenderungsquotienten=" + aenderungsquotienten +
                ", kleinsteAenderung=" + kleinsteAenderung +
                ", groessteAenderung=" + groessteAenderung +
                '}';
    }
}