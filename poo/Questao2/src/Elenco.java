public class Elenco {
    private Filme filme;
    private Ator ator;
    private boolean personagemPrincipal;

    public Elenco(Filme filme, Ator ator, boolean personagemPrincipal) {
        this.filme = filme;
        this.ator = ator;
        this.personagemPrincipal = personagemPrincipal;
    }

    public Filme getFilme() { 
        return filme; 
    }
    public Ator getAtor() { 
        return ator; 
    }
    public boolean isPersonagemPrincipal() { 
        return personagemPrincipal; 
    }
}
