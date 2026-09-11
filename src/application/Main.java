package application;

import model.entities.*;
import model.enums.OrderStatus;
import model.exceptions.DomainException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try {
            System.out.println("Enter client data:");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Cpf: ");
            String cpf = sc.nextLine();

            Client client = new Client(name, email, cpf);

            System.out.println("Enter order status: ");
            OrderStatus status = OrderStatus.valueOf(sc.nextLine().toUpperCase());

            Order order = new Order(1, LocalDateTime.now(), status, client);

            System.out.println("Enter number of tickets for this order: ");
            int N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                sc.nextLine();
                System.out.printf("Ticket #%d data:\n", i + 1);
                System.out.println("Event name:");
                String eventName = sc.nextLine();
                System.out.println("Event date (dd/MM/yyyy HH:mm): ");
                String dateStr = sc.nextLine();
                LocalDateTime date = LocalDateTime.parse(dateStr, fmt);
                System.out.println("Event capacity: ");
                int capacity = sc.nextInt();
                System.out.println("Base price: ");
                double basePrice = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ticket type (standard/vip/student - s/v/t)? ");
                String ticket = sc.nextLine().toUpperCase();

                Event event = new Event(eventName, date, capacity, basePrice);
                event.validateCapacity(N);

                Ticket t = null;
                if (ticket.charAt(0) == 'S') {
                    t = new StandardTicket(1, event);
                } else if (ticket.charAt(0) == 'V') {
                    t = new VipTicket(1, event, 1.50);
                } else if (ticket.charAt(0) == 'T') {
                    System.out.println("Student card number: ");
                    String cardStudent = sc.nextLine();
                    t = new StudentTicket(1, event, cardStudent);
                }

                t.validateDate();

                order.addTicket(t);
            }

            System.out.println("ORDER SUMMARY:");
            System.out.println(order);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: please enter a numeric value.");
            sc.nextLine(); // limpa o buffer para evitar loop infinito
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format: please use dd/MM/yyyy HH:mm.");
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument: please check your input.");
        }


    }
}
