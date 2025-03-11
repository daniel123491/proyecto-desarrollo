/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import modelos.RegistroParqueo;
import modelos.Vehiculo;
import modelos.EspacioParqueo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistroParqueoService {
    private List<RegistroParqueo> registros = new ArrayList<>();

    public void registrarEntrada(Vehiculo vehiculo, EspacioParqueo espacio) {
        RegistroParqueo registro = new RegistroParqueo();
        registro.setVehiculo(vehiculo);
        registro.setEspacio(espacio);
        registro.setHoraEntrada(new Date());
        espacio.setOcupado(true);
        registros.add(registro);
    }

    public void registrarSalida(Vehiculo vehiculo) {
        RegistroParqueo registro = registros.stream()
            .filter(r -> r.getVehiculo().equals(vehiculo) && r.getHoraSalida() == null)
            .findFirst()
            .orElse(null);

        if (registro != null) {
            registro.setHoraSalida(new Date());
            registro.getEspacio().setOcupado(false);
        }
    }
}
