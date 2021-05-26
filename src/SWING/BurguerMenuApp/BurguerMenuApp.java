package SWING.BurguerMenuApp;

import javax.swing.*;
import java.awt.*;

public class BurguerMenuApp
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana ventana = new Ventana();
                ventana.setVisible(true);
            }
        });
    }
}

class Ventana extends JFrame
{
    public Ventana ()
    {
        setTitle("Pedido");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(400, 200, 440, 500);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);
        setContentPane(panel);

        //MENÚ BÁSICO
        JLabel menuBasico = new JLabel("Menú básico 8€");
        menuBasico.setBounds(10, 10, 300, 30);
        menuBasico.setForeground(Color.white);
        panel.add(menuBasico);

        /********************HAMBURGUESA********************/
        //HAMBURGUESA
        JLabel hamburguesa = new JLabel("Hamburguesa");
        hamburguesa.setBounds(menuBasico.getX(), menuBasico.getY()+30, 100, 20);
        hamburguesa.setForeground(Color.white);
        panel.add(hamburguesa);

        //pollo
        JRadioButton pollo = new JRadioButton("Pollo");
        pollo.setBounds(5, 5, 120, 20);
        pollo.setBackground(Color.DARK_GRAY);
        pollo.setForeground(Color.white);
        panel.add(pollo);

        //cerdo
        JRadioButton cerdo = new JRadioButton("Cerdo");
        cerdo.setBounds(pollo.getX(), pollo.getY()+20, 120, 20);
        cerdo.setBackground(Color.DARK_GRAY);
        cerdo.setForeground(Color.white);
        panel.add(cerdo);

        //ternera
        JRadioButton ternera = new JRadioButton("Ternera +1€");
        ternera.setBounds(cerdo.getX(), cerdo.getY()+20, 120, 20);
        ternera.setBackground(Color.DARK_GRAY);
        ternera.setForeground(Color.white);
        panel.add(ternera);

        //vegana
        JRadioButton vegana = new JRadioButton("Vegana +1€");
        vegana.setBounds(ternera.getX(), ternera.getY()+20, 120, 20);
        vegana.setBackground(Color.DARK_GRAY);
        vegana.setForeground(Color.white);
        panel.add(vegana);

        //GROUP
        ButtonGroup hamburguesaGroup = new ButtonGroup();
        hamburguesaGroup.add(pollo);
        hamburguesaGroup.add(cerdo);
        hamburguesaGroup.add(ternera);
        hamburguesaGroup.add(vegana);

        //BORDE
        JPanel hamburguesaPane = new JPanel();
        hamburguesaPane.setBorder(BorderFactory.createLineBorder(Color.white));
        hamburguesaPane.setBounds(hamburguesa.getX(), hamburguesa.getY()+30, 130, 90);
        hamburguesaPane.setBackground(Color.DARK_GRAY);
        hamburguesaPane.setLayout(null);
        hamburguesaPane.add(pollo);
        hamburguesaPane.add(cerdo);
        hamburguesaPane.add(ternera);
        hamburguesaPane.add(vegana);
        panel.add(hamburguesaPane);
        /********************HAMBURGUESA********************/

        /********************PAN********************/
        //PAN
        JLabel pan = new JLabel("Pan");
        pan.setBounds(hamburguesa.getX()+hamburguesaPane.getWidth()+15, menuBasico.getY()+30, 100, 20);
        pan.setForeground(Color.white);
        panel.add(pan);

        //normal
        JRadioButton normal = new JRadioButton("Normal");
        normal.setBounds(5, 15, 120, 20);
        normal.setBackground(Color.DARK_GRAY);
        normal.setForeground(Color.white);
        panel.add(normal);

        //integral
        JRadioButton integral = new JRadioButton("Integral");
        integral.setBounds(normal.getX(), normal.getY()+20, 120, 20);
        integral.setBackground(Color.DARK_GRAY);
        integral.setForeground(Color.white);
        panel.add(integral);

        //centeno
        JRadioButton centeno = new JRadioButton("Centeno");
        centeno.setBounds(integral.getX(), integral.getY()+20, 120, 20);
        centeno.setBackground(Color.DARK_GRAY);
        centeno.setForeground(Color.white);
        panel.add(centeno);

        //GROUP
        ButtonGroup panGroup = new ButtonGroup();
        panGroup.add(normal);
        panGroup.add(integral);
        panGroup.add(centeno);

        //BORDE
        JPanel panPane = new JPanel();
        panPane.setBorder(BorderFactory.createLineBorder(Color.white));
        panPane.setBounds(pan.getX(), pan.getY()+30, 130, 90);
        panPane.setBackground(Color.DARK_GRAY);
        panPane.setLayout(null);
        panPane.add(normal);
        panPane.add(integral);
        panPane.add(centeno);
        panel.add(panPane);
        /********************PAN********************/

