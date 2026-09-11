package model.entities;

public class StandardTicket extends Ticket {

    public StandardTicket() {
        super();
    }

    public StandardTicket(Integer id, Event event) {
        super(id, event);
    }

    @Override
    public Double price() {
        return getEvent().getBasePrice();
    }

    @Override
    public String toString() {
        return getEvent().getName()
                + "(STANDARD TICKET): $"
                + String.format("%.2f", price());
    }
}
