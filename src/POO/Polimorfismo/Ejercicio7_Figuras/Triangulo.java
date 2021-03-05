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
        return ancho * 3;
    }

    @Override
    public double area() {
        return (ancho * alto) / 2;
    }

    @Override
    public void escalar(double escala) {
        this.ancho *= escala;
        this.alto *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Triangulo de " + ancho + " de ancho y " + alto + " de alto, con perímetro " + perimetro() + " y area " + area());
    }
}
