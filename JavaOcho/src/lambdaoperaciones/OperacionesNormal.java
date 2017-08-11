package lambdaoperaciones;

public class OperacionesNormal {
    
    
    public void calcular()
    {
        Operacion operacion = (double x , double y) -> (x+y)/2;
        
        System.out.println(operacion.calcularpromedio(9, 8));
    }
    
    public static void main(String[] args) 
    {
        OperacionesNormal test = new OperacionesNormal();
        test.calcular();
    }
}
