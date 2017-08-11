
package clase_4;


public class Clase_4 {

    
    public static void main(String[] args) {

        int a=5;
        int b=0;
        
       // int division = a/b;
        
        String[] nombres = {"nombre 1", "nombre 2" , "nombre 3"};
        try
        {
        for(int i=0;i<3;i++)
        {
            System.out.println(nombres[i]);
        }
        }    
            
      /*  catch(ArithmeticException eArithmetic)
        {
            System.out.println("Fallo");        
            System.out.println(eArithmetic.getMessage());
            System.out.println(eArithmetic.getCause());
            eArithmetic.printStackTrace();
            
        }
       catch(ArrayIndexOutOfBoundsException eArray)
       {
            
       }
        */
        //Multi Catch
        
        catch( ArrayIndexOutOfBoundsException | ArithmeticException ExM)
        {
            
        }
        catch(Exception e)
        {
            System.out.println("Exception no esperada");
        }
        finally{
            System.out.println("Cerrando Recurso");
        }
        System.out.println("Programa Continua");
    }
    
}
