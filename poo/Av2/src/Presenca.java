import java.util.ArrayList;

public class Presenca {
    private String data;
    private ArrayList<Chamada> presencas;

    public Presenca(String data) {
        this.data = data;
        this.presencas = new ArrayList<>();
    }

    public void adicionar(Chamada c) {
        presencas.add(c);
    }

    public void listar(String data) {
        if (this.data == null || !this.data.equals(data)) {
            System.out.println("Nenhuma chamada para a data " + data);
            return;
        }

        System.out.println("Lista de presenças para a data " + data + ":");
        for (Chamada c : presencas) {
            Aluno a = c.getAluno();
            System.out.println("- Aluno: " + a.nome + " | Presente: " + c.isPresente());
        }
    }

}
