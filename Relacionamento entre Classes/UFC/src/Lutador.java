public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrotas;
    private int empates;

   public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;

        
    }

    public Lutador(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
        
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2) {
            this.categoria = "Invalido";
        }
        else if(this.peso <= 70.3) {
            this.categoria = "Leva";
        }
        else if(this.peso <= 83.9) {
            this.categoria = "Médio";
        }
        else if(this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Invalido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
    public void apresentar() {
        System.out.println("---------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: ");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + " m");
        System.out.println("Peso: " + this.getPeso() + " kg");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitoria());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitoria() + " lutas");
        System.out.println("Perdeu: " + this.getDerrotas() + " lutas");
        System.out.println("Empatou: " + this.getEmpates() + " lutas");
    }

    public void ganharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas());
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }


    
    
}
