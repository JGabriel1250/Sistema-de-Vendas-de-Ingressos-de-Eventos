package model.entities;

import model.exceptions.DomainException;

import java.time.LocalDateTime;

public abstract class Ticket {
    private Integer id;
    private Event event;

    public Ticket() {
    }

    public Ticket(Integer id, Event event) {
        this.id = id;
        this.event = event;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public abstract Double price();

    public void validateDate() {
        if (event.getLdTime().isBefore(LocalDateTime.now())) {
            throw new DomainException("Tickets cannot be sold for an event that has already occurred.");
        }
    }
}
