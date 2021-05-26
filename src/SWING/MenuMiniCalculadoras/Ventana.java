package SWING.MenuMiniCalculadoras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener
{
    //VARIABLES
    private JMenuItem miniCalculadora1, miniCalculadora2, miniCalculadora3;

    public Ventana()
    {
        setTitle("MINI CALCULADORAS");
        setBounds(500, 200, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

        miniCalculadora1 = new JMenuItem("Mini Calculadora 1");
        menubar.add(miniCalculadora1);
        miniCalculadora1.addActionListener(this);

        miniCalculadora2 = new JMenuItem("Mini Calculadora 2");
        menubar.add(miniCalculadora2);
        miniCalculadora2.addActionListener(this);

        miniCalculadora3 = new JMenuItem("Mini Calculadora 3");
        menubar.add(miniCalculadora3);
        miniCalculadora3.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent a)
    {
        if (a.getSource() == miniCalculadora1)
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    SWING.MenuMiniCalculadoras.MiniCalculadora.Ventana ventana = new SWING.MenuMiniCalculadoras.MiniCalculadora.Ventana();
                    ventana.setVisible(true);
                    //ventana.setDefaultCloseOperation(); TODO Me gustaría que cuando se cierre esta ventana apareciera de nuevo la principal
                }
            });
        }

        if (a.getSource() == miniCalculadora2)
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    SWING.MenuMiniCalculadoras.MiniCalculadora2.Ventana ventana = new SWING.MenuMiniCalculadoras.MiniCalculadora2.Ventana();
                    ventana.setVisible(true);
                }
            });
        }

        if (a.getSource() == miniCalculadora3)
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    SWING.MenuMiniCalculadoras.MiniCalculadora3.Ventana ventana = new SWING.MenuMiniCalculadoras.MiniCalculadora3.Ventana();
                    ventana.setVisible(true);
                }
            });
        }

        setVisible(false);
    }
}
