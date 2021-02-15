package POO.Herencia.Ejercicio2;

public class Planetas extends Astros
{
    //ATRIBUTOS
    private double distanciaSol, orbitaSol;
    private boolean tieneSatelites; //Tiene o no satelites

    //CONSTRUCTOR
    public Planetas(String nombre, double radioEcuatorial, double rotacionSobreEje, double gravedad, int temperaturaMedia, double distanciaSol, double orbitaSol, boolean tieneSatelites)
    {
        super(nombre, radioEcuatorial, rotacionSobreEje, gravedad, temperaturaMedia);

        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
    }


    //GETTERS Y SETTERS
    //getters
    public double getDistanciaSol() {
        return distanciaSol;
    }

    public double getOrbitaSol() {
        return orbitaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    //setters
    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public void setOrbitaSol(double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    //METODOS

    //TOSTRING
    @Override
    public String toString() {
        return "Planetas{" +
                "radioEcuatorial=" + radioEcuatorial +
                ", rotacionSobreEje=" + rotacionSobreEje +
                ", gravedad=" + gravedad +
                ", temperaturaMedia=" + temperaturaMedia +
                ", distanciaSol=" + distanciaSol +
                ", orbitaSol=" + orbitaSol +
                ", tieneSatelites=" + tieneSatelites;

        /*TODO if (tieneSatelites)
        {
            //TODO return
        }*/
    }
}
