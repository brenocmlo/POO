public class animal {
    public String especie;
    public String nome;
    public int idade; 
   
    public animal(){
    this.especie = "Desconhecido";
    this.nome = "Desconhecido";
    this.idade = 0; 
    }
    public animal(String nome, String especie){
    this.nome = nome; 
    this.especie = especie;
    this.idade = 12; 
    }

    public animal(String nome, String especie, int idade){
    this.nome = nome; 
    this.especie = especie;
    this.idade = idade; 
    }

   
   public void fazerbarulho(){
    System.out.println(nome + " esta fazendo um som");
   }
   
   
    public void exibirINF(){
        System.out.println("Nome: " + nome + " espécie "+ especie + " idade" + idade);
    
}
       
    
}
