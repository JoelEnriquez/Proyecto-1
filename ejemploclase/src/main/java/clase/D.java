/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.time.LocalDate;

/**
 *
 * @author joel
 */
public class D     extends persona {
    int carnte ;
    LocalDate horaEntrada;
        LocalDate horaSalida;

    public D() {
    }

    public D(int cui, String nombre, LocalDate fechaDeNacimiento) {
        super(cui, nombre, fechaDeNacimiento);
    }

    public D(int carnte, LocalDate horaEntrada, LocalDate horaSalida) {
        this.carnte = carnte;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public D(int carnte, LocalDate horaEntrada, LocalDate horaSalida, int cui, String nombre, LocalDate fechaDeNacimiento) {
        super(cui, nombre, fechaDeNacimiento);
        this.carnte = carnte;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
        
        
   
        
        
}
