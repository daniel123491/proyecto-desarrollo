/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelos.Vehiculo;
import modelos.RegistroParqueo;
import modelos.EspacioParqueo;
import servicios.RegistroParqueoService;

public class RegistroParqueoController {
    private RegistroParqueoService registroParqueoService;
    private VehiculoController vehiculoController;

    public RegistroParqueoController() {
        this.registroParqueoService = new RegistroParqueoService();
        this.vehiculoController = new VehiculoController();
    }

    // Registrar la entrada de un vehículo
    public void registrarEntrada(String placa, EspacioParqueo espacio) {
        Vehiculo vehiculo = vehiculoController.buscarVehiculo(placa);
        if (vehiculo != null && !espacio.isOcupado()) {
            registroParqueoService.registrarEntrada(vehiculo, espacio);
            System.out.println("Entrada registrada correctamente para " + placa);
        } else {
            System.out.println("Error: Vehículo no encontrado o espacio ocupado.");
        }
    }

    // Registrar la salida de un vehículo
    public void registrarSalida(String placa) {
        Vehiculo vehiculo = vehiculoController.buscarVehiculo(placa);
        if (vehiculo != null) {
            registroParqueoService.registrarSalida(vehiculo);
            System.out.println("Salida registrada correctamente para " + placa);
        } else {
            System.out.println("Error: Vehículo no encontrado.");
        }
    }
}
