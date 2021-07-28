/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Persona;
import paquete1.PlanCelular;

/**
 *
 * @author DELL
 */
public class PostPagoMegas extends PlanCelular{
    private int megas;
    private double costoG;
    private double tarifa;
    
    public PostPagoMegas(Persona p,String c,String m,String mo,String n
            ,int me, double cs , double t){
        super(p,c,m,mo,n);
        megas = me;
        costoG = cs;
        tarifa = t;
        
    }
    public void establecerMegasGigas(int m){
        megas = m;
    }
    public void establecer(double c){
        costoG = c;
    }
   
    public void establecerTarifaBase(double t){
        tarifa = t;
    }
    
    public int obtenerMegasGigas(){
        return megas ;
    }
    public double obtenerCostoGigas(){
        return costoG;
    }
    
    public double obtenerTarifaBase(){
        return  tarifa;
    }
    
    @Override
    public void establecerPagoMensual() {
      this.pagoM = (megas*costoG )+tarifa;
    }
    
    @Override
     public String toString() {
        String cadena = String.format("Plan PostPagoMegas\n"
                + "%s\t> Megas expresados en Gigas: %d\n"
                + "\t> Costo por cada Gigas: %.2f$\n"
                + "\t> Tarifa Base: %.2f\n"
                + "\t>Pago Mensuales: %.2f\n",
                super.toString(),
               obtenerMegasGigas(),obtenerCostoGigas(),obtenerTarifaBase(),
                obtenerPagoMensual());

        return cadena;
    }
    
    
    
}
