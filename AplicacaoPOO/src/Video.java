public class Video implements AcoesVideo{
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video() {
    }

    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 1;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
        System.out.println("Reproduzindo Video");
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
        System.out.println("Pausando Video");
    }

    @Override
    public void like() {
        this.curtidas = this.curtidas + 1;
        System.out.println("Curtindo Video!");
        System.out.println("Numero de curtidas: " + getCurtidas());
    }

}
