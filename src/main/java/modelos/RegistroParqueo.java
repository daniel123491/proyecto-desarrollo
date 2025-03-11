package modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Date;

public class RegistroParqueo {  // Asegúrate de que sea "public"
    private Vehiculo vehiculo;
    private EspacioParqueo espacio;
    private Date horaEntrada;
    private Date horaSalida;

    // Getters y Setters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public EspacioParqueo getEspacio() {
        return espacio;
    }

    public void setEspacio(EspacioParqueo espacio) {
        this.espacio = espacio;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }
}
