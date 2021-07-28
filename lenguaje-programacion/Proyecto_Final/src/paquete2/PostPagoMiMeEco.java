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
public class PostPagoMiMeEco extends PlanCelular {
     private int minutos;
    private double costoM;
    private int megasEG;
    private double costoG;
    private double porcentaje;
    
    public PostPagoMiMeEco(Persona p,String c,String m,String mo,String n
            ,int mi, double cos, int meg, double cg, double po){
        super(p,c,m,mo,n);
        minutos = mi;
        costoM = cos;
        megasEG = meg;
        costoG = cg;
        porcentaje = po;
        
    }
    
     public void establecerMinutos(int m){
        minutos = m;
    }
    public void establecerCostoMinutos(double c){
        costoM = c;
    }
    public void establecerMegasGigas(int m){
        megasEG = m;
    }
    public void establecerCostoGigas(double c){
        costoG = c;
    }
    public void establecerPorcentaje(double p){
        porcentaje = p;
    }
    
     public int  obtenerMinutos(){
        return minutos;
    }
    public double obtenerCostoMinutos(){
         return costoM;
    }
    public int obtenerMegasGigas(){
        
        return megasEG;
    }
    public double obtenerCostoGigas(){
        return costoG;
    }
    public double obtenerPorcentaje(){
        return porcentaje;
    }
    

    @Override
    public void establecerPagoMensual() {
        double prepago = (minutos * costoM) + (megasEG *costoG);
        double descu = prepago *porcentaje;
       this.pagoM = prepago - descu;
    }
    
     @Override
     public String toString() {
        String cadena = String.format("Plan PostPagoMinutosMegas\n"
                + "%s\t> Minutos : %d\n"
                + "\t> Costo Minutos : %.2f$\n"
                + "\t> Megas Expresados en Gigas: %d\n"
                + "\t>Costo por cada Gigas: %.2f\n"
                + "\t> Porcentaje de Descuento: %.2f\n"
                + "\t>Pago Mensuales: %.2f\n",
                super.toString(),
                obtenerMinutos(),obtenerCostoMinutos(),obtenerMegasGigas(),
                obtenerCostoGigas(),obtenerPorcentaje(),
                obtenerPagoMensual());

        return cadena;
    }
    
}
