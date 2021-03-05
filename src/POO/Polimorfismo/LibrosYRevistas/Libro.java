package POO.Polimorfismo.LibrosYRevistas;

public class Libro extends Articulo implements iLibro
{
    //ATRIBUTOS
    private boolean prestado;

    //CONSTRUCTOR
    public Libro(String codigo, String titulo, String anyiopublicacion) {
        super(codigo, titulo, anyiopublicacion);
        this.prestado = false;
    }

    //MÉTODOS
    @Override
    public void prestar() {
        prestado = true;

    }

    @Override
    public void retornar() {
        prestado = false;

    }

    @Override
    public void prestado()
    {
        String esta;

        if (prestado)
        {
            esta = " ESTÁ ";
        }
        else
        {
            esta = " NO ESTÁ ";
        }

        System.out.println("El libro con código " + codigo + esta + "prestado.");
    }

    //IMPRESIÓN
    @Override
    public String toString() {
        return super.toString() + "prestado=" + prestado +
                '}';
    }
}
