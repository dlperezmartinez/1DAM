package POO.Polimorfismo.Ejercicio7_Figuras;

public class Rectangulo implements iFigura2D
{
    //ATRIBUTOS
    private double ancho, alto;

    //CONSTRUCTOR
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    //MÉTODOS
    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public void escalar(double escala) {
        this.ancho *= escala;
        this.alto *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Rectángulo de " + ancho + " de ancho y " + alto + " de alto, con perímetro " + perimetro() + " y area " + area());
    }
}
