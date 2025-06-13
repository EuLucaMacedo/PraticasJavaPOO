public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro() {

    }
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo; 
        this.autor = autor; 
        this.totPaginas = totPaginas; 
        this.pagAtual = 001;
        this.aberto = false; 
        this.leitor = leitor;
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

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas (int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("=========== Dados Livro ===========");
        System.out.println("Titulo do Livro: " + this.titulo);
        System.out.println("Autor Pricipal: " + this.autor);
        System.out.println("O Livro esta Aberto? " + this.isAberto());
        System.out.println("Total de Paginas: " + this.totPaginas);
        System.out.println("Pagina Atual: " + this.pagAtual);

        System.out.println("=========== Dados Leitor ===========");
        System.out.println("Nome do Leitor: " + this.leitor.getNome());
        System.out.println("Idade: " +  this.leitor.getIdade());
        System.out.println("Sexo: " + this.leitor.getSexo());
        
    }
    
    
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > 0 && p <= this.totPaginas){
            this.pagAtual = p;
        }else{
            throw new IllegalArgumentException("Pagina Invalida" + p);
        }
        
    }

    @Override
    public void avancarPag() {
        if(this.pagAtual <= this.totPaginas){
            this.pagAtual ++;
        }else{
            System.out.println("Pagina Indisponivel");
        }
        
    }

    @Override
    public void voltarPag() {
        if(this.pagAtual > 0){
            this.pagAtual --;
        }else{
            System.out.println("Pagina Indisponivel!");
        }
            
    }
}   
