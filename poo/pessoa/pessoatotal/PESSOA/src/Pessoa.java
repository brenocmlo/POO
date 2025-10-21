public class Pessoa {
    public String cpf;
    public String nome;
    public String sexo;
    public int AnoNasci;
    public double peso;
    public double altura;

    public Pessoa(String cpf, String nome, String sexo, int AnoNasci, double peso, double altura){
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.AnoNasci = AnoNasci;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularidd(){
        return 2025 - AnoNasci;
    }

    public double calcularimc(){
        return peso / (altura * altura);
    }

    public String classificarIMC(){
        double imc = calcularimc();
        if(this.sexo.equals("M")){
            if(imc <= 27){
                return "peso normal";
            }else{
                return "sobrepeso";
            }
        }else if(this.sexo == "F"){
            if(imc <= 26){
                return "peso normal";
            }else{
                return "sobrepeso";
            }
        }else{
            return "sexo inválido";
        }
    }

    public void mostrar(){
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ano de Nascimento: " + AnoNasci);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + calcularidd());
        System.out.println("IMC: " + calcularimc());
        System.out.println("Classificação IMC: " + classificarIMC());
    }
}
