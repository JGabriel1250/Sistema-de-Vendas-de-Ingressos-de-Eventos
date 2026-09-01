package Model.Entites;

public class StandardTicket extends Ticket {

    private String studentCardId;

    public StandardTicket() {
        super();
    }

    public StandardTicket(Integer id, Event event, String studentCardId) {
        super(id, event);
        this.studentCardId = studentCardId;
    }

    public String getStudentCardId() {
        return studentCardId;
    }

    public void setStudentCardId(String studentCardId) {
        this.studentCardId = studentCardId;
    }

    @Override
    public Double price() {
        return getEvent().getBasePrice();
    }
}
