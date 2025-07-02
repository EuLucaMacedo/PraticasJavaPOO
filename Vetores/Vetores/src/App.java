import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
            Scanner s = new Scanner(System.in);

        String[] aluno = new String[5];
        double[] notas01 = new double[5];
        double[] notas02 = new double[5];
        int cont = 0;

        for (int i = 0; i < aluno.length; i++) {
            System.out.print("Nome do Aluno: ");
            aluno[i] = s.nextLine();

            System.out.print("Nota 01: ");
            notas01[i] = s.nextDouble();

            System.out.print("Nota 02: ");
            notas02[i] = s.nextDouble();
            s.nextLine();

            if ((notas01[i] + notas02[i]) / 2 >= 7) {
                cont++;
            }
            System.out.println("=".repeat(50));
        }

        System.out.println("=".repeat(50));
        System.out.println("\n== Médias dos Alunos ==");
        for (int x = 0; x < aluno.length; x++) {
            double media = (notas01[x] + notas02[x])/ 2;
            System.out.println(aluno[x] + " = " + media);
        }

        System.out.println(cont + " Alunos atingiram a Nota Maior que 7");

        s.close();
    }
}
