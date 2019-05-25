
package Interfaces;

/**
 * @author KELVIN
 */

public class ClaseMantenimientoEntrada {
    private String tipo, fecha1;
    
    public ClaseMantenimientoEntrada(){
        
    }
    
    public ClaseMantenimientoEntrada(String tipo, String fecha1){
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
