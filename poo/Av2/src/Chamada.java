public class Chamada {
    private Professor professor;
    private Aluno aluno;
    private boolean presente;

    public Chamada(Professor professor, Aluno aluno) {
        this.professor = professor;
        this.aluno = aluno;
        this.presente = false;
    }

    public void realizarPresenca(Boolean respostaChamada) {
        this.presente = respostaChamada != null ? respostaChamada : false;
    }

    public boolean isPresente() {
        return presente;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

}
