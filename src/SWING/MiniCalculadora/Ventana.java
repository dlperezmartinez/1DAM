package SWING.MiniCalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame
{
    public Ventana()
    {
        setTitle("MiniCalculadora");
        setBounds(500, 200, 230, 250);
        //setIconImage("Calcular.png");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setLayout(null);
        setContentPane(panel);

        //VALOR 1
        JLabel valor1 = new JLabel("Valor 1");
        valor1.setBounds(50, 10, 50, 20);
        panel.add(valor1);

        JTextField inValor1 = new JTextField();
        inValor1.setBounds(50, 30, 50, 20);
        panel.add(inValor1);

        //VALOR 2
        JLabel valor2 = new JLabel("Valor 2");
        valor2.setBounds(getWidth()-100, 10, 50, 20);
        panel.add(valor2);

        JTextField inValor2 = new JTextField();
        inValor2.setBounds(getWidth()-100, 30, 50, 20);
        panel.add(inValor2);

        //RESULTADO
        JTextPane resultado = new JTextPane();
        resultado.setBackground(Color.lightGray);
        resultado.setBounds(20, (getY()/2)-(resultado.getHeight()/2), getWidth()-40, 50);
        panel.add(resultado);

        //BOTÓNES DE OPERACIÓN
        //suma
        JButton suma = new JButton();
        suma.setText("+");
        suma.setBounds(20, getHeight()-75, 45, 25);
        panel.add(suma);

        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double valor1 = Double.parseDouble(inValor1.getText());
                double valor2 = Double.parseDouble(inValor2.getText());
                double resultad = valor1 + valor2;
                String result = String.valueOf(resultad);
                resultado.setText(result);
            }
        });

        //resta
        JButton resta = new JButton();
        resta.setText("-");
        resta.setBounds(suma.getX()+suma.getWidth()+5, getHeight()-75, 45, 25);
        panel.add(resta);

        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double valor1 = Double.parseDouble(inValor1.getText());
                double valor2 = Double.parseDouble(inValor2.getText());
                double resultad = valor1 - valor2;
                String result = String.valueOf(resultad);
                resultado.setText(result);
            }
        });

        //multiplicación
        JButton mult = new JButton();
        mult.setText("x");
        mult.setBounds(resta.getX()+suma.getWidth()+5, getHeight()-75, 45, 25);
        panel.add(mult);

        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double valor1 = Double.parseDouble(inValor1.getText());
                double valor2 = Double.parseDouble(inValor2.getText());
                double resultad = valor1 * valor2;
                String result = String.valueOf(resultad);
                resultado.setText(result);
            }
        });

        //división
        JButton div = new JButton();
        div.setText("÷");
        div.setBounds(mult.getX()+suma.getWidth()+5, getHeight()-75, 45, 25);
        panel.add(div);

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double valor1 = Double.parseDouble(inValor1.getText());
                double valor2 = Double.parseDouble(inValor2.getText());
                double resultad = valor1 / valor2;
                String result = String.valueOf(resultad);
                resultado.setText(result);
            }
        });
    }
}
