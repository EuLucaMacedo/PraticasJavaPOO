import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && !l1.equals(l2)) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;

        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovado) {
            System.out.println("------- Desafiado --------");
            this.desafiado.apresentar();
            System.out.println("-------- Desafiante ----------");
            this.desafiante.apresentar();

            Random ale = new Random();
            int vencedor = ale.nextInt(3);
            System.out.println("----------------------------------");
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();

                    this.desafiado.status();
                    this.desafiante.status();
                    break;

                case 1:
                    System.out.println("Ganhador " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();

                    this.desafiado.status();
                    break;

                case 2:
                    System.out.println("Ganhador " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();

                    this.desafiante.status();
                    break;

                default:
                    System.out.println("Luta Invalida!");
                    break;
            }
            
        } else {
            System.err.println("Luta não pode Accontecer!");
        }
    }
}
