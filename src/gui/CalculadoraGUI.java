package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;

    public CalculadoraGUI()
    {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new CalculadoraGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }

}
