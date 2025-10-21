public class Sala {
    public Aluno [] alunos;
    public double []notas;
 
    public Sala(int qtd){
        this.alunos = new Aluno[qtd];
        this.notas = new double[qtd];
    
    }
public void mostrarAlunos(){
  for( int i = 0 ; i < this.alunos.length ; i++){
    System.out.println(this.alunos[i].nome);
    System.out.println(this.notas[i]);
    System.out.println(this.alunos[i].mat);
    System.out.println("-----"); 
        }
    }
}