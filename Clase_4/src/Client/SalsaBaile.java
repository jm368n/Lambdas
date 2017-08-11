package Client;

import java.util.Date;
import javax.swing.plaf.OptionPaneUI;
import personalexception.MiExcepcion;
public class SalsaBaile {
    
    public static void main(String[] args) throws MiExcepcion
    {
        try
        {
            SalsaBaile.validarEntrar("Pedro",17);
        }
        catch(MiExcepcion e)
                {
                    System.out.println("Eres Menor de Edad");
                    
                    
                }
    }
    public static boolean validarEntrar(String name, int edad) throws MiExcepcion
    {
        boolean esMayor=false;
        if (edad >=18)
        {
            esMayor=true;
            System.err.println("Bienvenido " + name);
        }
        else
        {
            throw new MiExcepcion("Eres Menor de EDAD");
            
        }
        return esMayor;
    }
    
  
}
