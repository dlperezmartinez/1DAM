package SWING.MenuMiniCalculadoras;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame
{
    public Ventana()
    {
        setTitle("MINI CALCULADORAS");
        setBounds(500, 200, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);
        setContentPane(panel);

        Menu menu = new Menu();
        menu.setVisible(true);
        panel.add(menu);
        //MENÚ
        var menuBar = new JMenuBar();
        panel.add(menuBar);
    }
}
