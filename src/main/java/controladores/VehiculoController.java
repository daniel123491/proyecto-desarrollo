/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelos.Vehiculo;
import servicios.VehiculoService;

public class VehiculoController {
    private VehiculoService vehiculoService;

    public VehiculoController() {
        this.vehiculoService = new VehiculoService();
    }

    // Registrar un nuevo vehículo
    public void registrarVehiculo(String placa, String marca, String modelo) {
        Vehiculo vehiculo = new Vehiculo(placa, marca, modelo);
        vehiculoService.registrarVehiculo(vehiculo);
    }

    // Buscar un vehículo por su placa
    public Vehiculo buscarVehiculo(String placa) {
        return vehiculoService.buscarPorPlaca(placa);
    }
}
