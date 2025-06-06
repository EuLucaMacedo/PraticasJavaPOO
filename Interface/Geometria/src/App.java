import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circulo c = new Circulo();
        Quadrado q = new Quadrado();
        Calcular soma = new Calcular();

        
        System.out.print("Digite o Valor do Raio do Circulo para o Calculo: ");
        c.setRaio(s.nextDouble());
        System.out.print("Digite o Valor do Lado do Quadrado para o Calculo: ");
        q.setLado(s.nextDouble());

        System.out.println("Calcular Area do Quadrado: "+ q.calcularArea());
        System.out.println("Calculo da Area do Circulo: " + c.calcularArea());
        System.out.println("A Soma das Areas ... " + soma.somarAreas(q, c));


        s.close();
    }
}