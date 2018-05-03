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
    private Persona titular;
    private double saldoActual;
    private String numeroCuenta;

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
        return "titular=" + getTitular() + ", saldoActual=" + getSaldoActual() + ", numeroCuenta=" + getNumeroCuenta();
    }

    /**
     * @return the titular
     */
    public Persona getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    /**
     * @return the saldoActual
     */
    public double getSaldoActual() {
        return saldoActual;
    }

    /**
     * @param saldoActual the saldoActual to set
     */
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    /**
     * @return the numeroCuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * @param numeroCuenta the numeroCuenta to set
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    
}
