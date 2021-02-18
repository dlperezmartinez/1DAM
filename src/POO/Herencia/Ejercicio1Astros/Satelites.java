package POO.Herencia.Ejercicio1Astros;

public class Satelites extends Astros
{
    //ATRIBUTOS
    private double distanciaPlaneta, orbitaPlanetaria;
    private Planetas planetaOrbita; //Planeta al que orbita

    //CONSTRUCTOR

    public Satelites()
    {
        super();
    }

    public Satelites(String nombre, double radioEcuatorial, double rotacionSobreEje, double gravedad, int temperaturaMedia, double distanciaPlaneta, double orbitaPlanetaria, Planetas planetaOrbita)
    {
        super(nombre, radioEcuatorial, rotacionSobreEje, gravedad, temperaturaMedia);

        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaOrbita = planetaOrbita;
    }


    //GETTERS Y SETTERS
    //getters
    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public Planetas getPlanetaOrbita() {
        return planetaOrbita;
    }

    //setters
    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public void setPlanetaOrbita(Planetas planetaOrbita) {
        this.planetaOrbita = planetaOrbita;
    }

    //METODOS

    //TOSTRING
    @Override
    public String toString() {
        return "\n-SATELITE-\n" +
                "\nNombre: " + nombre +
                "\nradioEcuatorial: " + radioEcuatorial +
                "\nrotacionSobreEje: " + rotacionSobreEje +
                "\ngravedad: " + gravedad +
                "\ntemperaturaMedia: " + temperaturaMedia +
                "\ndistanciaPlaneta: " + distanciaPlaneta +
                "\norbitaPlanetaria: " + orbitaPlanetaria +
                "\nplanetaOrbita: " + planetaOrbita;
    }
}
