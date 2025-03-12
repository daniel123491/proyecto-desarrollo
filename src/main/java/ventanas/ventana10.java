/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

/**
 *
 * @author Salome
 */
import javax.swing.*;
import java.awt.*;
public class ventana10 extends JFrame {
    public ventana10() {
        setTitle("Ventana 10 - Diálogo");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JButton btnDialogo = new JButton("Mostrar diálogo");
        btnDialogo.addActionListener(e -> JOptionPane.showMessageDialog(this, "Hola, este es un mensaje."));

        JButton btnSalir = new JButton("Salir");
        btnSalir.addActionListener(e -> System.exit(0));

        JPanel panel = new JPanel();
        panel.add(btnDialogo);
        panel.add(btnSalir);

        add(panel, BorderLayout.SOUTH);
        setVisible(true);
    }
}