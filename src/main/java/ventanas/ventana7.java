/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.*;
import java.awt.*;

public class ventana7 extends JFrame {
    public ventana7() {
        setTitle("Ventana 7 - Área de Texto");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea("Escribe un mensaje...");
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JButton btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(e -> abrirNuevaVentana(new ventana8()));
        add(btnSiguiente, BorderLayout.SOUTH);
    }

    private void abrirNuevaVentana(JFrame ventana) {
        ventana.setVisible(true);
        dispose();
    }
}
