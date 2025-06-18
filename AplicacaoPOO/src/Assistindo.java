public class Assistindo {
    private Gafanhoto espectador;
    private Video filme;
    
    public Assistindo() {
    }

    public Assistindo(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float por) {
        int total = 0;
        if(por <= 20){
            total = 3;
        } else if(por <= 50){
            total = 5;
        } else if(por <= 90){
            total = 8;
        } else {
            total = 10;
        }

        this.filme.setAvaliacao(total);
    }
    
}
