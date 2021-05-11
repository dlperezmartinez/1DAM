package SWING.Introduccion.ComponentesJDialogyJPanel;

import javax.swing.*;

public class Dialog1 extends JFrame
{
    public Dialog1()
    {
        setVisible(true);
        setSize(300, 200);

        JDialog dialogo1 = new JDialog(this, true);
        dialogo1.setTitle("Dialogo 1");
        dialogo1.setSize(100, 100);
        dialogo1.setVisible(true);

    }
}

class DialogCaller
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Dialog1();
            }
        });
    }
}