public class App {
    public static void main(String[] args) throws Exception {
        Leitor l = new Leitor("Luca" );
        Livro l1 = new Livro("Java POO", "C3Tech", true);
        Livro l2 = new Livro("Harmonia a 4 vozes", "Lucas Macedo", true);

        l.pegarEmprestado(l1);
        l.exibirStatus();
        l.devolverLivro();
        l.exibirStatus();
    }
}
