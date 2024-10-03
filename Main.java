import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ensalamento ensalamento = new Ensalamento();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Sistema de Alocação de Alunos");

        do {
            System.out.println("\n Comandos disponíveis:");
            System.out.println("1 - Realizar Ensalamento");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Listar Professores");
            System.out.println("4 - Adicionar Aluno");
            System.out.println("5 - Adicionar Professor");
            System.out.println("6 - Remover Aluno");
            System.out.println("7 - Sair");
            System.out.print("Digite um comando: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    ensalamento.realizarEnsalamento();
                    break;
                case "2":
                    System.out.println("Alunos:");
                    for (Aluno aluno : ensalamento.getAlunos()) {
                        System.out.println("- " + aluno.getNome() + " (" + aluno.getCurso() + ")");
                    }
                    break;
                case "3":
                    System.out.println("Professores:");
                    for (Professor professor : ensalamento.getProfessores()) {
                        System.out.println("- " + professor.getNome() + " (" + professor.getDisciplina() + ")");
                    }
                    break;
                case "4":
                    adicionarAluno(ensalamento, scanner);
                    break;
                case "5":
                    adicionarProfessor(ensalamento, scanner);
                    break;
                case "6":
                    removerAluno(ensalamento, scanner);
                    break;
                case "7":
                    System.out.println("Saindo do sistema!");
                    break;
                default:
                    System.out.println("Comando inválido! Tente novamente.");
            }
        } while (!command.equals("7"));

        scanner.close();
    }

    private static void adicionarAluno(Ensalamento ensalamento, Scanner scanner) {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o curso do aluno: ");
        String curso = scanner.nextLine();
        ensalamento.adicionarAluno(new Aluno(nome, curso));
        System.out.println("Aluno adicionado com sucesso!");
    }

    private static void adicionarProfessor(Ensalamento ensalamento, Scanner scanner) {
        System.out.print("Digite o nome do professor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a disciplina do professor: ");
        String disciplina = scanner.nextLine();
        ensalamento.adicionarProfessor(new Professor(nome, disciplina));
        System.out.println("Professor adicionado com sucesso!");
    }

    private static void removerAluno(Ensalamento ensalamento, Scanner scanner) {
        System.out.print("Digite o nome do aluno a ser removido: ");
        String nome = scanner.nextLine();
        boolean removido = ensalamento.removerAluno(nome);
        if (removido) {
            System.out.println("Aluno removido com sucesso! Bem vindo(a) ao time!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
