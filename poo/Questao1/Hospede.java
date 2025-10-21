public class Hospede {
    private String nome;
    private String cpf;
    private String telefone;

    public Hospede(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    
    public void fazerReserva() {
        System.out.println("Reserva realizada para o hóspede: " + nome);
    }

   
    public void cancelarReserva() {
        System.out.println("Reserva cancelada para o hóspede: " + nome);
    }
}