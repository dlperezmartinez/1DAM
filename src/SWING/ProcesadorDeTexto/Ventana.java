package SWING.ProcesadorDeTexto;

import javax.swing.*;

public class Ventana extends JFrame
{
    public Ventana()
    {
        setTitle("PROSESAOR DA TAXTOS");
        setBounds(400, 100, 600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);;
        setLayout(null);
        setVisible(true);

        //BARRA DE MENÚ
        BarraMenu barraMenu = new BarraMenu();
        setJMenuBar(barraMenu);

        //CAJA DE TEXTO
        JTextPane caixa = new JTextPane();
        setContentPane(caixa);

    }
}
