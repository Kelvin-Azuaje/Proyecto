
package Interfaces;

/**
 *
 * @author KELVIN
 */
public class ClaseTrasladosExternos {
    private String tipo, fecha1;

    public ClaseTrasladosExternos() {
    }

    public ClaseTrasladosExternos(String tipo, String fecha1) {
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
