public class App {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Lutador 1", "Brasil", 30, 1.80, 75.0, 10, 2, 1);
        l[1] = new Lutador("Lutador 2", "EUA", 28, 1.85, 80.0, 12, 3, 0);
        l[2] = new Lutador("Lutador 3", "França", 26, 1.75, 70.0, 8, 4, 2);
        l[3] = new Lutador("Lutador 4", "Japão", 32, 1.90, 85.0, 15, 5, 1);
        l[4] = new Lutador("Lutador 5", "Rússia", 29, 1.78, 77.0, 9, 2, 3);
        l[5] = new Lutador("Lutador 6", "Canadá", 31, 1.82, 82.0, 11, 4, 1);
        for (int i = 0; i < l.length; i++) {
            l[i].apresentar();
        }

        
    }
}
