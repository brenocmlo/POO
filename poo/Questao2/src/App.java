public class App {
    public static void main(String[] args) throws Exception {
    
        Genero genero1 = new Genero("1", "Ativo", "Aventura");
        Genero genero2 = new Genero("2", "Ativo", "Comédia");
        Filme filme1 = new Filme("F01", "Missão Impossível", 1000000, 3500000, genero1);
        Filme filme2 = new Filme("F02", "As Branquelas", genero2);
        Ator ator1 = new Ator("12345678900", "Masculino", "Tom Cruise");
        Elenco elenco1 = new Elenco(filme1, ator1, true);
        Elenco elenco2 = new Elenco(filme2, ator1, false);

        System.out.println("Filme 1:");
        filme1.mostrarInformacoes();
        System.out.println();

        System.out.println("Filme 2:");
        filme2.mostrarInformacoes();
        System.out.println();

        System.out.println("Ator:");
        ator1.mostrarAT();
        System.out.println();

        System.out.println("Elenco 1:");
        System.out.println("Filme: " + elenco1.getFilme().getTitulo());
        System.out.println("Ator: " + elenco1.getAtor().Nome);
        System.out.println("Personagem Principal: " + elenco1.isPersonagemPrincipal());
        System.out.println();

        System.out.println("Elenco 2:");
        System.out.println("Filme: " + elenco2.getFilme().getTitulo());
        System.out.println("Ator: " + elenco2.getAtor().Nome);
        System.out.println("Personagem Principal: " + elenco2.isPersonagemPrincipal());
    }
}
