import java.util.ArrayList;
import java.util.List;

public class Ensalamento implements Alocacao {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Curso> cursos;

    public Ensalamento() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        cursos = new ArrayList<>();
        inicializarDados();
    }

    private void inicializarDados() {
        // alunos
        alunos.add(new Aluno("Alfredo", "TI"));
        alunos.add(new Aluno("Amélia", "TI"));
        alunos.add(new Aluno("Ana", "ADM"));
        alunos.add(new Aluno("Bruno", "TI"));
        alunos.add(new Aluno("Bentinho", "ADM"));
        alunos.add(new Aluno("Capitú", "TI"));
        alunos.add(new Aluno("Debra", "TI"));
        alunos.add(new Aluno("Ian", "ADM"));
        alunos.add(new Aluno("Iracema", "TI"));
        alunos.add(new Aluno("Joelmir", "ADM"));
        alunos.add(new Aluno("Julieta", "TI"));
        alunos.add(new Aluno("Luana", "ADM"));
        alunos.add(new Aluno("Luciana", "TI"));
        alunos.add(new Aluno("Majô", "ADM"));
        alunos.add(new Aluno("Maria", "ADM"));
        alunos.add(new Aluno("Norberto", "TI"));
        alunos.add(new Aluno("Paulo", "ADM"));
        alunos.add(new Aluno("Romeu", "ADM"));
        alunos.add(new Aluno("Wendel", "TI"));
        alunos.add(new Aluno("Zoey", "TI"));

        // professores
        professores.add(new Professor("Mia", "POO"));
        professores.add(new Professor("Saulo", "Estrutura de Dados"));
        professores.add(new Professor("Paula", "BI"));

        // cursos e disciplinas
        Curso cursoTI = new Curso("TI");
        cursoTI.adicionarDisciplina(new Disciplina("POO do curso de TI"));
        cursoTI.adicionarDisciplina(new Disciplina("Estrutura de Dados do curso de TI"));

        Curso cursoADM = new Curso("ADM");
        cursoADM.adicionarDisciplina(new Disciplina("BI do curso de ADM"));

        cursos.add(cursoTI);
        cursos.add(cursoADM);
    }

    @Override
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    @Override
    public void adicionarDisciplina(Disciplina disciplina) {
        
        System.out.println("Disciplina adicionada: " + disciplina.getNome());
    }

    @Override
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public void realizarEnsalamento() {
        // ensala em ti
        Turma turmaTI = new Turma(professores.get(0), cursos.get(0).getDisciplinas().get(0));
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals("TI")) {
                turmaTI.adicionarAluno(aluno);
            }
        }
        turmaTI.exibirTurma();

        // ensala em adm
        Turma turmaADM = new Turma(professores.get(2), cursos.get(1).getDisciplinas().get(0));
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals("ADM")) {
                turmaADM.adicionarAluno(aluno);
            }
        }
        turmaADM.exibirTurma();
    }

    @Override
    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public List<Professor> getProfessores() {
        return professores;
    }

    @Override
    public List<Curso> getCursos() {
        return cursos;
    }
    public boolean removerAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                alunos.remove(aluno);
                return true; // nesse cas o oaluno foi encontrado e removido!
            }
        }
        return false; // caso eu nao encontre o aluno
    }
}
