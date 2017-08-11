
package clase5;

import java.io.File;
import java.io.IOException;


public class Folders
{
    public static void main(String[] args) throws IOException {
        File Dir = new File ("C:\\Users\\Cisco\\Desktop\\Practicas\\LineaBlanca");
        Dir.mkdir();
        
        File miDir = new File("C:\\Users\\Cisco\\Desktop\\Practicas\\LineaBlanca\\venta 2017-10-10.txt");
        miDir.createNewFile();
        
     
    }
    
}
