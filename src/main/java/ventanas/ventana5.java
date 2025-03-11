/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.*;
import java.awt.*;

public class ventana5 extends JFrame {
    public ventana5() {
        setTitle("Ventana 5 - Selector de Archivo");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));

        JButton btnArchivo = new JButton("Seleccionar Archivo");
        btnArchivo.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(this);
        });

        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(e -> System.exit(0));

        JPanel panel = new JPanel();
        panel.add(btnArchivo);
        panel.add(btnSalir);

        add(panel);
    }
}
