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
public  final class CuentaAhorro extends CuentaBancaria{
    private double Tipointerés;

    public CuentaAhorro( Persona titular, double saldoActual, String numeroCuenta) {
        super(titular, saldoActual, numeroCuenta);
        this.Tipointerés = 0.03;
    }
    @Override
    public String imprimible() {
        return super.imprimible()+"Tipo de interes= "+ getTipointerés();
    }

    /**
     * @return the Tipointerés
     */
    public double getTipointerés() {
        return Tipointerés;
    }

    /**
     * @param Tipointerés the Tipointerés to set
     */
    public void setTipointerés(double Tipointerés) {
        this.Tipointerés = Tipointerés;
    }
    
   
    
}
