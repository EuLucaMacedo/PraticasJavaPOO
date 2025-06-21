public class Aluno {
    private String nome;
    private int idade;
    private String planoTreino;
    
    public Aluno() {
    }

    public Aluno(String nome, int idade, String planoTreino) {
        this.nome = nome;
        this.idade = idade;
        this.planoTreino = planoTreino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPlanoTreino() {
        return planoTreino;
    }

    public void setPlanoTreino(String planoTreino) {
        this.planoTreino = planoTreino;
    }

    public void exibirStatus() {
        System.out.println("================= Dados no Aluno ==============");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Plano em Vigor: " + this.planoTreino);
    }

    public void alterarPlano(String novoPlano) {
        this.planoTreino = novoPlano;
    }
}
