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
        ArrayList<Numero> numeros = new ArrayList<>();
        numeros.add(new Numero(20));
        numeros.add(new Numero(18));
        numeros.add(new Numero(5));
        numeros.add(new Numero(42));
        numeros.add(new Numero(36));
        
        Collections.sort(numeros);
        System.out.println("Números ordenados");
        for(Numero i:numeros){
            System.out.println(i.numero);
        }
   }
}


