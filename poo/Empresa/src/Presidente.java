public class Presidente extends Funcionario {
    public int QtAC;
 
    public Presidente(String Nome, String Cpf, double Salinic, int QtAC){
        super(Nome, Cpf, Salinic);
         this.QtAC = QtAC;
    }
 public double SalPresida(){
    return Salinic + Salinic *0.10;
 };
public void MostrarP(){
 super.mostrarFunc();
 System.out.println("Quantidade de açoes " + QtAC);

}
}
