package SWING.Introduccion.ComponentesJDialogyJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1 extends JFrame
{
    public Panel1()
    {
        setTitle("Soy una ventana :3");
        setBounds(300, 300, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container contenedor = getContentPane();
        //ActionListener acciones = new Acciones();

        JPanel panel = new JPanel();
        panel.setBounds(150, 150, 200, 200);

        Button boton = new Button("Soy el botón");
        Button boton1 = new Button("Soy otro botón");
        //boton1.setActionCommand(acciones);


        boton1.setBounds(100, 100, 100, 50);

        panel.setBackground(Color.yellow);
        panel.add(boton);
        panel.add(boton1);

        contenedor.add(panel);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Panel1();
            }
        });



    }
}
/*
class Acciones implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        //JOptionPane.set
    }
}*/
