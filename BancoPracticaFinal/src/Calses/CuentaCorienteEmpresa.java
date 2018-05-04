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
public  final class CuentaCorienteEmpresa extends CuentaCoriente {
    private double Tipointerésdescubierto;
    private double Máximodescubiertopermitido;

    public CuentaCorienteEmpresa( HashMap Listaentidades, Persona titular, double saldoActual, String numeroCuenta) {
        super(Listaentidades, titular, saldoActual, numeroCuenta);
        this.Tipointerésdescubierto = 5.5;
        this.Máximodescubiertopermitido = 8000;
    }

    @Override
    public String imprimible() {
        return super.imprimible()+" Tipo de interés descubierto= "+getTipointerésdescubierto() +", Máximo descubierto permitido= " + getMáximodescubiertopermitido(); //To change body of generated methods, choose Tools | Templates.
        
    }

    /**
     * @return the Tipointerésdescubierto
     */
    public double getTipointerésdescubierto() {
        return Tipointerésdescubierto;
    }

    /**
     * @param Tipointerésdescubierto the Tipointerésdescubierto to set
     */
    public void setTipointerésdescubierto(double Tipointerésdescubierto) {
        this.Tipointerésdescubierto = Tipointerésdescubierto;
    }

    /**
     * @return the Máximodescubiertopermitido
     */
    public double getMáximodescubiertopermitido() {
        return Máximodescubiertopermitido;
    }

    /**
     * @param Máximodescubiertopermitido the Máximodescubiertopermitido to set
     */
    public void setMáximodescubiertopermitido(double Máximodescubiertopermitido) {
        this.Máximodescubiertopermitido = Máximodescubiertopermitido;
    }
    
}
