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
public abstract class CuentaCoriente extends CuentaBancaria {
    protected HashMap <Integer, String>Listaentidades;

    public CuentaCoriente(HashMap Listaentidades, Persona titular, double saldoActual, String numeroCuenta) {
        super(titular, saldoActual, numeroCuenta);
        this.Listaentidades = Listaentidades;
    }

    @Override
    public String imprimible() {
        return super.imprimible()+"Lista Entidades= "+getListaentidades();
    }

    /**
     * @return the Listaentidades
     */
    public HashMap getListaentidades() {
        return Listaentidades;
    }

    /**
     * @param Listaentidades the Listaentidades to set
     */
    public void setListaentidades(HashMap Listaentidades) {
        this.Listaentidades = Listaentidades;
    }
    
    
}
