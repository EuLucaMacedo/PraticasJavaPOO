public class Calcular {

    public double somarAreas(FiguraGeometrica figuraA, FiguraGeometrica figuraB){
        double totalArea = figuraA.calcularArea() + figuraB.calcularArea();
        return totalArea;
    }

}
