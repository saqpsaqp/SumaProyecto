package sumaproyecto;

public class Suma {
    
    public static int Sumar(int ... nums){
        int acum1=0;
        for (int num: nums){
            acum1+=num;
        }
        return acum1;
    }
    
    public static double Sumar(double ... nums){
        double acum=0;
        for (double num: nums){
            acum+=num;
        }
        return acum;
    }   
}
