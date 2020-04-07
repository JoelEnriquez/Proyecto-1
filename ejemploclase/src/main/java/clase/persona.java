
package clase;

import java.time.Duration;
import java.time.LocalDate;


public class persona {

int cui; 
String nombre;
LocalDate  fechaDeNacimiento; 

    public persona() {
    }

    public persona(int cui, String nombre, LocalDate fechaDeNacimiento) {
        this.cui = cui;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
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

    public Duration  getEdad() {
        
        
        return  Duration.between(fechaDeNacimiento, fechaDeNacimiento);
    }
    
    


    
    

}
