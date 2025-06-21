import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Aluno a[]= new Aluno[5];
        

        a[0] = new Aluno("Luca", 27, "Premium");
        a[1] = new Aluno("Anna", 18, "Crossfit");
        a[2] = new Aluno("Alex", 25, "Academia");
        a[3] = new Aluno("Bia", 24, "Natação");
        a[4] = new Aluno("Marcia", 30, "Basic");

        for(int i = 0; i < a.length; i++){
            a[i].exibirStatus();
        }

        System.out.println("================= Trocar Plano ==============");
        System.out.println("Deseja Trocar de Plano? ");
        System.out.println("[ 1 ] SIM");
        System.out.println("[ 2 ] NÂO");
        System.out.println("Escolha uma Opção: ");
        String respo = leia.nextLine();

       
        if(respo.equals("1")) {
            System.out.println("Testando");

        } else if(respo.equals("2")) {
            System.out.println("Obrigado Por Treinar Conosco!");

        } else {
            System.out.println("Opção Inválida! ");
        }
    }
}
