/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Menus {

    public static int menu1() {
        int n = 0;
        while (n <= 0 && n <= 7) {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println(".............................................");
                System.out.println(" 1. Abrir una nueva cuenta.");
                System.out.println(" 2. Ver un listado de las cuentas disponibles (código de cuenta, titular y saldo actual).");
                System.out.println(" 3. Obtener los datos de una cuenta concreta.");
                System.out.println(" 4. Realizar un ingreso en una cuenta.");
                System.out.println(" 5. Retirar efectivo de una cuenta.");
                System.out.println(" 6. Consultar el saldo actual de una cuenta.");
                System.out.println(" 7. Salir de la aplicación.");
                System.out.println(".............................................");
                n = leer.nextInt();
            }catch(Exception ex){
                System.err.println("Has introducido valores no validos");
            }
        }
        return n;
    }
    public static int menu2() {
        int n = 0;
        while (n <= 0 && n <= 3) {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println(".............................................");
                System.out.println(" 1.Cuenta de Ahorro.");
                System.out.println(" 2.Cuenta coriente.");
                System.out.println(" 3.Salir.");
                System.out.println(".............................................");
                n = leer.nextInt();
            }catch(Exception ex){
                System.err.println("Has introducido valores no validos");
            }
        }
        return n;
    }
    public static int menu3() {
        int n = 0;
        while (n <= 0 && n <= 3) {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println(".............................................");
                System.out.println(" 1.Cuenta coriente persona.");
                System.out.println(" 2.Cuenta coriente empresa.");
                System.out.println(" 3.Salir.");
                System.out.println(".............................................");
                n = leer.nextInt();
            }catch(Exception ex){
                System.err.println("Has introducido valores no validos");
            }
        }
        return n;
    }
}
