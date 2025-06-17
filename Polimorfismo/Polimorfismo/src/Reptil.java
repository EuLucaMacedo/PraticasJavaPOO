public class Reptil extends Animal {
    private String corEscama;

    public Reptil() {

    }

    public Reptil(String corEscama) {

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() { 
        System.out.println("Rastejando! ");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimento Variavel! ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons Variados! ");
    }

}
