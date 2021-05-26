package SWING.MenuMiniCalculadoras.MiniCalculadora2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class Ventana extends JFrame
{
    public Ventana()
    {
        setTitle("MiniCalculadora 2");
        setBounds(500, 200, 350, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);
        setContentPane(panel);

        //VALOR 1
        JLabel valor1 = new JLabel("Valor 1");//TODO me gustaría probar lo de html en documentos JTextPane
        valor1.setBounds(20, 10, 50, 20);
        valor1.setForeground(Color.white);
        panel.add(valor1);

        JTextField inValor1 = new JTextField();
        inValor1.setBounds(20, 30, 50, 20);
        panel.add(inValor1);

        //VALOR 2
        JLabel valor2 = new JLabel("Valor 2");
        valor2.setBounds(20, 60, 50, 20);
        valor2.setForeground(Color.white);
        panel.add(valor2);

        JTextField inValor2 = new JTextField();
        inValor2.setBounds(20, 80, 50, 20);
        panel.add(inValor2);

        //RESULTADO
        JTextPane resultado = new JTextPane();
        resultado.setBackground(Color.white);
        resultado.setBounds(240, 60, 95, 35);
        panel.add(resultado);

        //BOTONES RADIO
        //sumatorio
        JRadioButton sumatorio = new JRadioButton("Sumatorio");
        sumatorio.setBounds((getWidth()/2)-60, 20, 110, 20);
        sumatorio.setBackground(Color.DARK_GRAY);
        sumatorio.setForeground(Color.white);
        panel.add(sumatorio);

        //productorio
        JRadioButton productorio = new JRadioButton("Productorio");
        productorio.setBounds((getWidth()/2)-60, 50, 110, 20);
        productorio.setBackground(Color.DARK_GRAY);
        productorio.setForeground(Color.white);
        panel.add(productorio);

        //exponencial
        JRadioButton exponencial = new JRadioButton("Exponencial");
        exponencial.setBounds((getWidth()/2)-60, 80, 110, 20);
        exponencial.setBackground(Color.DARK_GRAY);
        exponencial.setForeground(Color.white);
        panel.add(exponencial);

        //agrupación
        ButtonGroup bgrupo = new ButtonGroup();
        bgrupo.add(sumatorio);
        bgrupo.add(productorio);
        bgrupo.add(exponencial);

        //BOTÓN CALCULA
        JButton calc = new JButton("Calcular");
        calc.setBounds(getWidth()-110, 20, 95, 25);
        calc.setBackground(Color.DARK_GRAY);
        calc.setForeground(Color.white);
        panel.add(calc);

        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                int valor1,valor2;
                double resultad = 0;

                //Input
                try {
                    valor1 = Integer.parseInt(inValor1.getText());
                }catch (InputMismatchException e)
                {
                    throw e;
                }

                try {
                    valor2 = Integer.parseInt(inValor2.getText());
                }catch (InputMismatchException e)
                {
                    throw e;
                }

                //Calculos
                if (sumatorio.isSelected())
                {
                    for (int i = valor1; i <= valor2; i++)
                    {
                        resultad += i;
                    }
                }

                if (productorio.isSelected())
                {
                    resultad = 1;

                    for (int i = valor1; i <= valor2; i++)
                    {
                        resultad *= i;
                    }
                }

                if (exponencial.isSelected())
                {
                    resultad = Math.pow(valor1, valor2);
                }

                //Conversión del resultado y envío
                String result = String.valueOf(resultad);
                resultado.setText(result);
            }
        });
    }
}
