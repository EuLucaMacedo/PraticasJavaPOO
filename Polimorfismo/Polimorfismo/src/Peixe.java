public class Peixe extends Animal{
    private String corEscama;

    public Peixe(String corEscama) {
        this.corEscama = corEscama;
    }

    public Peixe() {
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolha() {
        System.out.println("Soltando Bolhas! ");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimento Aquatico!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sons Sonares! ");
    }


}
