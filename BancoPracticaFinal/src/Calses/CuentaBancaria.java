/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calses;


/**
 *
 * @author alumno
 */
public abstract class CuentaBancaria implements Interfaz.Interzace{
    protected Persona titular;
    protected double saldoActual;
    protected String numeroCuenta;

    public CuentaBancaria(Persona titular) {
        this.titular = titular;
        this.saldoActual = 0;
        this.numeroCuenta = "00";
    }
    public CuentaBancaria(Persona titular, double saldoActual, String numeroCuenta) {
        this.titular = titular;
        this.saldoActual = saldoActual;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String imprimible() {
        return "titular=" + titular + ", saldoActual=" + saldoActual + ", numeroCuenta=" + numeroCuenta;
    }
    
    
}
