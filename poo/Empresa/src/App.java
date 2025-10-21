public class App {
    public static void main(String[] args) throws Exception {
       Funcionario funcionario = new Funcionario("Adalberto", "231.384.356.12", 1520);
       funcionario.SalFinal();
        Presidente presidente = new Presidente("Breno", "623.402.803.97", 2500, 5);
        presidente.SalFinal();
    
    funcionario.mostrarFunc();
     presidente.MostrarP();  

    
    }
}
