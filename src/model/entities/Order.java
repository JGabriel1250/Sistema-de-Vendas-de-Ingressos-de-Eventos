package model.entities;

import model.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

public class Order {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

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
        tickets.remove(ticket);
    }

    public Double total() {
        double sum = 0;
        for (Ticket t: tickets) {
            sum += t.price();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(moment.format(fmt)).append("\n");
        sb.append("Order status: ").append(getStatus()).append("\n");
        sb.append("Client: ").append(getClient().getName())
                .append(" (").append(getClient().getEmail()).append(")").append("\n");
        sb.append("Order items:\n");
        for (Ticket ticket: tickets) {
            sb.append("- ").append(ticket).append("\n");
        }
        sb.append("Total price: $ ").append(String.format("%.2f", total()));

        return sb.toString();
    }
}
