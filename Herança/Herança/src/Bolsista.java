public class Bolsista extends Aluno {
    private float bolsa;

    public Bolsista() {

    }

    public Bolsista(float bolsa) {  
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Bolsa Renovado!\nAtualizar Matriula: " + this.getMatricula());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade Compensada!");
        System.out.println("Dar Baixa no Sistema na Matricula: " + this.getMatricula());
    }

    @Override
    public void cancelarMatricula() {
        super.cancelarMatricula();
    }

    
    
}
