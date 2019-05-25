
package Interfaces;

/**
 * @author KELVIN
 */

public class Equipos {
    private String tipo, fecha1;
    
    public Equipos(){
        
    }
    
    public Equipos(String tipo, String fecha1){
        this.tipo = tipo;
        this.fecha1 = fecha1;
    }
    
    public String getTipo() {
        return tipo;
    }

    public String getFecha() {
        return fecha1;
    }
    
}
