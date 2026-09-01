package Model.Entites;

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
}
