public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno() {

    }

    public Aluno(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula() {
        System.out.println("Matricula Cancelada");
    }
     public void pagarMensalidade() {
        System.out.println("Mensalidade paga!\nDar Baixa no Sistema na Matricula: " + this.matricula);
     }
}
