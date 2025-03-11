/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import modelos.EspacioParqueo;
import java.util.ArrayList;
import java.util.List;

public class EspacioParqueoService {
    private List<EspacioParqueo> espacios = new ArrayList<>();

    public EspacioParqueo buscarEspacioDisponible() {
        return espacios.stream()
            .filter(e -> !e.isOcupado())
            .findFirst()
            .orElse(null);
    }
}
