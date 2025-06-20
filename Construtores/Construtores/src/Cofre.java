public class Cofre {
    private String senha;
    private double valorGuardado;

    public Cofre() {
    }

    public Cofre(String senha, double valorGuardado) {
        this.senha = senha;
        this.valorGuardado = valorGuardado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getValorGuardado() {
        return valorGuardado;
    }

    public void setValorGuardado(double valorGuardado) {
        this.valorGuardado = valorGuardado;
    }

    public void mostrarValor() {
        System.out.println("O Valor Guardado: " + this.valorGuardado);
    }

    public boolean abrirCofre(String senhaDigitada) {
        
        if(senha.equals(senhaDigitada)){
            System.out.println("Senha Correta! ");
            mostrarValor();
            return true;
            
        }else {
            System.out.println("Senha Invalida");
        }
        return false;
    }
}
