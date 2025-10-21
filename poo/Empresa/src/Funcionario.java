public class Funcionario {
    public String Nome;
    public String Cpf;
    public double Salinic;
    
    public Funcionario (String Nome,String Cpf, double Salinic){
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Salinic = Salinic;
    }


public double SalFinal(){
        return Salinic + Salinic * 0.05;
    }

    public void mostrarFunc(){
        System.out.println("Nome do funcionario: " + Nome);
        System.out.println("Cpf: " + Cpf);
        System.out.println("Salario final: " + SalFinal());
    }
}
