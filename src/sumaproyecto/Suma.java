package sumaproyecto;

public class Suma {
    
    public static int Sumar(int ... nums){
        int acum=0;
        for (int num: nums){
            acum+=num;
        }
        return acum;
    }
    
}
