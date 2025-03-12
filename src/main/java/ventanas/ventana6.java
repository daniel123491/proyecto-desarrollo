/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.*;
import java.awt.*;

public class ventana6 extends JFrame {
    public ventana6() {
        setTitle("Ventana 6 - Lista");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JList<String> list = new JList<>(new String[]{"Elemento 1", "Elemento 2", "Elemento 3"});
        add(new JScrollPane(list), BorderLayout.CENTER);

        JButton btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(e -> abrirNuevaVentana(new ventana7())); // Asegurar que ventana7 exista
        add(btnSiguiente, BorderLayout.SOUTH);
    }

    private void abrirNuevaVentana(JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }
}
