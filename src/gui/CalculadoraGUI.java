package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI
{
    private JPanel mainPanel;
    private JTextField campo1;
    private JTextField campo2;
    private JButton sumarButton;
    private JLabel etiquetaResultado;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;


    public CalculadoraGUI()
    {

        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int num1 = Integer.parseInt(campo1.getText());
                int num2 = Integer.parseInt(campo2.getText());
                int resultado = num1+num2;
                //JOptionPane.showMessageDialog(null, "La suma es: "+resultado);
                etiquetaResultado.setText("El resultado es: "+resultado);
            }
        });

        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int num1 = Integer.parseInt(campo1.getText());
                int num2 = Integer.parseInt(campo2.getText());
                int resultado = num1-num2;
                etiquetaResultado.setText("El resultado es: "+resultado);
            }
        });

        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int num1 = Integer.parseInt(campo1.getText());
                int num2 = Integer.parseInt(campo2.getText());
                int resultado = num1*num2;
                etiquetaResultado.setText("El resultado es: "+resultado);
            }
        });

        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int num1 = Integer.parseInt(campo1.getText());
                int num2 = Integer.parseInt(campo2.getText());
                double resultado = (double) num1/num2;
                etiquetaResultado.setText("El resultado es: "+resultado);
            }
        });
    }

    public static void main(String[] args)
    {
        //Crea el marco de la interfaz grafica
        JFrame frame = new JFrame("Calculadora");
        //Agrega el panel al marco
        frame.setContentPane(new CalculadoraGUI().mainPanel);
        //Al cerrar la ventana se cierra la aplicacion
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Organiza el marco
        frame.pack();
        //Muestra el marco
        frame.setVisible(true);
        //Define el tamaño del marco
        frame.setSize(500,500);
    }

}
