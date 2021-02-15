package POO.Herencia.Ejercicio2;

public class Astros
{
    //ATRIBUTOS
    protected String nombre;
    protected double radioEcuatorial, rotacionSobreEje, gravedad;
    protected int temperaturaMedia;

    //CONSTRUCTOR
    public Astros()
    {

    }

    public Astros(String nombre, double radioEcuatorial, double rotacionSobreEje, double gravedad, int temperaturaMedia)
    {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionSobreEje = rotacionSobreEje;
        this.gravedad = gravedad;
        this.temperaturaMedia = temperaturaMedia;
    }

    //GETTERS Y SETTERS
    //getters
    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public double getRotacionSobreEje() {
        return rotacionSobreEje;
    }

    public double getGravedad() {
        return gravedad;
    }

    public int getTemperaturaMedia() {
        return temperaturaMedia;
    }

    //setters
    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public void setRotacionSobreEje(double rotacionSobreEje) {
        this.rotacionSobreEje = rotacionSobreEje;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public void setTemperaturaMedia(int temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    //METODOS

    //TOSTRING
    @Override
    public String toString() {
        return "-ASTRO " +
                "\nradioEcuatorial: " + radioEcuatorial +
                "\nrotacionSobreEje: " + rotacionSobreEje +
                "\ngravedad: " + gravedad +
                "\ntemperaturaMedia: " + temperaturaMedia;
    }
}
