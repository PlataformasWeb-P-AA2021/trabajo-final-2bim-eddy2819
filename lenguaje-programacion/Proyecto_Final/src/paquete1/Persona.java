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
public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private String iden;
    
    public Persona(String n,String a,String i){
        nombre = n;
        apellido = a;
        iden = i;
    }
    
    
    public void setNombre(String n){
        nombre = n;
    }
    public void setApellido(String a){
        apellido = a;
    }
    public void setIdentificacion(String i){
        iden = i;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getIdentificacion(){
        return iden;
    }
    
    @Override
   public String toString() {
        String cadena = String.format("Propietario\n"
                + "\t> Nombre: %s\n"
                + "\t> Apellido: %s\n"
                + "\t> Identificacion: %s\n",
                getNombre(),getApellido(),getIdentificacion());

        return cadena;
    }
            
    
}
