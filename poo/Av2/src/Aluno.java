public class Aluno extends Pessoa implements Seguranca {

    public Aluno(String nome, String cpf, String token, String senha) {
        super(nome, cpf, token, senha);
    }

    @Override
    public void realizarLogin() {
        System.out.println("Aluno " + nome + " realizando login com CPF " + cpf);
    }

    @Override
    public boolean AutenticarToken(String token) {
        return this.token != null && this.token.equals(token);
    }
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Token: " + token);
        System.out.println("Senha: " + senha);
    }
}
