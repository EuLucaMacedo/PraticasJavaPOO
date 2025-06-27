public class Leitor {
    private String nome;
    private Livro livroEmprestado;

    public Leitor() {
    }  

    public Leitor(String nome) { 
        this.nome = nome;
        this.livroEmprestado = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(Livro livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public void pegarEmprestado(Livro livro) {
        if(this.livroEmprestado != null) {
            System.out.println(this.nome + " já possui um livro emprestado: ");
            return;
        }

        if (livro.isDisponivel()) {
            this.livroEmprestado = livro;
            livro.emprestar();
            System.out.println(this.nome + " Pegou o Livro: " + livro.getTitulo());
        } else {
            System.out.println("Livro Indisponivel para empréstimo.");
        }
    }

    public void devolverLivro() {
        if (livroEmprestado != null ) {
            System.out.println(this.nome + " devolveu o livro: " + livroEmprestado.getTitulo());
            livroEmprestado.devolver();
            livroEmprestado = null;
            } else{
                System.out.println("Nenhum Livro emprestado para devolver.");
            }
    }

    public void exibirStatus() {
        System.out.println("Nome do Leitor: " + this.nome);
        if (this.livroEmprestado != null) {
            System.out.println("Livro Emprestado:" + this.livroEmprestado.getTitulo());
        } else {
            System.out.println("Nenhum livro emprestado no momento.");
        }
    }
}
