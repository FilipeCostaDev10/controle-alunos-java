import java.util.ArrayList;

public class CadastroAlunos {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(
                "Nome: " + aluno.getNome() +
                " | RA: " + aluno.getRa() +
                " | Nota: " + aluno.getNota() +
                " | Situacao: " + aluno.verificarSituacao()
            );
        }
    }
}