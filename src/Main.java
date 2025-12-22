import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroAlunos cadastro = new CadastroAlunos();

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("RA: ");
        String ra = scanner.nextLine();

        System.out.print("Nota: ");
        double nota = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, ra, nota);
        cadastro.adicionarAluno(aluno);

        System.out.println("\nAlunos cadastrados:");
        cadastro.listarAlunos();

        scanner.close();
    }
}