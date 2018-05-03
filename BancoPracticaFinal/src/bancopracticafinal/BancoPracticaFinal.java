/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopracticafinal;

import Calses.CuentaAhorro;
import Calses.CuentaBancaria;
import Calses.CuentaCorientePersona;
import Calses.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class BancoPracticaFinal {

    public static void main(String[] args) {
        ArrayList<CuentaBancaria> vCuentasbancarias = new ArrayList<CuentaBancaria>();
        boolean bandera = true;
        while (bandera) {
            switch (Menu.Menus.menu1()) {
                case 1://Abrir una nueva cuenta.
                    vCuentasbancarias.add(datosPersonaCuenta(datosPersona()));
                    break;
                case 2://Ver un listado de las cuentas disponibles (código de cuenta, titular y saldo actual).
                    break;
                case 3://Obtener los datos de una cuenta concreta.
                    break;
                case 4://Realizar un ingreso en una cuenta.
                    break;
                case 5://Retirar efectivo de una cuenta.
                    break;
                case 6://Consultar el saldo actual de una cuenta
                    break;
                case 7://salir 
                    bandera = false;
                    System.out.println("Has salido de la aplicacion");
                    break;
            }
        }

    }

    public static Persona datosPersona() {
        ArrayList<String> vString = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el nombre de la persona");
        vString.add(leer.nextLine());
        System.out.println("Dime los apellidos de la persona");
        vString.add(leer.nextLine());
        System.out.println("Dime la fechade nacimiento de la persona");
        vString.add(leer.nextLine());
        Persona nuevaP = new Persona(vString.get(0), vString.get(1), vString.get(2));
        return nuevaP;
    }

    public static CuentaBancaria datosPersonaCuenta(Persona nuevaP) {
        ArrayList<String> vString = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        boolean aux = true;
        while (bandera) {
            switch (Menu.Menus.menu2()) {
                case 1://CuentaAhorro
                   
                    System.out.println("Dime el saldo Actual de la persona");
                    vString.add(leer.nextLine());
                    System.out.println("Dime el Numero de cuenta de la persona");
                    vString.add(leer.nextLine());
                    CuentaBancaria cBANueva = new CuentaAhorro(nuevaP, Double.parseDouble(vString.get(0)), vString.get(1));
                    return cBANueva;
                case 2://CuentaCoriente
                    HashMap <Integer, String> Listaentidades = null;
                    Listaentidades.put(1, "0015");
                    Listaentidades.put(2, "0016");
                    Listaentidades.put(3, "0017");
                    Listaentidades.put(4, "0018");
                    while (aux) {
                        switch (Menu.Menus.menu3()) {
                            case 1://Cuenta coriente persona.
                                System.out.println("Dime el saldo Actual de la persona");
                                vString.add(leer.nextLine());
                                System.out.println("Dime el Numero de cuenta de la persona");
                                vString.add(leer.nextLine());
                                CuentaBancaria cBCPNueva = new CuentaCorientePersona(Listaentidades, nuevaP, Double.parseDouble(vString.get(0)), vString.get(1));
                                return cBCPNueva;
                            case 2://Cuenta coriente empresa.
                                break;
                            case 3://salir
                                aux= false;
                                break;
                        }
                    }
                    break;
                case 3: //Salir
                    break;
            }
        }
        return null;
    }

}
