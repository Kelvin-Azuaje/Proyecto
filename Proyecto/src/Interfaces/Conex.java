/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KELVIN
 */
public class Conex {
    private Connection conex;
    private Statement sentencia;
    private ResultSet resul;
    private String query;
    
    public Conex(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            sentencia = conex.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conex.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ClaseMantenimientoEntrada getEquipos1(){
        ClaseMantenimientoEntrada equi = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi = new ClaseMantenimientoEntrada(resul.getString("TIPO"), resul.getString("EQUIPO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conex.class.getName()).log(Level.SEVERE, null, ex);
        }
        return equi;
    }
    
    public ClaseMantenimientoSalida getEquipos2(){
        ClaseMantenimientoSalida equi2 = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi2 = new ClaseMantenimientoSalida(resul.getString("EQUIPO"), resul.getString("FECHA1"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conex.class.getName()).log(Level.SEVERE, null, ex);
        }
        return equi2;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
    
}