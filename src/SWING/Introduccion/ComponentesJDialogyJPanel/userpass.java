package SWING.Introduccion.ComponentesJDialogyJPanel;

import javax.swing.*;

public class userpass
{
    public static void main(String[] args)
    {
        String user = JOptionPane.showInputDialog(null, "user");
        String password = JOptionPane.showInputDialog(null, "password");

        if (user.equals("admin") && password.equals("1234"))
        {
            JOptionPane.showMessageDialog(null, "Success");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "login failed");
        }
    }
}
