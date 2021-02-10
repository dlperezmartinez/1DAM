package POO.Almacen;

public class Articulo
{
    //ATRIBUTOS
    private String nombre = null;
    private String codigo;
    private String descripcion;
    private double precioCompra, precioVenta;
    private int stock;

    //CONSTRUCTOR
    /*public Articulo()
    {
        this.nombre = null;
        this.codigo = null;
        this.descripcion = null;
        this.precioCompra = 0;
        this.precioVenta = 0;
        this.stock = 0;
    }*/

    public Articulo(String nombre, String codigo, String descripcion, double precioCompra, double precioVenta, int stock)
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    //GETTERS Y SETTERS
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //METODOS
    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", stock=" + stock +
                '}';
    }
}
