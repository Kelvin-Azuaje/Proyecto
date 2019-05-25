
package Interfaces;

/**
 *
 * @author KELVIN
 */
public class ClaseTrasladosInternos {
    private String tipo, fecha1;

    public ClaseTrasladosInternos() {
    }

    public ClaseTrasladosInternos(String tipo, String fecha1) {
        this.tipo = tipo;
        this.fecha1 = fecha1;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFecha1() {
        return fecha1;
    }
    
}
