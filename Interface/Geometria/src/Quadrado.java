public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(){

    }

    public Quadrado(double lado) {
        this.lado = lado;
        
    }

    public double getLado(){
        return lado;

    }

    public void setLado(double lado){
        this.lado = lado;

    }


    @Override
    public double calcularArea(){
        double area = Math.pow(lado, 2);
        return area;
    }

    
}
