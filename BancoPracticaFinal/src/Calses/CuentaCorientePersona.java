/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calses;

import java.util.HashMap;

/**
 *
 * @author alumno
 */
public  final class CuentaCorientePersona extends CuentaCoriente{
     private double Comisionmantenimiento;

    public CuentaCorientePersona(double Comisionmantenimiento, HashMap Listaentidades, Persona titular, double saldoActual, String numeroCuenta) {
        super(Listaentidades, titular, saldoActual, numeroCuenta);
        this.Comisionmantenimiento = Comisionmantenimiento;
    }

    @Override
    public String imprimible() {
        return super.imprimible()+"Comision de mantenimiento= "+getComisionmantenimiento(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the Comisionmantenimiento
     */
    public double getComisionmantenimiento() {
        return Comisionmantenimiento;
    }

    /**
     * @param Comisionmantenimiento the Comisionmantenimiento to set
     */
    public void setComisionmantenimiento(double Comisionmantenimiento) {
        this.Comisionmantenimiento = Comisionmantenimiento;
    }
     
     
}
