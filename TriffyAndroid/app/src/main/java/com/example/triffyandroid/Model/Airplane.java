package com.example.triffyandroid.Model;

public class Airplane {
    private double price;
    private String name;
    private String outdeparture;
    private String outarrival;
    private String indeparture;
    private String inarrival;

    public Airplane(double price, String name, String outdeparture, String outarrival, String indeparture, String inarrival) {
        this.price = price;
        this.name = name;
        this.outdeparture = outdeparture;
        this.outarrival = outarrival;
        this.indeparture = indeparture;
        this.inarrival = inarrival;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutdeparture() {
        return outdeparture;
    }

    public void setOutdeparture(String outdeparture) {
        this.outdeparture = outdeparture;
    }

    public String getOutarrival() {
        return outarrival;
    }

    public void setOutarrival(String outarrival) {
        this.outarrival = outarrival;
    }

    public String getIndeparture() {
        return indeparture;
    }

    public void setIndeparture(String indeparture) {
        this.indeparture = indeparture;
    }

    public String getInarrival() {
        return inarrival;
    }

    public void setInarrival(String inarrival) {
        this.inarrival = inarrival;
    }
}
