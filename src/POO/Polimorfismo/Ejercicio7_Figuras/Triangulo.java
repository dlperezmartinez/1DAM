package POO.Polimorfismo.Ejercicio7_Figuras;

public class Triangulo implements iFigura2D
{
    //ATRIBUTOS
    private double ancho, alto;

    //CONSTRUCTOR
    public Triangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    //MÉTODOS
    @Override
    public double perimetro() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void escalar(double escala) {

    }

    @Override
    public void imprimir() {

    }
}
