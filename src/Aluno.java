public class Aluno {
    private String nome;
    private String ra;
    private double nota;

    public Aluno(String nome, String ra, double nota) {
        this.nome = nome;
        this.ra = ra;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public double getNota() {
        return nota;
    }

    public String verificarSituacao() {
        if (nota >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}