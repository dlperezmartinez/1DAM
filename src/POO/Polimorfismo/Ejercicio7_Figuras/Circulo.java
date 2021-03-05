package POO.Polimorfismo.Ejercicio7_Figuras;

public class Circulo implements iFigura2D
{
    //ATRIBUTOS
    private double radio;

    //CONSTRUCTOR
    public Circulo(double radio) {
        this.radio = radio;
    }

    //MÉTODOS

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void escalar(double escala) {
        this.radio *= escala;
    }

    @Override
    public void imprimir() {
        System.out.println("Circunferencia de " + radio + " de radio con perímetro " + perimetro() + " y area " + area());
    }
}
