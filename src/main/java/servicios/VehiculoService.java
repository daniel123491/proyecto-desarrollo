/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import modelos.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class VehiculoService {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Vehiculo buscarPorPlaca(String placa) {
        return vehiculos.stream()
            .filter(v -> v.getPlaca().equals(placa))
            .findFirst()
            .orElse(null);
    }
}
