/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.*;
import java.awt.*;

public class ventana1 extends JFrame {
    public ventana1() {
        setTitle("Ventana 1 - Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("¡Bienvenido a la Ventana 1!", SwingConstants.CENTER);
        JButton btnSiguiente = new JButton("Siguiente");

        btnSiguiente.addActionListener(e -> {
            new ventana2().setVisible(true);
            dispose();
        });

        add(label, BorderLayout.CENTER);
        add(btnSiguiente, BorderLayout.SOUTH);
    }
}