        /********************PATATAS********************/
        //PAN
        JLabel patatas = new JLabel("Patatas");
        patatas.setBounds(pan.getX()+panPane.getWidth()+15, menuBasico.getY()+30, 100, 20);
        patatas.setForeground(Color.white);
        panel.add(patatas);

        //fritas
        JRadioButton fritas = new JRadioButton("Fritas");
        fritas.setBounds(5, 15, 120, 20);
        fritas.setBackground(Color.DARK_GRAY);
        fritas.setForeground(Color.white);
        panel.add(fritas);

        //gajo
        JRadioButton gajo = new JRadioButton("Gajo");
        gajo.setBounds(fritas.getX(), fritas.getY()+20, 120, 20);
        gajo.setBackground(Color.DARK_GRAY);
        gajo.setForeground(Color.white);
        panel.add(gajo);

        //carseras
        JRadioButton caseras = new JRadioButton("Caseras +1€");
        caseras.setBounds(gajo.getX(), gajo.getY()+20, 120, 20);
        caseras.setBackground(Color.DARK_GRAY);
        caseras.setForeground(Color.white);
        panel.add(caseras);

        //GROUP
        ButtonGroup patatasGroup = new ButtonGroup();
        patatasGroup.add(fritas);
        patatasGroup.add(gajo);
        patatasGroup.add(caseras);

        //BORDE
        JPanel patatasPane = new JPanel();
        patatasPane.setBorder(BorderFactory.createLineBorder(Color.white));
        patatasPane.setBounds(patatas.getX(), patatas.getY()+30, 130, 90);
        patatasPane.setBackground(Color.DARK_GRAY);
        patatasPane.setLayout(null);
        patatasPane.add(fritas);
        patatasPane.add(gajo);
        patatasPane.add(caseras);
        panel.add(patatasPane);
        /********************PATATAS********************/

        /********************BEBIDA********************/
        //BEBIDA
        JLabel bebida = new JLabel("Bebida");
        bebida.setBounds(hamburguesaPane.getX(), hamburguesaPane.getY()+hamburguesaPane.getHeight()+10, 200, 20);
        bebida.setForeground(Color.white);
        panel.add(bebida);

        //cola
        JRadioButton cola = new JRadioButton("Cola");
        cola.setBounds(5, 10, 60, 20);
        cola.setBackground(Color.DARK_GRAY);
        cola.setForeground(Color.white);
        panel.add(cola);

        //naranja
        JRadioButton naranja = new JRadioButton("Naranja");
        naranja.setBounds(cola.getX()+cola.getWidth()+5, cola.getY(), 90, 20);
        naranja.setBackground(Color.DARK_GRAY);
        naranja.setForeground(Color.white);
        panel.add(naranja);

        //limón
        JRadioButton limon = new JRadioButton("Limón");
        limon.setBounds(naranja.getX()+naranja.getWidth()+5, cola.getY(), 80, 20);
        limon.setBackground(Color.DARK_GRAY);
        limon.setForeground(Color.white);
        panel.add(limon);

        //agua
        JRadioButton agua = new JRadioButton("Agua");
        agua.setBounds(limon.getX()+limon.getWidth()+5, cola.getY(), 70, 20);
        agua.setBackground(Color.DARK_GRAY);
        agua.setForeground(Color.white);
        panel.add(agua);

        //cerveza
        JRadioButton cerveza = new JRadioButton("Cerveza");
        cerveza.setBounds(agua.getX()+agua.getWidth()+5, cola.getY(), 90, 20);
        cerveza.setBackground(Color.DARK_GRAY);
        cerveza.setForeground(Color.white);
        panel.add(cerveza);

        //GROUP
        ButtonGroup bebidaGroup = new ButtonGroup();
        bebidaGroup.add(cola);
        bebidaGroup.add(naranja);
        bebidaGroup.add(limon);
        bebidaGroup.add(agua);
        bebidaGroup.add(cerveza);

        //BORDE
        JPanel bebidaPane = new JPanel();
        bebidaPane.setBorder(BorderFactory.createLineBorder(Color.white));
        bebidaPane.setBounds(bebida.getX(), bebida.getY()+30, hamburguesaPane.getWidth()+hamburguesaPane.getWidth()+patatasPane.getWidth()+30, 40);
        bebidaPane.setBackground(Color.DARK_GRAY);
        bebidaPane.setLayout(null);
        bebidaPane.add(cola);
        bebidaPane.add(naranja);
        bebidaPane.add(limon);
        bebidaPane.add(agua);
        bebidaPane.add(cerveza);
        panel.add(bebidaPane);
        /********************BEBIDA********************/

        /********************EXTRA********************/
        //EXTRAS
        JLabel extras = new JLabel("Extras");
        extras.setBounds(bebidaPane.getX(), bebidaPane.getY()+bebidaPane.getHeight()+10, 200, 20);
        extras.setForeground(Color.white);
        panel.add(extras);

