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
            System.out.println("Digite o nome do Aluno que dejesa trocar: ");
            String nomeBusca = leia.nextLine();

            boolean encontrado = false;

            for(int i = 0; i < a.length; i++) {
                if(a[i].getNome().equalsIgnoreCase(nomeBusca)) {
                    System.out.println("Digite o novo Plano para " + a[i].getNome() + ": ");
                    String novoPlano = leia.nextLine();
                    a[i].alterarPlano(novoPlano);
                    System.out.println("Plano Alterado com Sucesso!");
                    encontrado = true;
                    break;
                } 
            }
            if(!encontrado) {
                System.out.println("Aluno não Encontrado! ");
            }

        } else if(respo.equals("2")) {
            System.out.println("Obrigado Por Treinar Conosco!");

        } else {
            System.out.println("Opção Inválida! ");
        }

        leia.close();
    }
}
