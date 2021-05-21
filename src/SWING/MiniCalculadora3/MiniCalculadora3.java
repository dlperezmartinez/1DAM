package SWING.MiniCalculadora3;

import javax.swing.*;
import java.awt.*;

public class MiniCalculadora3
{
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana ventana = new Ventana();
                ventana.setVisible(true);
            }
        });
    }
}
