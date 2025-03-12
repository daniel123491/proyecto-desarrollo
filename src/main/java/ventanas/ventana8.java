/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.*;
import java.awt.*;

public class ventana8 extends JFrame {
    public ventana8() {
        setTitle("Ventana 8 - Tabla");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); // Agregado para evitar problemas de disposición

        JTable table = new JTable(new String[][]{{"1", "Juan"}, {"2", "Ana"}}, new String[]{"ID", "Nombre"});
        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(e -> abrirNuevaVentana(new ventana9())); // Asegurar que ventana9 exista
        add(btnSiguiente, BorderLayout.SOUTH);
    }

    private void abrirNuevaVentana(JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }
}
