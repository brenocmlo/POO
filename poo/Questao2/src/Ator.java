public class Ator {
    public String cpf;
    public String sexo;
    public String Nome;

public Ator(String cpf, String sexo, String Nome) {
    this.cpf = cpf;
    this.sexo = sexo;
    this.Nome = Nome;
}

public void mostrarAT(){
    System.out.println("Nome: " + Nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Sexo: " + sexo);}
}