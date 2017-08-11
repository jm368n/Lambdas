package clase5;


import com.sun.istack.internal.logging.Logger;
import static java.awt.PageAttributes.MediaType.C;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Archivos 
{
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {       
        File file = new File("C:\\Users\\Cisco\\Desktop\\Practicas\\Registro.txt");

        char[] in = new char[50];
        
        if (!file.exists())            
        {
            try
            {
                file.createNewFile();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("El Archivo ya Existe !!!");
        }
        try
        {
            FileWriter fw = new FileWriter(file);
            fw.write("Articulo: Television \r\n Precio: 50000");
            fw.flush();
            fw.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
        
//************* Lectura de Archivos ************
        
        FileReader fr = new FileReader(file);
        int size = fr.read(in);
        System.out.println(size + " ");
        for(char c : in)
        {
            System.out.println(c);
            fr.close();
        }
        
        
    }    
}
