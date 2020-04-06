package Clases;
/**     
 *
 * @author Ademir
 */
//Jefferson Ademir Cruz Garcia - U20190249
//ING en D.S - POO
public class Numero extends ClaseA implements Comparable<Numero>{
    public Numero (int numero){
        this.numero=numero;
    }

    @Override
    public int compareTo(Numero o) {
        if(numero==o.numero){
            return 0;
        }
        else if (numero>o.numero){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    public int numero;
}
