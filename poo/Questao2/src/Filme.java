public class Filme {
    private String Id;
    private String Titulo;
    private double Gastos;
    private double Receita;
    public Genero genero;

    public Filme(String Id, String Titulo, double Gastos, double Receita, Genero genero) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.Gastos = Gastos;
        this.Receita = Receita;
        this.genero = genero;
    }

    public Filme(String Id, String Titulo, Genero genero) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.Gastos = 0;
        this.Receita = 0;
        this.genero = genero;
    }

    public String getId(){
    return Id;
}
    public String getTitulo(){
    return Titulo;
}   
    public double getGastos(){
    return Gastos;
}
    public double getReceita(){
    return Receita;
}

    public void setId(String Id){
        this.Id = Id;
    }
    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }
    public void setGastos(double Gastos){
        this.Gastos = Gastos;
    }
    public void setReceita(double Receita){
        this.Receita = Receita;
    }

 public void mostrarInformacoes() {
        System.out.println("ID: " + Id);
        System.out.println("Título: " + Titulo);
        System.out.println("Gênero: " + (genero != null ? genero.Descri : "N/A"));
        System.out.println("Gastos: " + Gastos);
        System.out.println("Receita: " + Receita);
        System.out.println("Lucro: " + calcularLucro());
    }
public double calcularLucro() {
        return Receita - Gastos;
    }
}
