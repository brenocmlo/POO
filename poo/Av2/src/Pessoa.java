public abstract class Pessoa {
protected String nome;
protected String cpf;
protected String token; 
protected String senha;

public Pessoa(String nome, String cpf, String token, String senha) {
    this.nome = nome;
    this.cpf = cpf;
    this.token = token;
    this.senha = senha;
}

public abstract void realizarLogin();
public void mostrarDados() {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Token: " + token);
    System.out.println("Senha: " + senha);
}
}
