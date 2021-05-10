package SWING.Introduccion.Actividad1y2;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame
{
    public Ventana()
    {
        setVisible(true); //Hace visible la ventana
        setSize(500,600); //Establece el tamaño de la ventana
        setLocationRelativeTo(null); //Establece la posición relativa de la ventana (en este caso aparecerá en el centro: null)
        setResizable(true); //Permite o no que la ventana se pueda hacer más grande o pequeña (en este caso NO)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Que ha de pasar al cerrar la ventana (en este caso el programa termina)
        setTitle("Primera ventana :D"); //Titulo de la ventana

        //Icono
        Toolkit pantalla = Toolkit.getDefaultToolkit();

        Image icono = pantalla.getImage("src/SWING/Introduccion/Actividad1y2/happy.png");
        setIconImage(icono);

        //Texto en la ventana
        Texto texto = new Texto();
        add(texto);
    }
}

//Texto en la ventana
class Texto extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponents(g);

        g.drawString("Hola soy un texto en una ventana", 100, 100);
    }
}

