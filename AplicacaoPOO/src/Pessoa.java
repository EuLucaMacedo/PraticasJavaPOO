public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    protected Pessoa() {
    }

    protected Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 1;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void ganharExp() {
        this.experiencia = this.experiencia + 1;
        System.out.println("Ganhando Experiencia! " + getExperiencia());
    }

}
