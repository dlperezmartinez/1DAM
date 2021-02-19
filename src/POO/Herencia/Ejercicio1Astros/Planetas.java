package POO.Herencia.Ejercicio1Astros;

import java.util.ArrayList;

public class Planetas extends Astros
{
    //ARRAYLIST
    ArrayList<Satelites> satelites;

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
        this.satelites = new ArrayList<>();
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
    public void agregarSatelite(Satelites nombre)
    {
        satelites.add(nombre);
    }

    //TOSTRING
    @Override
    public void print() {
        if (this.tieneSatelites)
         {
             System.out.print(  "\n-PLANETA-\n" +
                    "\nNombre: " + nombre +
                    "\nradioEcuatorial: " + radioEcuatorial +
                    "\nrotacionSobreEje: " + rotacionSobreEje +
                    "\ngravedad: " + gravedad +
                    "\ntemperaturaMedia: " + temperaturaMedia +
                    "\ndistanciaSol: " + distanciaSol +
                    "\norbitaSol: " + orbitaSol +
                    "\ntieneSatelites: " + tieneSatelites +
                    "\n-LISTA SATELITES-\n");
             System.out.println();

            for (Satelites n : satelites)
            {
                System.out.println( n.getNombre());
            }


        }
        else
        {
            System.out.println(  "\n-PLANETA-\n" +
                    "\nNombre: " + nombre +
                    "\nradioEcuatorial: " + radioEcuatorial +
                    "\nrotacionSobreEje: " + rotacionSobreEje +
                    "\ngravedad: " + gravedad +
                    "\ntemperaturaMedia: " + temperaturaMedia +
                    "\ndistanciaSol: " + distanciaSol +
                    "\norbitaSol: " + orbitaSol +
                    "\ntieneSatelites: " + tieneSatelites);
        }
    }
}
