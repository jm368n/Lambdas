
package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestGato {
    
    public static void main(String[] args) throws Exception
    {
        Gato benito = new Gato();
        benito.nombre = "Don Gato";
        benito.raza = "Otra Raza";
        
         /*
            FileOutputStream fm = new FileOutputStream("testSer.ser");
            ObjectOutputStream os = new ObjectOutputStream(fm);
            os.writeObject(benito);
            os.close();
            */
       try
       {
            FileInputStream fi = new FileInputStream("C:\\Users\\Cisco\\Desktop\\Practicas\\testSer.ser");
            ObjectInputStream obj = new ObjectInputStream(fi);          
                       
                Gato nuevoGato = (Gato) obj.readObject();
                obj.close();
            
                System.out.println(nuevoGato);
                       
       }
        catch (IOException ext)
        {
            ext.printStackTrace();
        }
        
    }
}
