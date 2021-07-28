/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.io.Serializable;

/**
 *
 * @author DELL
 */

public abstract class PlanCelular implements  Serializable {
    protected Persona propietario;
    protected String ciudadP;
    protected String marca;
    protected String modelo;
    protected String numero;
    protected double pagoM;
    
    public PlanCelular(Persona p,String c,String m,String mo,String n){
        propietario = p;
        ciudadP = c;
        marca = m;
        modelo = mo;
        numero = n;
    }
    public void establecerPropietario(Persona p){
        propietario = p;
    }
    public void establecerCiudad(String c){
        ciudadP = c;
    }
    public void establecerMarca(String m){
        marca = m;
    }
    public void establecerModelo(String mo){
        modelo = mo;
    }
    public void estableccerNumero(String n){
        numero = n;
    }
    
    public abstract void establecerPagoMensual();
    
    public Persona obtenerPropietario(){
        return propietario;
    }    
    public String obtenerCiudad(){
        return ciudadP;
    }
    public String obtenerMarca(){
        return marca;
        
    }
    public String obtenerModelo(){
        return modelo;
        
    }
    public double obtenerPagoMensual(){
        return pagoM;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Plan Celular\n"
                + "\t> Propietario: \n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificacion: %s\n"
                + "\t> Ciudad: %s\n"
                + "\t> Marca Celular: %s\n"
                + "\t>Modelo Celular: %s\n",
                obtenerPropietario().getNombre(),
                obtenerPropietario().getApellido(),
                obtenerPropietario().getIdentificacion(),
                obtenerCiudad(),obtenerMarca(),obtenerModelo());

        return cadena;
    }
    
}
