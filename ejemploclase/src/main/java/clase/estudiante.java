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
public class estudiante  extends persona {
    
    int  registroAcademico;
    String  carrera;

    public estudiante() {
        
        
        
        
    }

    public estudiante(int registroAcademico, String carrera) {
        this.registroAcademico = registroAcademico;
        this.carrera = carrera;
    }

    public estudiante(int registroAcademico, String carrera, int cui, String nombre, LocalDate fechaDeNacimiento) {
        super(cui, nombre, fechaDeNacimiento);
        this.registroAcademico = registroAcademico;
        this.carrera = carrera;
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
    
    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    
    
    
    
    
    
    
}
