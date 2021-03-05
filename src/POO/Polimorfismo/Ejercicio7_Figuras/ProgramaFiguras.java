package POO.Polimorfismo.Ejercicio7_Figuras;

import java.util.ArrayList;

public class ProgramaFiguras
{
    public static void main(String[] args)
    {
        ArrayList<iFigura2D> figuras = new ArrayList<>();

        //INSTANCIAS
        Cuadrado cuadrado1 = new Cuadrado(23);

        Rectangulo rectangulo1 = new Rectangulo(12, 23);

        Triangulo triangulo1 = new Triangulo(32, 43);

        Circulo circulo1 = new Circulo(23);

        //OPERACIONES
        //Imprimir 1
        System.out.println("\n-IMPRIMIR 1-\n");

        cuadrado1.imprimir();

        rectangulo1.imprimir();

        triangulo1.imprimir();

        circulo1.imprimir();

        //Escalado
        System.out.println("\nEscalando...\n");

        cuadrado1.escalar(2);

        rectangulo1.escalar(2);

        triangulo1.escalar(2);

        circulo1.escalar(2);

        System.out.println("\nSe han escaldo las figuras.\n");

        //Imprimir 2
        System.out.println("\n-IMPRIMIR 2-\n");

        cuadrado1.imprimir();

        rectangulo1.imprimir();

        triangulo1.imprimir();

        circulo1.imprimir();

        //Escalado
        System.out.println("\nEscalando...\n");

        cuadrado1.escalar(0.1);

        rectangulo1.escalar(0.1);

        triangulo1.escalar(0.1);

        circulo1.escalar(0.1);

        System.out.println("\nSe han escaldo las figuras.\n");

        //Imprimir 3
        System.out.println("\n-IMPRIMIR 3-\n");

        cuadrado1.imprimir();

        rectangulo1.imprimir();

        triangulo1.imprimir();

        circulo1.imprimir();
    }
}
