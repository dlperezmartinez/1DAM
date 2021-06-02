package SWING.ProcesadorDeTexto;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraMenu extends JMenuBar implements ActionListener
{
    //VARIABLES
    private JMenu arxiu, edita, ajuda;
    private JMenuItem obri, desa, tanca, workingprogress, teFots;
    private JToggleButton negreta, cursiva, sub;

    public BarraMenu()
    {
        //BARRA DE MENÚ

        //ITEMS
        /*****ARXIU*****/
        arxiu = new JMenu("Arxiu");
        add(arxiu);

        //obri
        arxiu.add(obri = new JMenuItem("Obri"));
        obri.addActionListener(this);

        //desa
        arxiu.add(desa = new JMenuItem("Desa"));
        desa.addActionListener(this);

        //tanca
        arxiu.add(tanca = new JMenuItem("Tanca"));
        tanca.addActionListener(this);
        /*****ARXIU*****/

        /*****EDITA*****/
        edita = new JMenu("Edita");
        add(edita);

        //workingprogress
        edita.add(workingprogress = new JMenuItem("Working progres..."));
        /*****EDITA*****/

        /*****AJUDA*****/
        ajuda = new JMenu("Ajuda");
        add(ajuda);

        ajuda.add(teFots = new JMenuItem("Te fots que no nya"));
        /*****AJUDA*****/

        negreta = new JToggleButton("N");
        add(negreta);

        cursiva = new JToggleButton("K");
        add(cursiva);

        sub = new JToggleButton("S");
        add(sub);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == obri)
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    //ExploradorDeArchivos expl = new ExploradorDeArchivos();
                    FileTree3 expl = new FileTree3();
                    expl.setVisible(true);
                }
            });
        }

        if (a.getSource() == desa)
        {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {

                }
            });
        }
    }
}
