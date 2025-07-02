import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[10];
        int soma = 0;

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° Número: ");
            numero[i] = sc.nextInt();
            soma += numero[i];
           
        }

        double media = (double) soma / numero.length;

        System.out.println("\nMédia dos Números Digitados: " + media);
        System.out.println("=".repeat(50));
        
        System.out.println("Números Pares: ");
        for (int x = 0; x < numero.length; x++) {
            if(numero[x] % 2 == 0) {
                System.out.print(numero[x] + "... ");
            }
        }

        System.out.println();

        System.out.println("Números Ímpares: ");
        for (int y = 0; y < numero.length; y++) {
            if (numero[y] % 2 != 0) {
                System.out.print(numero[y] + "... ");
            }
        }

        sc.close();
    }
}
