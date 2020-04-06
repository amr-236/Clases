package Clases;
/**
 *
 * @author Ademir
 */
//Jefferson Ademir Cruz Garcia - U20190249
//ING en D.S - POO
public class ClaseA extends ClaseB {
 protected int X,Y;
  public ClaseA (){
        this(1,1,1);
    }
    public ClaseA(int z, int x, int y) {
        super(z);
        X=x;
        Y=y;
    }
  
    public int Sumero(){
    return Suma()+X+Y;
}
 @Override
    public void mostrar(){
    System.out.println("La suma es "+Sumero());
}


}