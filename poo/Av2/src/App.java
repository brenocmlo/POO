public class App {
    public static void main(String[] args) throws Exception {
  
        Pessoa professor = new Professor("Andre", "111.222.333-44", "tokenProf", "66997");



        Aluno aluno1 = new Aluno("Ana", "588.141.569.96", "tA1", "5684");
        Aluno aluno2 = new Aluno("Breno", "620.834.783.12", "tA2", "6594");
        Aluno aluno3 = new Aluno("Carla", "589.862.526.52", "tA3", "365");
        Aluno aluno4 = new Aluno("Diego", "696.331.585.65", "tA4", "898");
        Aluno aluno5 = new Aluno("Eduarda", "898.122.557.45", "tA5", "658");
        Aluno aluno6 = new Aluno("Felipe", "696.365.457.20", "tA6", "897");


        Presenca presenca = new Presenca("28/10/2025");


        Professor profRef = (Professor) professor;

     
        Chamada c1 = new Chamada(profRef, aluno1);
        c1.realizarPresenca(true);
        presenca.adicionar(c1);

        Chamada c2 = new Chamada(profRef, aluno2);
        c2.realizarPresenca(false);
        presenca.adicionar(c2);

        Chamada c3 = new Chamada(profRef, aluno3);
        c3.realizarPresenca(true);
        presenca.adicionar(c3);

        Chamada c4 = new Chamada(profRef, aluno4);
        c4.realizarPresenca(false);
        presenca.adicionar(c4);

        Chamada c5 = new Chamada(profRef, aluno5);
        c5.realizarPresenca(true);
        presenca.adicionar(c5);

        Chamada c6 = new Chamada(profRef, aluno6);
        c6.realizarPresenca(false);
        presenca.adicionar(c6);

  
        presenca.listar("28/10/2025");
    }
}
