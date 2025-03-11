/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventanas;

import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            abrirVentana1();
        });
    }

    private static void abrirVentana1() {
        ventana1 ventana1 = new ventana1();
        ventana1.setVisible(true);
        ventana1.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                abrirVentana2();
            }
        });
    }

    private static void abrirVentana2() {
        ventana2 ventana2 = new ventana2();
        ventana2.setVisible(true);
        ventana2.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                abrirVentana3();
            }
        });
    }

    private static void abrirVentana3() {
        ventana3 ventana3 = new ventana3();
        ventana3.setVisible(true);
        ventana3.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                abrirVentana4();
            }
        });
    }

    private static void abrirVentana4() {
        ventana4 ventana4 = new ventana4();
        ventana4.setVisible(true);
        ventana4.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                abrirVentana5();
            }
        });
    }

    private static void abrirVentana5() {
        ventana5 ventana5 = new ventana5();
        ventana5.setVisible(true);
    }
}

