package clase5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo2 
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Users\\Cisco\\Desktop\\Practicas\\Registro2.txt");
        try
        {
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(file);
            pw.print("Producto");
            pw.println("Precio: 10000");
            pw.flush();
            pw.close();
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String data = br.readLine();
            System.out.println(data);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
