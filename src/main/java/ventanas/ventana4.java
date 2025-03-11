/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.*;
import java.awt.*;

public class ventana4 extends JFrame {
    public ventana4() {
        setTitle("Ventana 4 - Seleccionar Color");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));

        JButton btnColor = new JButton("Seleccionar Color");
        btnColor.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Elige un color", Color.WHITE);
            getContentPane().setBackground(color);
        });

        JButton btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(e -> {
            new ventana5().setVisible(true);
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(btnColor);
        panel.add(btnSiguiente);

        add(panel);
    }
}

