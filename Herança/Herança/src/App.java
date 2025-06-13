public class App {
    public static void main(String[] args) throws Exception {
        Aluno a = new Aluno();

        a.setNome("Luca");
        a.setIdade(27);
        a.setSexo("Masc");
        a.setMatricula(1621);
        a.setCurso("Engenharia de Software");
        a.pagarMensalidade();

        Bolsista b = new Bolsista();

        b.setNome("Rafa");
        b.setIdade(16);
        b.setSexo("Masc");
        b.setMatricula(1625);
        b.setCurso("Psicologia");
        b.pagarMensalidade();


        
    }
}
