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
public class PostPagoMinutos extends PlanCelular {

    private int minutoN;
    private double costoMN;
    private int minutoI;
    private double costoMI;

    public PostPagoMinutos(Persona p, String c, String m, String mo, String n,
            int mn, double cn, int mi, double ci) {
        super(p, c, m, mo, n);

        minutoN = mn;
        costoMN = cn;
        minutoI = mi;
        costoMI = ci;
    }

    public void establecerMinutosNacional(int m) {
        minutoN = m;
    }

    public void establecerCostoMNacional(double c) {
        costoMN = c;
    }

    public void establecerMinutosInternacional(int i) {
        minutoI = i;
    }

    public void establecerCostoMInternacional(double c) {
        costoMI = c;
    }

    public int obtenerMinutosNacional() {
        return minutoN;
    }

    public double obtenerCostoMNacional() {
        return costoMN;
    }

    public int obtenerMinutosInternacional() {
        return minutoI;
    }

    public double obtenerCostoMInternacional() {
        return costoMI;
    }

    @Override
    public void establecerPagoMensual() {
        this.pagoM = (minutoN * costoMN) + (minutoI * costoMI);
    }

    @Override
    public String toString() {
        String cadena = String.format("Plan PostPagoMinutos\n"
                + "%s\t> Minutos Nacionales: %d\n"
                + "\t> Costo Minutos Nacional: %.2f$\n"
                + "\t> Minutos Internacionales: %d\n"
                + "\t>Costo Minuto Internacional: %.2f\n"
                + "\t>Pago Mensuales: %.2f\n",
                super.toString(),
                obtenerMinutosNacional(), obtenerCostoMNacional(),
                obtenerMinutosInternacional(), obtenerCostoMInternacional(),
                obtenerPagoMensual());

        return cadena;
    }

}
