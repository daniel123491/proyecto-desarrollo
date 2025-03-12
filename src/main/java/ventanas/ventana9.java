/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.*;
import java.awt.*;

public class ventana9 extends JFrame {
    public ventana9() {
        setTitle("Ventana 9 - Panel de colores");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        add(panel, BorderLayout.CENTER);

        JButton btnColor = new JButton("Cambiar Color");
        btnColor.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this, "Selecciona un color", panel.getBackground());
            if (color != null) panel.setBackground(color);
        });

        JButton btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(e -> abrirNuevaVentana(new ventana10())); // Corregido el método

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnColor);
        panelBotones.add(btnSiguiente);

        add(panelBotones, BorderLayout.SOUTH);
    }

    private void abrirNuevaVentana(JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }
}
