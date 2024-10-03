public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }
// diciplina que o professor ensina
    public String getDisciplina() {
        return disciplina;
    }
}
