/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> abrirVentana(new ventana1()));
    }

    private static void abrirVentana(JFrame ventana) {
        ventana.setVisible(true);
        ventana.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                if (ventana instanceof ventana1) abrirVentana(new ventana2());
                else if (ventana instanceof ventana2) abrirVentana(new ventana3());
                else if (ventana instanceof ventana3) abrirVentana(new ventana4());
                else if (ventana instanceof ventana4) abrirVentana(new ventana5());
                else if (ventana instanceof ventana5) abrirVentana(new ventana6());
                else if (ventana instanceof ventana6) abrirVentana(new ventana7());
                else if (ventana instanceof ventana7) abrirVentana(new ventana8());
                else if (ventana instanceof ventana8) abrirVentana(new ventana9());
                else if (ventana instanceof ventana9) abrirVentana(new ventana10());
            }
        });
    }
}