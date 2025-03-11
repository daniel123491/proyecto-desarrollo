/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.*;
import java.awt.*;

public class ventana2 extends JFrame {
    public ventana2() {
        setTitle("Ventana 2 - Formulario");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Nombre:"));
        JTextField txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Edad:"));
        JTextField txtEdad = new JTextField();
        add(txtEdad);

        JButton btnEnviar = new JButton("Enviar");
        JButton btnSiguiente = new JButton("Siguiente");

        btnSiguiente.addActionListener(e -> {
            new ventana3().setVisible(true);
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(btnEnviar);
        panel.add(btnSiguiente);

        add(panel);
    }
}
