import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
        int[] numero = new int[10];
        int buscar;
        int contador = 0;
       for( int i = 0; i < numero.length; i++) {
         System.out.println("Digite o " + (i + 1) + "° número: ");
         numero[i] = s.nextInt();
        }

        System.out.println("Digite o Número que deseja Buscar: ");
        buscar = s.nextInt();
        s.nextLine();

        for (int x = 0; x < numero.length; x++) {
            if(numero[x] == buscar){
                contador++;
            }
        }
        if(contador == 0) {
            System.out.println("O Número não esta na Lista de Vetores!");
        }else {
            System.out.println("O Número está na Lista e Aparece " + contador + " vez(es) na Lista!");
        }
        
        


        s.close();
    }
}
