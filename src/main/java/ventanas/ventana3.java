/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.*;
import java.awt.*;

public class ventana3 extends JFrame {
    public ventana3() {
        setTitle("Ventana 3 - Confirmación");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));

        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Confirmado"));

        JButton btnSiguiente = new JButton("Siguiente");
        btnSiguiente.addActionListener(e -> {
            new ventana4().setVisible(true);
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(btnConfirmar);
        panel.add(btnSiguiente);

        add(panel);
    }
}