        //hamburguesa doble
        JCheckBox hamburguesaDoble = new JCheckBox("Hamburguesa doble +2€");
        hamburguesaDoble.setBounds(5, 10, 200, 20);
        hamburguesaDoble.setBackground(Color.DARK_GRAY);
        hamburguesaDoble.setForeground(Color.white);
        panel.add(hamburguesaDoble);

        //extra queso
        JCheckBox extraQueso = new JCheckBox("Extra de queso +0.50€");
        extraQueso.setBounds(hamburguesaDoble.getX(), hamburguesaDoble.getY()+30, 200, 20);
        extraQueso.setBackground(Color.DARK_GRAY);
        extraQueso.setForeground(Color.white);
        panel.add(extraQueso);

        //extra patatas
        JCheckBox extraPatatas = new JCheckBox("Extra de patatas +1€");
        extraPatatas.setBounds(extraQueso.getX(), extraQueso.getY()+30, 200, 20);
        extraPatatas.setBackground(Color.DARK_GRAY);
        extraPatatas.setForeground(Color.white);
        panel.add(extraPatatas);

        //BORDE
        JPanel extrasPane = new JPanel();
        extrasPane.setBorder(BorderFactory.createLineBorder(Color.white));
        extrasPane.setBounds(extras.getX(), extras.getY()+30, (bebidaPane.getWidth()/2)-4, 100);
        extrasPane.setBackground(Color.DARK_GRAY);
        extrasPane.setLayout(null);
        extrasPane.add(hamburguesaDoble);
        extrasPane.add(extraQueso);
        extrasPane.add(extraPatatas);
        panel.add(extrasPane);
        /********************EXTRAS********************/

        /********************SALSAS********************/
        //BORDE
        JPanel salsasPane = new JPanel();
        salsasPane.setBorder(BorderFactory.createLineBorder(Color.white));
        salsasPane.setBounds(extrasPane.getX()+extrasPane.getWidth()+8, extrasPane.getY(), (bebidaPane.getWidth()/2)-4, 100);
        salsasPane.setBackground(Color.DARK_GRAY);
        salsasPane.setLayout(null);
        //-- Aquí irían los add's pero los tengo que poner más abajo
        panel.add(salsasPane);

        //SALSAS
        JLabel salsas = new JLabel("Salsas");
        salsas.setBounds(salsasPane.getX(), extras.getY(), 200, 20);
        salsas.setForeground(Color.white);
        panel.add(salsas);

        //Ketchup
        JLabel ketchup = new JLabel("Ketchup");
        ketchup.setBounds(30, 2, 80, 20);
        ketchup.setForeground(Color.white);
        JSpinner ketchupSp = new JSpinner();
        ketchupSp.setBounds(ketchup.getX()+ketchup.getWidth()+5, ketchup.getY(), 60, 20);
        panel.add(ketchup);
        panel.add(ketchupSp);

        //barbacoa
        JLabel barbacoa = new JLabel("Barbacoa");
        barbacoa.setBounds(ketchup.getX(), ketchup.getY()+25, 80, 20);
        barbacoa.setForeground(Color.white);
        JSpinner barbacoaSp = new JSpinner();
        barbacoaSp.setBounds(barbacoa.getX()+barbacoa.getWidth()+5, barbacoa.getY(), 60, 20);
        panel.add(barbacoa);
        panel.add(barbacoaSp);

        //mostaza
        JLabel mostaza = new JLabel("Mostaza");
        mostaza.setBounds(barbacoa.getX(), barbacoa.getY()+25, 80, 20);
        mostaza.setForeground(Color.white);
        JSpinner mostazaSp = new JSpinner();
        mostazaSp.setBounds(mostaza.getX()+mostaza.getWidth()+5, mostaza.getY(), 60, 20);
        panel.add(mostaza);
        panel.add(mostazaSp);

        //mayonesa
        JLabel mayonesa = new JLabel("Mayonesa");
        mayonesa.setBounds(mostaza.getX(), mostaza.getY()+25, 80, 20);
        mayonesa.setForeground(Color.white);
        JSpinner mayonesaSp = new JSpinner();
        mayonesaSp.setBounds(mayonesa.getX()+mayonesa.getWidth()+5, mayonesa.getY(), 60, 20);
        panel.add(mayonesa);
        panel.add(mayonesaSp);

        //-- Los add's
        salsasPane.add(ketchup);
        salsasPane.add(ketchupSp);
        salsasPane.add(barbacoa);
        salsasPane.add(barbacoaSp);
        salsasPane.add(mostaza);
        salsasPane.add(mostazaSp);
        salsasPane.add(mayonesa);
        salsasPane.add(mayonesaSp);
        /********************SALSAS********************/
    }
}
