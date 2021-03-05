package POO.Polimorfismo.LibrosYRevistas;

public class Articulo
{
    //ATRIBUTOS
    protected String codigo, titulo, anyiopublicacion;

    //CONSTRUCTOR
    public Articulo(String codigo, String titulo, String anyiopublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anyiopublicacion = anyiopublicacion;
    }

    //MÉTODOS

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                "titulo='" + titulo + '\'' +
                "anyiopublicacion='" + anyiopublicacion + '\'';
    }
}
