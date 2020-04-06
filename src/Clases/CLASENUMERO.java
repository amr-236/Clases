package Clases;
/**     
 *
 * @author Ademir
 */
//Jefferson Ademir Cruz Garcia - U20190249
//ING en D.S - POO
public class CLASENUMERO extends ClaseA implements Comparable<CLASENUMERO>{
    public CLASENUMERO (int numero){
        this.numero=numero;
    }

    @Override
    public int compareTo(CLASENUMERO o) {
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
