
package metodosdereferencia;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MetodoRef {
    
    public static void referenciarMetodosObjetos()
    {
        String[] nombres = {"Armando", "Zahori", "Gerardo"};
       /* Array.sort(nombres, new Comparator<String>())
          */
        
        //*************POR LAMBDAS ************
        Arrays.sort(nombres,(s1,s2) -> s1.compareTo(s2));
        
        //*************Metodos Referenciados ***
        Arrays.sort(nombres,String :: compareToIgnoreCase);
        
         for( String nombre : nombres)
        {
            System.out.println(nombre);
        }
        
    }
    
    public void referenciaMetodoParticular()
    {
        
    }
    
    public void referenciarConstructor()
    {
        IPersona iper = Persona::new;
        Persona per = iper.crear(1, "Manuel Manzo");
        
        System.out.println(per);
    }
    
    //************* MAIN ************
    
    public static void main(String[] args) {
        
       MetodoRef.referenciarMetodosObjetos();
       
       
    }
}
