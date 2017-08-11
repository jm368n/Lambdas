package com.netec.test.varargs;

import java.util.Map;

public class Operaciones 
{
    public static void main(String... args) 
    {
       
        Operaciones op = new Operaciones();
        float promedio = op.promedio(3,4,5,6,7,8,9,7,9);
        System.out.println("Promedio: " + promedio);
        
        
        //-------------------
        
        Operaciones op2 = new Operaciones();
        op2.calcularCalificaciones("Jose", "Contador", 10, 9, 6, 10, 8);
    }
    public void calcularCalificaciones(String nombreAlumno, String carrera, int... calificaciones)
    {
        System.out.println("Alumnos: " + nombreAlumno);
        System.out.println("Carrera: " + carrera);
        System.out.println("Calificaciones: " + calificaciones);
        
        
        for (int calificacione : calificaciones)
        {
            System.out.println("Calificaciones: " + calificacione);
        }
    }
    
    public void calcularCalificaciones (Map<String, Integer> alumno)
    {
    }
    
    
    public float promedio(int...calificaciones)
    {
        int suma = 0;
        for (int calificacione : calificaciones) {
            suma += calificacione;
        }
        return ((float)suma / calificaciones.length);
    }
}
