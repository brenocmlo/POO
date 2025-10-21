public class App {
    public static void main(String[] args) throws Exception {
        
         animal a1 = new animal();
        a1.fazerbarulho();
        a1.exibirINF();
       
    animal a2 = new animal("Toto", "cachorro");
        a2.fazerbarulho();
        a2.exibirINF();

    animal a3 = new animal("lucas","raposa", 12 );
        a3.fazerbarulho();
        a3.exibirINF();

    }
}