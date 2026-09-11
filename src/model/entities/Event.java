package model.entities;

import model.exceptions.DomainException;

import java.time.LocalDateTime;

public class Event {
    private String name;
    private LocalDateTime ldTime;
    private int capacity;
    private double basePrice;

    public Event() {
    }

    public Event(String name, LocalDateTime ldTime, int capacity, double basePrice) {
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

    public LocalDateTime getLdTime() {
        return ldTime;
    }

    public void setLdTime(LocalDateTime ldTime) {
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

    public void validateCapacity(int qtdIngressos) {
        if (qtdIngressos > capacity) {
            throw new DomainException("The number of tickets exceeds the event capacity.");
        }
    }
}
