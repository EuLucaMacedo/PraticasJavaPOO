public class Circulo implements FiguraGeometrica {
    private double raio;


    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public double calcularArea(){

        double area = Math.PI * Math.pow(raio, 2);
        return area;
        
    }

}
