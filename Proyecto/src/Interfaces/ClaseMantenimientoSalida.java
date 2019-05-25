
package Interfaces;

/**
 *
 * @author KELVIN
 */
public class ClaseMantenimientoSalida {
    private String equipo, fecha2;

    public ClaseMantenimientoSalida() {
    }

    public ClaseMantenimientoSalida(String equipo, String fecha2) {
        this.equipo = equipo;
        this.fecha2 = fecha2;
    }

    public String getEquipo() {
        return equipo;
    }

    public String getFecha2() {
        return fecha2;
    }
    
}
