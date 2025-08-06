/*
 *Cuenta Elementos.java
  INGRESA UNA SECUENCIA DE CADENA DE CARACTERES, HASTA LA PALABRA "FIN" ESCRITO EN DIFERENTES FORMAS.
  SI LA CADENA ES DIFERENTE DE "FIN", CALCULA Y DESPLIEGA EL NUMERO DE CONSONANTES, VOCALES, DIGITOS DECIMALES
  , ESPACIOS EN BLANCO U OTROS.
 */
package cuentaelementos;

import java.util.Scanner;

/**
 *
 * @author Scrappy Doo Coco
 */
public class CuentaElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String Termina = "FIN";
        final String Vocales = "AEIOU";
        final String Consonantes = "BCDFGHJKLMNPQRSTVWXYZ";
        final String Digitos = "0123456789";
        String cad;
        int nv, nc, nd, no, lg, i;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Ingresar una cadena (salir = " + Termina + "): ");
            cad = sc.nextLine();
            if (cad.equalsIgnoreCase(Termina)) break;
            nv = 0; nc = 0; nd = 0; no = 0;
            lg = cad.length();
            // Analizar la cadena:
            for (i = 0; i < lg; i++) {
                //System.out.println();
                if (Vocales.indexOf(cad.toUpperCase().charAt(i)) >= 0)
                    nv ++;
                else if (Consonantes.indexOf(cad.toUpperCase().charAt(i)) >= 0)
                    nc ++;
                else if (Digitos.indexOf(cad.toUpperCase().charAt(i)) >= 0)
                    nd ++;
                else
                    no ++;
            }
            // Desplegar resultados:
            if (nc > 0)
                System.out.println("Consonantes ... " + nc);
            if (nv > 0)
                System.out.println("Vocales ....... " + nv);
            if (nd > 0)
                System.out.println("Digitos ....... " + nd);
            if (no > 0)
                System.out.println("Otros ......... " + no);
        }
    }
}

