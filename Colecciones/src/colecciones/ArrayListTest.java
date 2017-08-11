package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) 
    {
       ArrayList<Persona> personas = new ArrayList<Persona>
                
       
               
               Persona pepe = new Persona();    
               
               
               
               Profesor profesor = new Profesor();               
               
               profesor.name="JOSE";
               profesor.firstName="Perez";
              
    
                       
                       /*
        persona.add(new Persona("Raul","Salazar"));
        persona.add(new Persona("Rosa","Ibiza"));
        */
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        arrayList.add(23);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(43);
        arrayList.add(1);
        arrayList.add(90);
        arrayList.add(66);
        arrayList.add(87);
        arrayList.add(69);
        
        System.out.println("Sin Ordenar: " + arrayList);
        Collections.sort(arrayList);                
        System.out.println("Ordenado: " + arrayList);
                
        
        for (Object persona : personas)
        {
            System.out.println(persona); 
        }
     
        //
        
        Iterator iterar = personas.iterator();

        while(iterar.hasNext())
        {
            System.out.println(iterar.next());
        }
        
    }
    
}
