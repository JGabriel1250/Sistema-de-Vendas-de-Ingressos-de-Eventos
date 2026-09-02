package Model.Entites;

import Model.Enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer id;
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<Ticket> tickets = new ArrayList<>();

    public Order() {
    }

    public Order(Integer id, LocalDateTime moment, OrderStatus status, Client client) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void removeTickets(Ticket ticket) {
        tickets.add(ticket);
    }

    public Double total() {
        double sum = 0;
        for (Ticket t: tickets) {
            sum += t.price();
        }
        return sum;
    }
}
