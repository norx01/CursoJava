package gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TiendaGUI {
    private JPanel mainPanel;
    private JComboBox comboBox1;
    private JSpinner spinner1;
    private JLabel precioU;
    private JLabel precioC;

    int precio = 0;

    public TiendaGUI()
    {
        comboBox1.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                String item = comboBox1.getSelectedItem().toString();

                if (item.equals("Arroz"))
                {
                    precio = 1500;
                    precioU.setText("Precio unitario: $1500");
                }
                else if(item.equals("Panela"))
                {
                    precio = 5500;
                    precioU.setText("Precio unitario: $5500");
                }
                else if (item.equals("Huevos"))
                {
                    precio = 500;
                    precioU.setText("Precio unitario: $500");
                }
                else if (item.equals("Azucar"))
                {
                    precio = 2000;
                    precioU.setText("Precio unitario: $2000");
                }
                else
                {
                    precio = 0;
                    precioU.setText("Precio unitario: $0");
                }
            }
        });

        spinner1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                int cantidad = (int)spinner1.getValue();
                precioC.setText("Precio cantidad: $"+(cantidad*precio));
            }
        });
    }

    public static void main(String[] args)
    {
        //Crea el marco de la interfaz grafica
        JFrame frame = new JFrame("Tienda");
        //Agrega el panel al marco
        frame.setContentPane(new TiendaGUI().mainPanel);
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
