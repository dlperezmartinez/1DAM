package SWING.MenuMiniCalculadoras;

import java.awt.*;

public class MenuMiniCalculadoras
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana menu = new Ventana();
                menu.setVisible(true);
            }
        });
    }
}
