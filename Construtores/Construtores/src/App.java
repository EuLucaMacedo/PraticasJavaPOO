import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Cofre c = new Cofre("Acb123", 1500);

        int tentativa = 1;
        boolean acerto = false;

        while (tentativa <= 3 && !acerto) {
            System.out.print("Digite a Senha do Cofre: ");
            String senhaDigitada = leia.nextLine();
            acerto = c.abrirCofre(senhaDigitada);
            tentativa ++;
            
        }
        
        if(!acerto) {
            System.out.println("Acesso bloqueado. Tentativas esgotadas.");
        }
        
        leia.close();
    }
}
