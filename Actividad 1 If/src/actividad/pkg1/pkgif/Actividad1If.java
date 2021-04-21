/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg1.pkgif;

import java.util.Scanner;

/**
 *
 * @author OscarRuiz
 */
public class Actividad1If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escriba un programa que con base al año actual y lea
        //un año cualquiera y que escriba cuántos años han pasado
        //desde ese año o cuántos años faltan para llegar a ese año
         int añoBase = 2021;
         Scanner st = new Scanner (System.in);
         System.out.println("Ingrese un año cualquiera: ");
         int año = st.nextInt();
         
         if (año<añoBase) {
             int diferencia = año - 2021;
             System.out.println("Han pasado :" + diferencia + " años para llegar a este año");
         }else if (año==añoBase) {
             System.out.println("Los años son iguales");
         }else {
             int diferencia = año - 2021;
             System.out.println("Faltan :" + diferencia + " años para llegar a ese año");
    }
    }
   
}
