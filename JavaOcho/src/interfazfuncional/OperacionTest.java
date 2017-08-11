package interfazfuncional;

public class OperacionTest {
  
    
    public static double operar(double x, double y)
    {
        Operacion op = (double n1,double n2) -> n1 + n2;
        return op.calcular(x, y);
    }
    
    public static void main(String[] args) {
        double valor = OperacionTest.operar(10, 80);
        System.out.println("::: " + valor);
        
    }
}
