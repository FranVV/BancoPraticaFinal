/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
        return super.imprimible()+" Lista Entidades= "+imprimirListaEntidades();
    }
    
    public  String imprimirListaEntidades() {
        String aux="";
        
        /*
        for (Map.Entry<Integer, String> a:Listaentidades.entrySet()) {
                aux+=a.getValue();
        }
        
        Set claves = Listaentidades.keySet();
        Object vAux1[] = claves.toArray();
        for (Object i: vAux1){
            aux+= Listaentidades.get((int)i);
        }
       */
         Set claves = Listaentidades.keySet();
        Iterator i = claves.iterator();
       // Iterator e;
        while (i.hasNext()) {            
       aux+=Listaentidades.get((int)i.next());
        }
        
        return aux;
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
