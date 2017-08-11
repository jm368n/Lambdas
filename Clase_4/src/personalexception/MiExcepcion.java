package personalexception;

import java.util.Date;
import javax.swing.plaf.OptionPaneUI;

public class MiExcepcion extends Exception
{

    public MiExcepcion() {
    }

    public MiExcepcion(String string) {
        super(string);
    }

    public MiExcepcion(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MiExcepcion(Throwable thrwbl) {
        super(thrwbl);
    }

    public MiExcepcion(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    public MiExcepcion(int i, String eres_Menor_de_EDAD, Date date) {
            
    }
    
    public MiExcepcion(int i, String eres_Menor_de_EDAD) {
        
        
            
    }
    
}
