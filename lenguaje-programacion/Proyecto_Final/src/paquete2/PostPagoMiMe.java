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
public class PostPagoMiMe extends PlanCelular {
    private int minutos;
    private double costoM;
    private int megasG;
    private double costoG;
    
    public PostPagoMiMe(Persona p,String c,String m,String mo,String n
            ,int mi , double cos ,int me , double cg){
        super(p,c,m,mo,n);
        minutos = mi;
        costoM = cos;
        megasG = me;
        costoG = cg;
        
    }
    
    public void establecerMinutos(int m){
        minutos = m;
    }
    public void establecerCostoMinutos(double c){
        costoM = c;
    }
    public void establecerMegasGigas(int m){
        megasG = m;
    }
    public void establecerCostoGigas(double c){
        costoG = c;
    }
    
     public int  obtenerMinutos(){
        return minutos;
    }
    public double obtenerCostoMinutos(){
         return costoM;
    }
    public int obtenerMegasGigas(){
        
        return megasG;
    }
    public double obtenerCostoGigas(){
        return costoG;
    }
    

    @Override
    public void establecerPagoMensual() {
        this.pagoM = (minutos * costoM) +(megasG * costoG);
    }
    
    @Override
     public String toString() {
        String cadena = String.format("Plan PostPagoMinutosMegas\n"
                + "%s\t> Minutos : %d\n"
                + "\t> Costo Minutos : %.2f$\n"
                + "\t> Megas Expresados en Gigas: %d"
                + "\t>Costo por cada Gigas: %.2f\n"
                + "\t>Pago Mensuales: %.2f\n",
                super.toString(),
                obtenerMinutos(),obtenerCostoMinutos(),obtenerMegasGigas(),
                obtenerCostoGigas(),
                obtenerPagoMensual());

        return cadena;
    }
    
    
            
}
