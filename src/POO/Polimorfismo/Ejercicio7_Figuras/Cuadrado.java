package POO.Polimorfismo.Ejercicio7_Figuras;

public class Cuadrado implements iFigura2D
{
    //ATRIBUTOS
    private double lados;

    //CONSTRUCTOR
    public Cuadrado(double lados) {
        this.lados = lados;
    }

    //MÉTODOS
    @Override
    public double perimetro() {
        return lados * 4;
    }

    @Override
    public double area() {
        return Math.pow(lados, 2);
    }

    @Override
    public void escalar(double escala) {
        this.lados *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Cuadrado con lados de tamaño " + lados + ", perímetro " +  perimetro() + " y area " + area());
    }
}
