import javax.swing.*;

//Clase
public class Calculadora {
    //Atributos
    int num1;
    int num2;

    //Constructor de la clase
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Metodos o funciones
    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        return (double) num1 / num2;
    }

    public boolean esMayor() {
        return num1 > num2;
    }

    public void menu()
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.sumar 2.restar 3.multiplicar 4.dividir 5.esMayor 0.Salir"));

        switch (opcion)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"La suma es "+sumar());
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"La resta es "+restar());
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"La multiplicacion es "+multiplicar());
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"La division es "+dividir());
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"num1 es mayor a num2 "+esMayor());
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

    //Main
    public static void main(String[] args)
    {
        //Pedimos los datos al usuario
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        //Creamos un objeto de clase Calculadora
        //Clase      //Objeto     //nueva Clase
        Calculadora calculadora = new Calculadora(num1,num2);

        //implementamos el menu
        calculadora.menu();

        /*
        //El objeto interactua con los metodos
        calculadora.sumar();
        //Para mostrar en consola el resultado
        System.out.println("La suma es "+calculadora.sumar());
        //Mostramos por interfaz grafica
        JOptionPane.showMessageDialog(null,"La suma es "+calculadora.sumar()
                +"\nLa resta es: "+calculadora.restar()+"\nLa multiplicacion es: "+calculadora.multiplicar()
                +"\nLa division es: "+calculadora.dividir()+"\nNum1 es mayor que num2: "+calculadora.esMayor());

         */

    }
}
