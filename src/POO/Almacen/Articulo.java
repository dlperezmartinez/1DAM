package POO.Almacen;

public class Articulo
{
    //ATRIBUTOS
    private String codigo = "LIBRE";
    private String descripcion;
    private double precioCompra, precioVenta;
    private int stock;

    //CONSTRUCTOR
    public Articulo()
    {
        this.descripcion = null;
        this.precioCompra = 0;
        this.precioVenta = 0;
        this.stock = 0;
    }


    //GETTERS Y SETTERS
    //Getters
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
}
