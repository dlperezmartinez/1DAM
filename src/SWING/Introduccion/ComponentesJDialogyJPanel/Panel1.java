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

        JPanel panel = new JPanel();
        panel.setBounds(150, 150, 200, 200);
        panel.setLayout(null);

        JButton boton = new JButton("Soy el botón");
        boton.setBounds(panel.getX()/2, panel.getY()/2, 100, 30);

        Button boton1 = new Button("Soy otro botón");
        boton1.setBounds(boton.getX()*3, boton.getY(), 100, 30);
        boton1.setBackground(Color.gray);

        //Acciones al pulsar el botón
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                JOptionPane.showMessageDialog(getParent(), "Me has pulsado D:");
            }
        });

        panel.setBackground(Color.lightGray);
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
