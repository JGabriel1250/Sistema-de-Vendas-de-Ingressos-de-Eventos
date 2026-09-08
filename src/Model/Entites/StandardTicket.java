package Model.Entites;

import java.util.Date;

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
}
