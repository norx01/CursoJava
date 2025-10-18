import javax.swing.*;

public class Triangulo
{
    //Atributos
    double lado1;
    double lado2;
    double lado3;

    //metodo
    public void tipoTriangulo()
    {
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado"));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer lado"));

        if (lado1 == lado2 && lado2 == lado3)
        {
            JOptionPane.showMessageDialog(null,"Equilatero");
        }
        else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
        {
            JOptionPane.showMessageDialog(null,"Escaleno");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Isoceles");
        }
    }

    //main
    public static void main(String[] args)
    {
        Triangulo triangulo = new Triangulo();
        triangulo.tipoTriangulo();
    }

}
