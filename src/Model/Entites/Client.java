package Model.Entites;

public class Client {
    private String name;
    private String email;
    private String cpf;

    public Client() {
    }

    public Client(String cpf, String email, String name) {
        this.cpf = cpf;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
