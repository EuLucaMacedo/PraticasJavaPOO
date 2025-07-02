import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int [] numero = new int[7];
        int soma = 0;
        int maior = 0;
        int menor = 0;
        

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º Número: ");
            numero[i] = sc.nextInt();
            soma += numero[i];
            

            if (i == 0) {
                menor = numero[i];
                maior = numero[i];
            }

            if (numero[i] > maior) {
                maior = numero[i];
            } else if (numero[i] < menor) {
                menor = numero[i];
            }
        }
        
        System.out.println("=".repeat(50));

        System.out.println("Números Digitados: ");
        for (int x = 0; x < numero.length; x++){
            System.out.println(numero[x] + "... ");
        }

        System.out.println("=".repeat(50));

        double media = (double) soma / numero.length;

        System.out.println("Menor Número: " + menor);
        System.out.println("Maior Número: " + maior);
        System.out.printf("Média dos Números: %.2f\n",  media);

        sc.close();
    }
}
