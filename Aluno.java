class Aluno extends Pessoa{
    // curso do aluno
    private String curso;
    // construtor
    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }
    // curso do aluno
    public String getCurso() {
        return curso;
    }
}
