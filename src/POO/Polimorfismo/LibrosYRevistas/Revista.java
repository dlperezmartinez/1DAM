package POO.Polimorfismo.LibrosYRevistas;

public class Revista extends Articulo
{
    //ATRIBUTOS
    private int numero;

    //CONSTRUCTOR
    public Revista(String codigo, String titulo, String anyiopublicacion, int numero) {
        super(codigo, titulo, anyiopublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "numero=" + numero +
                '}';
    }
}
