package SWING.ProcesadorDeTexto;

import javax.swing.*;
import java.awt.*;

public class ExploradorDeArchivos extends JFrame
{
    public ExploradorDeArchivos() throws HeadlessException
    {
        Ventana ventana = new Ventana(); //Esto lo uso para poder sacar la X y la Y de la ventana actual del procesador de textos

        setTitle("Axploradó d'arxius");
        setBounds(ventana.getX()+20, ventana.getY()+20, 400, 200);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel();

        JList listaArchivos = new JList();
        setContentPane(listaArchivos);
        //listaArchivos.add();

        //add(listaArchivos);
    }
}
