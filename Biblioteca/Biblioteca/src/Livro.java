public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    
    public Livro() {
    }

    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        this.disponivel = false;
        System.out.println("Livro " + this.titulo + " Emprestado com Sucesso");
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("Livro Devolvido com Sucesso!");
    }

    public void exibirInfo() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Disponível: " + this.disponivel);
    }
}
