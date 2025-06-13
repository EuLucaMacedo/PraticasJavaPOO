public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Eduarda", 22, "Feminino");
        Livro l = new Livro("Casa dev", "Luca", 200, p);
        l.abrir();
        l.folhear(65);
        l.detalhes();
    }
}
