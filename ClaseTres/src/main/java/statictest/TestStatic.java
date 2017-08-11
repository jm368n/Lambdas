 
package statictest;

import com.netec.util.Herramientas;
import java.util.Date;
import static com.netec.util.Herramientas.getFecha;
import static java.lang.Math.*;



public class TestStatic
{
    private static final boolean [] switches = new boolean[5];
    
    //Bloque Estaticos sirve para incializar valores solo se ejecutan una vez cuando incia y no se vuelve a ejecutar
    
    static {
        System.out.println("Iniciando");
        for ( int i = 0; i<5 ; i++)
        {
            switches[i]=true;
        }
        
        
    }
    public static void main(String[] args)
    {
        
        Date fecha2 = getFecha("10/10/1990");
        
        Herramientas herramientas = new Herramientas();
        Date fecha;
        fecha = herramientas.getFecha("10/11/1990");
        
//        Date fecha = herramientas.getFecha("10/11/1990")
        System.out.println("Fecha : " + fecha);
        
        switches[1] =false;
            switches[1] = false;
            for(boolean swit:switches)
            {
                System.out.println(swit);
            }
        
    }
    
}
