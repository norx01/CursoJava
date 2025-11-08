import javax.swing.*;

public class Vectores
{
    //Definimos el vector
    int[] numeros = new int[5];

    //Mostramos el vector
    public void mostrar()
    {
        //Creamos un ciclo for para hacer el recorrido del vector
        for(int i = 0; i < numeros.length; i++)
        {
            System.out.println("pos["+i+"]: "+numeros[i]);
        }
    }

    //Agregamos datos al vector
    public void agregar()
    {
        for(int i = 0; i < numeros.length; i++)
        {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato - pos["+i+"]"));
            numeros[i] = dato;
        }
    }

    //Eliminamos datos del vector
    public void eliminar()
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar"));
        numeros[posicion] = 0;
    }

    //Editar datos del vector
    public void editar()
    {
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato"));
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a editar"));
        numeros[posicion] = dato;
    }

    //Buscar datos del vector
    public void buscar()
    {
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a buscar"));
        boolean encontrado = false;

        for(int i = 0; i < numeros.length; i++)
        {
            if(numeros[i] == dato)
            {
                JOptionPane.showMessageDialog(null,"El dato se encuentra en la posicion: "+i);
                encontrado = true;
            }
        }

        if(!encontrado)
        {
            JOptionPane.showMessageDialog(null,"El dato no se encuentra en el vector");
        }
    }

    //Creamos un menu
    public void menu()
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Mostrar \n2.Agregar \n3.eliminar \n4.editar \n5.buscar \n0.Salir"));

        switch (opcion)
        {
            case 1:
                mostrar();
                break;
            case 2:
                agregar();
                break;
            case 3:
                eliminar();
                break;
            case 4:
                editar();
                break;
            case 5:
                buscar();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
                break;
        }
        menu();
    }

    public static void main(String[] args)
    {
        Vectores vectores = new Vectores();
        vectores.menu();
    }
}
