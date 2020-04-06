package Clases;

import java.util.*;
/**
 *
 * @author Ademir
 */
//Jefferson Ademir Cruz Garcia - U20190249
//ING en D.S - POO
public class Mostrar {
   public static void main (String[]args){
        ClaseB Sumador = new ClaseA();
        Sumador.mostrar();
        ArrayList<CLASENUMERO> numeros = new ArrayList<>();
        numeros.add(new CLASENUMERO(20));
        numeros.add(new CLASENUMERO(18));
        numeros.add(new CLASENUMERO(5));
        numeros.add(new CLASENUMERO(42));
        numeros.add(new CLASENUMERO(36));
        
        Collections.sort(numeros);
        System.out.println("Números ordenados");
        for(CLASENUMERO i:numeros){
            System.out.println(i.numero);
        }
   }
}


