package POO.GatoSimple;

public class GatoSimple
{
    //ATRIBUTOS
    private  String nombre, color, sexo;
    private int edad;
    private double peso;

    //CONSTRUCTOR
    public GatoSimple()
    {
        this.nombre = null;
        this.color = null;
        this.sexo = null;
        this.edad = 0;
        this.peso = 0;
    }

    //GETTERS Y SETTERS
    //Getters
    public String getColor() {
        return color;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //METODOS
    public String maullar() //El gato dice maulla
    {
        int miau = (int) (Math.random()*100+0); //Pequeña variante para que hayan dos formas de maullar

        if(miau < 50)
        {
            return "Miau..";
        }
        else
        {
            return "Miau!";
        }
    }

    public String ronronear() //El gato ronronea
    {
        return "Grrr....";
    }

    public String comer(String comida) //El gato come
    {
        boolean pescado = false;
        int j = 6;

        for (int i = 0; i < comida.length(); i++) //Detector de la palabra "pescado"
        {
            if (comida.substring(i, j) == "pescado")
            {
                pescado = true;
            }
            j++;
        }

        if (pescado) //Le das pescado para comer
        {
            return "Ñam ñam...";
        }
        else //Le das otra cosa
        {
            return "Miau, solo como miaupescado...";
        }
    }

    public String pelear(GatoSimple gato)
    {
        if (this.sexo == "macho" && gato.sexo == "macho")
        {
            return "Se han peleado";
        }
        else
        {
            return "No peleo con hembras";
        }
    }


}
