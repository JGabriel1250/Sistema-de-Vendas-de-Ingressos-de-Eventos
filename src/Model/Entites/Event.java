package Model.Entites;

import java.util.Date;

public class Event {
    private String name;
    private Date ldTime;
    private int capacity;
    private double basePrice;

    public Event() {
    }

    public Event(String name, Date ldTime, int capacity, double basePrice) {
        this.name = name;
        this.ldTime = ldTime;
        this.capacity = capacity;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLdTime() {
        return ldTime;
    }

    public void setLdTime(Date ldTime) {
        this.ldTime = ldTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
