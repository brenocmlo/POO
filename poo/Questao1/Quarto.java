public class Quarto {
    private int numero;
    private String tipo;
    private String status;

    public Quarto(int numero, String tipo, String status) {
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
    }

    public void limparQuarto() {
        if (!status.equals("manutenção")) {
            status = "livre";
            System.out.println("Quarto " + numero + " limpo e disponível.");
        } else {
            System.out.println("Quarto " + numero + " está em manutenção.");
        }
    }


    public void alterarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do quarto " + numero + " alterado para " + status + ".");
    }
}