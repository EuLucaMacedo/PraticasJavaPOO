public class Ave extends Animal{
    private String corPena;
    
    public Ave() {
    }

    public Ave(String corPena) {
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void fazerNinho() {
        System.out.println("Construindo Ninho! ");
    }

    @Override
    public void locomover() {
        System.out.println("Voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Insetos e frutas! ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cantalorando! ");
    }
}
