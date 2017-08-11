package set;

import java.util.HashSet;
import java.util.Set;

public class SetTest 
{
    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        lista.add("c");
        lista.add("b");
        lista.add("m");
        lista.add("c");
        lista.add("y");
        lista.add("a");
        lista.add("b");
        lista.add("z");
        lista.add("b");
        lista.add("a");
        lista.add("a");
        lista.add("a");
        lista.add("h");
        lista.add("c");
        
        for (String list : lista)
        {
           System.out.println(list); 
        }
        
    }
    
}
