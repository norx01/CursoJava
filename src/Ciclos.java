import javax.swing.*;

public class Ciclos
{
    //Ciclo For
    //Se repite n veces definidas
    //Se usa cuando sabemos el numero de veces que se repite
    public void cicloFor()
    {
        for(int i = 0;i < 5; i++)
        {
            System.out.println("i: "+i);
        }
    }

    //Ciclo While
    //Se repite mientras se cumpla la condicion
    //Se usa cuando no sabemos el numero de veces que se repite
    //verifica la condicion antes de ejecutar el codigo
    public void cicloWhile()
    {
        int i = 0;
        while (i != 1)
        {
            System.out.println("Hola");
            i = Integer.parseInt(JOptionPane.showInputDialog("0.continuar 1.salir"));
        }
    }

    //Ciclo Do While
    //Se repite mientras se cumple la condicion
    //Se usa cuando no sabemos el numero de veces que se repite
    //Ejecuta y luego verifica la condicion
    public void cicloDoWhile()
    {
        int i = 0;
        do
        {
            System.out.println("Hola2");

        }while (i != 0);
    }

    public void tablaMultiplicar()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        for (int i = 1; i <= 10; i++)
        {
            int res = num * i;
            System.out.println(num+"X"+i+"= "+res);
        }
    }

    public void acumulador()
    {
        int acum = 0;
        int opcion = 0;
        while (opcion != 1)
        {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            acum = acum + num;
            opcion = Integer.parseInt(JOptionPane.showInputDialog("0.continuar 1.salir"));
        }
        System.out.println("La suma es: "+acum);
    }

    public static void main(String[] args) {
        Ciclos ciclos = new Ciclos();
        ciclos.acumulador();
    }
}
