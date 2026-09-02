package Application;

import Model.Entites.Client;
import Model.Enums.OrderStatus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Cpf: ");
        String cpf = sc.nextLine();

        Client client = new Client(name, email, cpf);

        System.out.println("Enter order status: ");
        OrderStatus.valueOf(sc.nextLine().toUpperCase());

    }
}
