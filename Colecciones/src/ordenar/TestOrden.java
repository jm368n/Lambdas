
package ordenar;

import java.util.ArrayList;
import java.util.Collections;


public class TestOrden {
    
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
    
    alumno.nombre = "Felipe";
    alumno.edad = 25 ;
    
    Alumno alumno2 = new Alumno();
    alumno2.nombre = "Zenon";
    alumno2.edad = 30;
    
    Alumno alumno3 = new Alumno();
    alumno3.nombre = "Alan";
    alumno3.edad = 40;
    
    
    ArrayList<Alumno> alumnos = new ArrayList<>();
    alumnos.add(alumno);
    alumnos.add(alumno2);
    alumnos.add(alumno3);
    
    
    System.out.println("Sin Ordenar ");
        System.out.println(alumnos.toString());
    
    Collections.sort(alumnos);
    
    System.out.println("Lista ordenada");
    System.out.println(alumnos.toString());
    
    }
    
    
}
