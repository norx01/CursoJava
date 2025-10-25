import javax.swing.*;

public class Condicional
{
    int edad;
    public void mayorEdad()
    {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad"));


        if (edad < 1)
        {
            JOptionPane.showMessageDialog(null,"edad invalida");
        }
        else if(edad >= 18)
        {
            JOptionPane.showMessageDialog(null,"Es mayor de edad");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Es menor de edad");
        }
    }

    public void compracionNumeros()
    {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        if (num1 == num2 && num1 == num3)
        {
            JOptionPane.showMessageDialog(null,"Los numeros son iguales");
        }
        else if(num1 >= num2 && num1 >= num3)
        {
            JOptionPane.showMessageDialog(null,"El mayor es: "+num1);
        }
        else if(num2 >= num1 && num2 >= num3)
        {
            JOptionPane.showMessageDialog(null,"El mayor es: "+num2);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El mayor es: "+num3);
        }

    }

    public static void main(String[] args)
    {
        //Nombre clase   //nombre objeto = new //Nombre clase
        Condicional condicional = new Condicional();
        condicional.compracionNumeros();

    }



}
