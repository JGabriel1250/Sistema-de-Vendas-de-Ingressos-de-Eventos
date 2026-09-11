package model.entities;

public class StudentTicket extends Ticket {
    private String studentCardId;

    public StudentTicket() {
        super();
    }

    public StudentTicket(Integer id, Event event, String studentCardId) {
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
        double taxa = 0.50;
        return getEvent().getBasePrice() * taxa;
    }

    @Override
    public String toString() {
        return getEvent().getName()
                + "(STUDENT TICKET): $"
                + String.format("%.2f", price());
    }


}
