import java.util.List;

public interface Alocacao {
    void adicionarAluno(Aluno aluno);
    void adicionarProfessor(Professor professor);
    void adicionarDisciplina(Disciplina disciplina);
    void adicionarCurso(Curso curso);
    void realizarEnsalamento();
    List<Aluno> getAlunos();
    List<Professor> getProfessores();
    List<Curso> getCursos();
}
