public class App {
    public static void main(String[] args) throws Exception {
        Sala s = new Sala(3);
        s.alunos[0] = new Aluno();
        s.alunos[0].mat = 1;
        s.alunos[0].nome = "Breno";
        s.notas[0] = 9.5;
        s.alunos[1] = new Aluno();
        s.alunos[1].mat = 2;    
        s.alunos[1].nome = "Rayane";
        s.notas[1] = 8.5;
        s.alunos[2] = new Aluno();
        s.alunos[2].mat = 3;
        s.alunos[2].nome = "Joao";
        s.notas[2] = 7.5;
        s.mostrarAlunos();
    }
}
