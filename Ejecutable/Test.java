package Ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
        int cp, ci, N;
        double x;
        int n1;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamanño de la muestra: "));

        cp = 0;
        ci = 0;

        for (int i = 1; i <= N; i++)
        {
            n1 = (int)(Math.random() * 6);

            if(n1 % 2 == 0)
            {
                cp++;
            }

            else
            {
                ci++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El numero de pares es: " + cp);
        JOptionPane.showMessageDialog(null, "El numero de impares es: " + ci);
        
        System.exit(0);
    }
}
