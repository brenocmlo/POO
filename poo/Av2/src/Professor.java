public class Professor extends Pessoa implements Seguranca {

    public Professor(String nome, String cpf, String token, String senha) {
        super(nome, cpf, token, senha);
    }

    @Override
    public void realizarLogin() {
        System.out.println("Professor " + nome + " realizando login.");
    }

    public void realizarLogin(String senha) {
        if (this.senha != null && this.senha.equals(senha)) {
            System.out.println("Professor " + nome + " login via senha OK.");
        } else {
            System.out.println("Professor " + nome + " senha incorreta.");
        }
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
