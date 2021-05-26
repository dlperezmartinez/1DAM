package SWING.MenuMiniCalculadoras.MiniCalculadora3;

import POO.CalculadoraNumComplejos.Calculadora;
import POO.CalculadoraNumComplejos.NumerosComplejos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame
{
    public Ventana()
    {
        setTitle("MiniCalculadora3");
        setBounds(500, 200, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Calculadora calculadora = new Calculadora(); //Este objeto es la calculadora del tema POO
        NumerosComplejos resultadoNC = new NumerosComplejos(); //Almacena el resultado de la operación de DOS NumerosComplejos

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);
        setContentPane(panel);

        //NÚMERO COMPLEJO 1
        JLabel numComp1 = new JLabel("Número complejo 1");
        numComp1.setBounds((getWidth()/2)-(150/2), 20, 150, 20);
        numComp1.setForeground(Color.white);
        panel.add(numComp1);

        //real
        JTextField inNumCompR1 = new JTextField();
        inNumCompR1.setBounds(numComp1.getX(), numComp1.getY()+numComp1.getHeight()+10, 60, 20);
        panel.add(inNumCompR1);

        //imaginario
        JTextField inNumCompI1 = new JTextField();
        inNumCompI1.setBounds(inNumCompR1.getX()+inNumCompR1.getWidth()+10, inNumCompR1.getY(), 60, 20);
        panel.add(inNumCompI1);

        //carácteres especiales
        JLabel aParen1 = new JLabel("(");
        aParen1.setBounds(inNumCompR1.getX()-10, inNumCompR1.getY(), 20, 20);
        aParen1.setForeground(Color.white);
        panel.add(aParen1);

        JLabel coma1 = new JLabel(",");
        coma1.setBounds(inNumCompI1.getX()-6, inNumCompR1.getY(), 10, 20);
        coma1.setForeground(Color.white);
        panel.add(coma1);

        JLabel i1 = new JLabel("i");
        i1.setBounds(inNumCompI1.getX()+inNumCompI1.getWidth()+3, inNumCompI1.getY(), 20, 20);
        i1.setForeground(Color.white);
        panel.add(i1);

        JLabel cParen1 = new JLabel(")");
        cParen1.setBounds(inNumCompI1.getX()+inNumCompI1.getWidth()+10, inNumCompI1.getY(), 20, 20);
        cParen1.setForeground(Color.white);
        panel.add(cParen1);

        //NÚMERO COMPLEJO 2
        JLabel numComp2 = new JLabel("Número complejo 2");
        numComp2.setBounds(inNumCompR1.getX(), inNumCompR1.getY()+inNumCompR1.getHeight()+10, 150, 20);
        numComp2.setForeground(Color.white);
        panel.add(numComp2);

        //real
        JTextField inNumCompR2 = new JTextField();
        inNumCompR2.setBounds(numComp2.getX(), numComp2.getY()+numComp2.getHeight()+10, 60, 20);
        panel.add(inNumCompR2);

        //imaginario
        JTextField inNumCompI2 = new JTextField();
        inNumCompI2.setBounds(inNumCompR2.getX()+inNumCompR2.getWidth()+10, inNumCompR2.getY(), 60, 20);
        panel.add(inNumCompI2);

        //carácteres especiales
        JLabel aParen2 = new JLabel("(");
        aParen2.setBounds(inNumCompR2.getX()-10, inNumCompR2.getY(), 20, 20);
        aParen2.setForeground(Color.white);
        panel.add(aParen2);

        JLabel coma2 = new JLabel(",");
        coma2.setBounds(inNumCompI2.getX()-6, inNumCompR2.getY(), 10, 20);
        coma2.setForeground(Color.white);
        panel.add(coma2);

        JLabel i2 = new JLabel("i");
        i2.setBounds(inNumCompI2.getX()+inNumCompI2.getWidth()+3, inNumCompI2.getY(), 20, 20);
        i2.setForeground(Color.white);
        panel.add(i2);

        JLabel cParen2 = new JLabel(")");
        cParen2.setBounds(inNumCompI2.getX()+inNumCompI2.getWidth()+10, inNumCompI2.getY(), 20, 20);
        cParen2.setForeground(Color.white);
        panel.add(cParen2);

        //RESULTADO
        JTextPane resultado = new JTextPane();
        resultado.setBackground(Color.lightGray);
        resultado.setBounds(20, 200, getWidth()-40, 50);
        panel.add(resultado);

        //BOTÓNES DE OPERACIÓN
        //suma
        JButton suma = new JButton();
        suma.setText("+");
        suma.setBounds(50, 150, 45, 25);
        panel.add(suma);

        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Recive el texto de los dos textfield's y los pasa a double, crea el objeto NumerosComplejos que pide dos double's
                NumerosComplejos nc1 = new NumerosComplejos(Double.parseDouble(inNumCompR1.getText()), Double.parseDouble(inNumCompI1.getText()));
                NumerosComplejos nc2 = new NumerosComplejos(Double.parseDouble(inNumCompR2.getText()), Double.parseDouble(inNumCompI2.getText()));

                NumerosComplejos resultad = calculadora.suma(nc1, nc2);

                resultado.setText(resultad.print());
            }
        });

        //resta
        JButton resta = new JButton();
        resta.setText("-");
        resta.setBounds(suma.getX()+suma.getWidth()+5, suma.getY(), 45, 25);
        panel.add(resta);

        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Recive el texto de los dos textfield's y los pasa a double, crea el objeto NumerosComplejos que pide dos double's
                NumerosComplejos nc1 = new NumerosComplejos(Double.parseDouble(inNumCompR1.getText()), Double.parseDouble(inNumCompI1.getText()));
                NumerosComplejos nc2 = new NumerosComplejos(Double.parseDouble(inNumCompR2.getText()), Double.parseDouble(inNumCompI2.getText()));

                NumerosComplejos resultad = calculadora.resta(nc1, nc2);

                resultado.setText(resultad.print());
            }
        });

        //multiplicación
        JButton mult = new JButton();
        mult.setText("x");
        mult.setBounds(resta.getX()+suma.getWidth()+5, suma.getY(), 45, 25);
        panel.add(mult);

        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Recive el texto de los dos textfield's y los pasa a double, crea el objeto NumerosComplejos que pide dos double's
                NumerosComplejos nc1 = new NumerosComplejos(Double.parseDouble(inNumCompR1.getText()), Double.parseDouble(inNumCompI1.getText()));
                NumerosComplejos nc2 = new NumerosComplejos(Double.parseDouble(inNumCompR2.getText()), Double.parseDouble(inNumCompI2.getText()));

                NumerosComplejos resultad = calculadora.multiplicacion(nc1, nc2);

                resultado.setText(resultad.print());
            }
        });

        //división
        JButton div = new JButton();
        div.setText("÷");
        div.setBounds(mult.getX()+suma.getWidth()+5, suma.getY(), 45, 25);
        panel.add(div);

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Recive el texto de los dos textfield's y los pasa a double, crea el objeto NumerosComplejos que pide dos double's
                NumerosComplejos nc1 = new NumerosComplejos(Double.parseDouble(inNumCompR1.getText()), Double.parseDouble(inNumCompI1.getText()));
                NumerosComplejos nc2 = new NumerosComplejos(Double.parseDouble(inNumCompR2.getText()), Double.parseDouble(inNumCompI2.getText()));

                NumerosComplejos resultad = calculadora.division(nc1, nc2);

                resultado.setText(resultad.print());
            }
        });
    }
}
